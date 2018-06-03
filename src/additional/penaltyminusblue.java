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

        if (bpen < 0){
            bpen =0;
        }
        else {
            amountb++;
            amountbt++;
            amountb2++;
            amountb2t++;
            amountb3++;
            amountb3t++;
            amountb4++;
            amountb4t++;

            ab=amountb;
            ab2=amountb2t;
            ab3=amountb3t;
            ab4=amountb4t;
            bs11.setText(String.valueOf(amountb));
            bs11t.setText(String.valueOf(amountb));
            bs22.setText(String.valueOf(amountb2));
            bs22t.setText(String.valueOf(amountb2t));
            bs33.setText(String.valueOf(amountb3));
            bs33t.setText(String.valueOf(amountb3t));
            bs44.setText(String.valueOf(amountb4));
            bs44t.setText(String.valueOf(amountb4t));
            labelcolor a = new labelcolor();
            a.colorL(ab,ab2,ab3,ab4);

            bpenalty11.setText(String.valueOf(bpen));
            bpenalty.setText(String.valueOf(bpen));
            bpenalty11.setText(String.valueOf(bpen));
            bpenalty.setText(String.valueOf(bpen));
            String[] str9 = new String[5];
            str9[0] = "Referee";
            str9[1] = round.getText();
            str9[2] = lbltimer.getText();
            str9[3] = "Penalty Blue, Removed";
            str9[4] = rcompetitor.getText() + " " + rtotal.getText() + ":" + btotal.getText() + " " + bcompetitor.getText();
            btm.addDate(str9);
            btm.fireTableDataChanged();
        }
    }
}
