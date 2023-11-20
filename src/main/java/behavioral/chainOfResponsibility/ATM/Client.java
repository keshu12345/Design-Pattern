package behavioral.chainOfResponsibility.ATM;

import behavioral.chainOfResponsibility.ATM.impl.FiveHundredsNotesDispenser;
import behavioral.chainOfResponsibility.ATM.impl.HundredNoteDispenser;
import behavioral.chainOfResponsibility.ATM.impl.OneThousandNotesDispenser;
import behavioral.chainOfResponsibility.ATM.impl.TwoHundredNotesDispenser;

public class Client {
    public static void main(String[] args) {
        ATMHandler oneThousandHandler=new OneThousandNotesDispenser();
        ATMHandler hundredHandler=new HundredNoteDispenser();
        ATMHandler twoHundredsHandler=new TwoHundredNotesDispenser();
        ATMHandler fiveHundredHandler=new FiveHundredsNotesDispenser();

        oneThousandHandler.setNextNotesHandler(fiveHundredHandler);
        fiveHundredHandler.setNextNotesHandler(twoHundredsHandler);
        twoHundredsHandler.setNextNotesHandler(hundredHandler);
        hundredHandler.setNextNotesHandler(null);
        int amount=500000;
        oneThousandHandler.processWithdrawal(amount);

    }
}
