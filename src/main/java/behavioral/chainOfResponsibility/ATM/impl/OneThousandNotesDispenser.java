package behavioral.chainOfResponsibility.ATM.impl;

import behavioral.chainOfResponsibility.ATM.ATMHandler;

public class OneThousandNotesDispenser implements ATMHandler {
    private ATMHandler nextATMHandler;
    @Override
    public void setNextNotesHandler(ATMHandler nextATMHandler) {
        this.nextATMHandler=nextATMHandler;
    }

    @Override
    public void processWithdrawal(Integer amount) {

        if(amount>=1000){
            int countsOfHundredNotes=amount/1000;
            int remainingAmount=amount%1000;
            System.out.println("Dispensing " + countsOfHundredNotes + " Rs.1000 notes");
            if(remainingAmount!=0&&nextATMHandler!=null){
                nextATMHandler.processWithdrawal(remainingAmount);
            }
        }else if(nextATMHandler!=null){
            nextATMHandler.processWithdrawal(amount);
        }else{
            System.out.println("Cannot process this withdrawal");
        }

    }
}
