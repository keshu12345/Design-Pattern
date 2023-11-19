package ATM.impl;

import ATM.ATMHandler;

public class FiveHundredsNotesDispenser implements ATMHandler {
    private ATMHandler nextATMHandler;
    @Override
    public void setNextNotesHandler(ATMHandler nextATMHandler) {
        this.nextATMHandler=nextATMHandler;

    }
    @Override
    public void processWithdrawal(Integer amount) {
        if(amount>=500){
            int countsOfFiveHundredNotes=amount/500;
            int remainingAmount=amount%500;
            if(countsOfFiveHundredNotes>4){
                remainingAmount=remainingAmount+(countsOfFiveHundredNotes-5)*500;
                countsOfFiveHundredNotes=5;
            }
            System.out.println("Dispensing " + countsOfFiveHundredNotes + " Rs.500 notes");
            if(remainingAmount!=0&&nextATMHandler!=null){
                nextATMHandler.processWithdrawal(remainingAmount);
            }
        } else if (nextATMHandler!=null) {
            nextATMHandler.processWithdrawal(amount);
        }else{
            System.out.println("Cannot process this withdrawal");
        }

    }
}
