package additional;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static main.adminscreen.*;
import static main.mainform.btm;
import static main.mainscreen.*;


public class penaltyminusblue implements ActionListener  {


    public void actionPerformed(ActionEvent e) {


        bpen--;
        bpenal = bpen;

        bglobal++;
        btotal.setText(String.valueOf(bglobal));
        bpenalty11.setText(String.valueOf(bpen));
        bpenalty.setText(String.valueOf(bpen));
        String[] str9 = new String[5];
        str9[0] = "Referee";
        str9[1] = round.getText();
        str9[2] = lbltimer.getText();
        str9[3] = "Penalty Blue, Removed";
        str9[4] = rcompetitor.getText()+" " +rtotal.getText()+":" + btotal.getText()+" "+ bcompetitor.getText();
        btm.addDate(str9);
        btm.fireTableDataChanged();

    }
}
