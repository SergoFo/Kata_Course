package pz_3_2_4__getCreditForClient;

public class Test {
    public static void main(String[] args) throws BadCreditHistoryException, ProblemWithLawException {
        BankClient client1 = new BankClient("Good");
        BankClient client2 = new BankClient("Проблемы с законом");
        BankClient client3 = new BankClient("Проблемы с банковской историей");
        BankRabotnik employee = new BankRabotnik();

        System.out.println(getCreditForClient(employee, client1) + "\n"); //true

        System.out.println(getCreditForClient(employee, client2) + "\n"); //false

        System.out.println(getCreditForClient(employee, client3) + "\n"); // "Проблемы с банковской историей" false
    }

    public static boolean getCreditForClient(BankWorker bankWorker, BankClient bankClient) throws ProblemWithLawException, BadCreditHistoryException {
        try {
            return bankWorker.checkClientForCredit(bankClient);
        } catch (BadCreditHistoryException e) {
            System.out.println("Проблемы с банковской историей");
            return false;
        } catch (ProblemWithLawException e) {
            return false;
        }
    }
}
