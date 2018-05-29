package additional;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static main.adminscreen.*;
import static main.mainform.btm;
import static main.mainscreen.*;


public class penaltyred implements ActionListener {


    public void actionPerformed(ActionEvent e) {

        rpen++;
        rpenal = rpen;
        rglobal--;
        rtotal.setText(String.valueOf(rglobal));
        rtotal1.setText(String.valueOf(rglobal));

      //  System.out.println(rpenal);
        rpenalty11.setText(String.valueOf(rpen));
        rpenalty.setText(String.valueOf(rpen));

        String[] str7 = new String[5];
        str7[0] = "Referee";
        str7[1] = round.getText();
        str7[2] = lbltimer.getText();
        str7[3] = " Penalty(-1 point) Red";
        str7[4] = rcompetitor.getText()+" " +rtotal.getText()+":" + btotal.getText()+" "+ bcompetitor.getText();
        btm.addDate(str7);
        btm.fireTableDataChanged();
    }
}