package pz_3_2_4__getCreditForClient;

public class BankRabotnik implements BankWorker {

    @Override
    public boolean checkClientForCredit(BankClient bankClient) throws BadCreditHistoryException, ProblemWithLawException {
        if (bankClient.status.equals("Проблемы с банковской историей")) {
            throw new BadCreditHistoryException();
        } else if (bankClient.status.equals("Проблемы с законом")) {
            throw new ProblemWithLawException();
        }
        return true;
    }
}

