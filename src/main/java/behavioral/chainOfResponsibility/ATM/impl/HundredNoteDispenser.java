package behavioral.chainOfResponsibility.ATM.impl;

import behavioral.chainOfResponsibility.ATM.ATMHandler;

public class HundredNoteDispenser implements ATMHandler {
    private ATMHandler nextATMHandler;
    @Override
    public void setNextNotesHandler(ATMHandler atmHandler) {
        this.nextATMHandler=atmHandler;

    }
    @Override
    public void processWithdrawal(Integer amount) {

        if(amount>=100){
            int countsOfHundredNotes=amount/100;
            int remainingAmount=amount%100;
            if(countsOfHundredNotes>5){

                remainingAmount=remainingAmount+(countsOfHundredNotes-5)*100;
                countsOfHundredNotes=5;
            }
            System.out.println("Dispensing " + countsOfHundredNotes + " Rs.100 notes");
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
