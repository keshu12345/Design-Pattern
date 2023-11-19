package ATM;

public interface ATMHandler {
    void setNextNotesHandler(ATMHandler atmHandler);
    void processWithdrawal(Integer amount);
}
