package additional;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static main.adminscreen.*;
import static main.mainform.btm;
import static main.mainscreen.*;


public class penaltyminusred implements ActionListener  {


    public void actionPerformed(ActionEvent e) {

        rpen--;
        rpenal = rpen;
        rglobal++;
        rtotal.setText(String.valueOf(rglobal));
        rpenalty11.setText(String.valueOf(rpen));
        rpenalty.setText(String.valueOf(rpen));


        String[] str6 = new String[5];
        str6[0] = "Referee";
        str6[1] = round.getText();
        str6[2] = lbltimer.getText();
        str6[3] = " Penalty Red,Removed";
        str6[4] = rcompetitor.getText()+" " +rtotal.getText()+":" + btotal.getText()+" "+ bcompetitor.getText();
        btm.addDate(str6);
        btm.fireTableDataChanged();
    }
}
