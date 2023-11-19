package ATM;

import ATM.impl.FiveHundredsNotesDispenser;
import ATM.impl.HundredNoteDispenser;
import ATM.impl.OneThousandNotesDispenser;
import ATM.impl.TwoHundredNotesDispenser;

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
