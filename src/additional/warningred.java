package additional;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static main.adminscreen.*;
import static main.mainform.btm;
import static main.mainscreen.*;


public class warningred implements ActionListener {



    public void actionPerformed(ActionEvent e) {

        rwarning++;
        wr = rwarning;

        System.out.println(round.getText()+". Время - "+min+":"+count+" Чуй красному ");

        if (wr < 0) {
            wr = 0;
            rwarning++;
            rwarnings.setText(String.valueOf(rwarning));
            rwarnings1.setText(String.valueOf(rwarning));
        }
        if (wr % 3 == 0) {
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
    }
      //  System.out.println(wr);
        rwarnings.setText(String.valueOf(rwarning));
        rwarnings1.setText(String.valueOf(rwarning));


        String[] str1 = new String[5];
        str1[0] = "Referee";
        str1[1] = round.getText();
        str1[2] = lbltimer.getText();
        str1[3] = " Warning Red";
        str1[4] = rcompetitor.getText()+" " +rtotal.getText()+":" + btotal.getText()+" "+ bcompetitor.getText();
        btm.addDate(str1);
        btm.fireTableDataChanged();

    }
}
