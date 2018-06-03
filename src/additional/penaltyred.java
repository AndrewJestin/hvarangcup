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
        amount--;
        amountt--;
        amount2--;
        amount2t--;
        amount3--;
        amount3t--;
        amount4--;
        amount4t--;

        ar=amountt;
        ar2=amount2t;
        ar3=amount3t;
        ar4=amount4t;
        rs11.setText(String.valueOf(amount));
        rs11t.setText(String.valueOf(amountt));
        rs22.setText(String.valueOf(amount2));
        rs22t.setText(String.valueOf(amount2t));
        rs33.setText(String.valueOf(amount3));
        rs33t.setText(String.valueOf(amount3t));
        rs44.setText(String.valueOf(amount4));
        rs44t.setText(String.valueOf(amount4t));
        labelcolor2 a = new labelcolor2();
        a.colorL(ar,ar2,ar3,ar4);
        //rglobal--;

       // rtotal.setText(String.valueOf(rglobal));
       // rtotal1.setText(String.valueOf(rglobal));

      //  System.out.println(rpenal);
        rpenalty11.setText(String.valueOf(rpen));
        rpenalty.setText(String.valueOf(rpen));

        String[] str7 = new String[5];
        str7[0] = "Referee";
        str7[1] = roundt.getText();
        str7[2] = lbltimer.getText();
        str7[3] = " Penalty(-1 point) Red";
        str7[4] = rcompetitor.getText()+" " +rtotal.getText()+":" + btotal.getText()+" "+ bcompetitor.getText();
        btm.addDate(str7);
        btm.fireTableDataChanged();
    }
}