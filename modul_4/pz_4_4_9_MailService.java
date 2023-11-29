import java.util.logging.Logger;

public class pz_4_4_9_MailService {

public static final String AUSTIN_POWERS = "Austin Powers";

public static final String WEAPONS = "weapons";

public static final String BANNED_SUBSTANCE = "banned substance";

public static void main(String[] args) {
    MailService spy = new Spy(Logger.getLogger(Class.class.getName()));
    MailService thief = new Thief(10);
    MailService inspector = new Inspector();
    MailService[] msArray = {spy, thief, inspector};
    MailMessage mail1 = new MailMessage("Romeo", "Juliet", "I love you!");
    MailMessage mail2 = new MailMessage("Austin Powers", "James Bond", "Big secret!");
    MailPackage mail3 = new MailPackage("Romeo", "Juliet", new Package("Flowers", 15));
    MailPackage mail4 = new MailPackage("Romeo", "Juliet", new Package("Flowers", 25));
    MailPackage mail5 = new MailPackage("Austin Powers", "James Bond", new Package("weapons", 5));

    UntrustworthyMailWorker umw = new UntrustworthyMailWorker(msArray);
    try {
        umw.processMail(mail1);
    } catch (RuntimeException re) {
        System.out.println(re.getMessage());
    }
    try {
        umw.processMail(mail2);
    } catch (RuntimeException re) {
        System.out.println(re.getMessage());
    }
    try {
        umw.processMail(mail3);
    } catch (RuntimeException re) {
        System.out.println(re.getMessage());
    }
    try {
        umw.processMail(mail4);
    } catch (RuntimeException re) {
        System.out.println(re.getMessage());
    }
    try {
        umw.processMail(mail5);
    } catch (RuntimeException re) {
        System.out.println(re.getMessage());
    }

    System.out.println("Thief have stolen $" + ((Thief) thief).getStolenValue() + "!");
}


/*
Интерфейс: сущность, которую можно отправить по почте.
У такой сущности можно получить от кого и кому направляется письмо.
*/
public static interface Sendable {
    String getFrom();

    String getTo();
}

/*
Абстрактный класс,который позволяет абстрагировать логику хранения
источника и получателя письма в соответствующих полях класса.
*/
public static abstract class AbstractSendable implements Sendable {

    protected final String from;
    protected final String to;

    public AbstractSendable(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public String getFrom() {
        return from;
    }

    @Override
    public String getTo() {
        return to;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AbstractSendable that = (AbstractSendable) o;

        if (!from.equals(that.from)) return false;
        if (!to.equals(that.to)) return false;

        return true;
    }

}


/*
Письмо, у которого есть текст, который можно получить с помощью метода `getMessage`
*/
public static class MailMessage extends AbstractSendable {

    private final String message;

    public MailMessage(String from, String to, String message) {
        super(from, to);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        MailMessage that = (MailMessage) o;

        if (message != null ? !message.equals(that.message) : that.message != null) return false;

        return true;
    }

}

/*
Посылка, содержимое которой можно получить с помощью метода `getContent`
*/
public static class MailPackage extends AbstractSendable {
    private final Package content;

    public MailPackage(String from, String to, Package content) {
        super(from, to);
        this.content = content;
    }

    public Package getContent() {
        return content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        MailPackage that = (MailPackage) o;

        if (!content.equals(that.content)) return false;

        return true;
    }

}

/*
Класс, который задает посылку. У посылки есть текстовое описание содержимого и целочисленная ценность.
*/
public static class Package {
    private final String content;
    private final int price;

    public Package(String content, int price) {
        this.content = content;
        this.price = price;
    }

    public String getContent() {
        return content;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Package aPackage = (Package) o;

        if (price != aPackage.price) return false;
        if (!content.equals(aPackage.content)) return false;

        return true;
    }
}

/*
Интерфейс, который задает класс, который может каким-либо образом обработать почтовый объект.
*/
public static interface MailService {
    Sendable processMail(Sendable mail);
}

/*
Класс, в котором скрыта логика настоящей почты
*/
public static class RealMailService implements MailService {

    @Override
    public Sendable processMail(Sendable mail) {
        // Здесь описан код настоящей системы отправки почты.
        return mail;
    }
}


public static class UntrustworthyMailWorker implements MailService {
    private final RealMailService realMailService = new RealMailService();
    private MailService[] mailServices;

    public UntrustworthyMailWorker(MailService[] services) {
        mailServices = services;
    }

    public MailService getRealMailService() {
        return realMailService;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        Sendable processed = mail;
        for (int i = 0; i < mailServices.length; i++) {
            processed = mailServices[i].processMail(processed);
        }
        return realMailService.processMail(processed);
    }
}

public static class Spy implements MailService {
    private Logger logger;

    public Spy(Logger logger) {
        this.logger = logger;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail.getClass() == MailMessage.class) {
            MailMessage mailMessage = (MailMessage) mail;
            String from = mailMessage.getFrom();
            String to = mailMessage.getTo();
            if (from.equals(AUSTIN_POWERS) || to.equals(AUSTIN_POWERS)) {
                logger.warning("Detected target mail correspondence: from " + from + " to " + to + " \"" + mailMessage.getMessage() + "\"");
            } else {
                logger.info("Usual correspondence: from " + from + " to " + to + "");
            }
        }
        return mail;
    }
}

public static class Thief implements MailService {
    private int minPrice = 0;
    private int stolenPrice = 0;

    public Thief(int minPrice) {
        this.minPrice = minPrice;
    }

    public int getStolenValue() {
        return stolenPrice;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail.getClass() == MailPackage.class) {
            Package pac = ((MailPackage) mail).getContent();
            if (pac.getPrice() >= minPrice) {
                stolenPrice += pac.getPrice();
                mail = new MailPackage(mail.getFrom(), mail.getTo(), new Package("stones instead of " + pac.getContent(), 0));
            }
        }
        return mail;
    }
}

public static class IllegalPackageException extends RuntimeException {

}

public static class StolenPackageException extends RuntimeException {
}

public static class Inspector implements MailService {
    @Override
    public Sendable processMail(Sendable mail) {
        if (mail.getClass() == MailPackage.class) {
            Package pac = ((MailPackage) mail).getContent();
            String content = pac.getContent();
            if (content.indexOf("stones instead of ") == 0) {
                throw new StolenPackageException();
            } else if (content.contains(WEAPONS) || content.contains(BANNED_SUBSTANCE)) {
                throw new IllegalPackageException();
            }
        }
        return mail;
    }
}
}
