package behavioral.chainOfResponsibility.ATM.impl;

import behavioral.chainOfResponsibility.ATM.ATMHandler;

public class TwoHundredNotesDispenser implements ATMHandler {
    private ATMHandler nextATMHandler;
    @Override
    public void setNextNotesHandler(ATMHandler nextATMHandler) {
        this.nextATMHandler=nextATMHandler;
    }

    @Override
    public void processWithdrawal(Integer amount) {
        if(amount>=200){
            int countsOfTwoHundredNotes=amount/200;
            int remainingAmount=amount%200;
            if(countsOfTwoHundredNotes>5){
                remainingAmount=remainingAmount+(countsOfTwoHundredNotes-5)*200;
                countsOfTwoHundredNotes=5;
            }
            System.out.println("Dispensing " + countsOfTwoHundredNotes + " Rs.200 notes");
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
