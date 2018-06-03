package additional;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static main.adminscreen.*;
import static main.mainform.btm;
import static main.mainscreen.*;


public class warningredminus implements ActionListener {



    public void actionPerformed(ActionEvent e) {


        rwarning--;

        wr=rwarning;

        if (wr <0){
            wr=0;
            rwarning++;
            rwarnings.setText(String.valueOf(rwarning));
            rwarnings1.setText(String.valueOf(rwarning));
        }
        if (wr == 2 || wr==5 || wr==8 || wr == 11|| wr==14 || wr==17||wr == 20 || wr==23 || wr==26){
            amount++;
            amountt++;
            amount2++;
            amount2t++;
            amount3++;
            amount3t++;
            amount4++;
            amount4t++;

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
            rpenalty11.setText(String.valueOf(rpen));
            rpenalty.setText(String.valueOf(rpen));
        }

      //  System.out.println(wr);
        rwarnings.setText(String.valueOf(rwarning));
        rwarnings1.setText(String.valueOf(rwarning));

        String[] str5 = new String[5];
        str5[0] = "Referee";
        str5[1] = round.getText();
        str5[2] = lbltimer.getText();
        str5[3] = " Warning Red,Removed";
        str5[4] = rcompetitor.getText()+" " +rtotal.getText()+":" + btotal.getText()+" "+ bcompetitor.getText();
        btm.addDate(str5);
        btm.fireTableDataChanged();


    }
}
