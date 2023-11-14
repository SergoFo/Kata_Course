package pz_3_2_4__getCreditForClient;

public interface BankWorker {
    boolean checkClientForCredit(BankClient client) throws BadCreditHistoryException, ProblemWithLawException;
}
