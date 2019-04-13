package additional;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static main.adminscreen.*;
import static main.mainform.btm;
import static main.mainscreen.*;


public class warningblueminus implements ActionListener {



    public void actionPerformed(ActionEvent e) {


        bwarning--;
        wb = bwarning;


        System.out.println(round.getText()+". Время - "+min+":"+count+" Чуй синему снят обратно ");
        if (wb < 0) {
            wb = 0;
            bwarning++;
            bwarnings.setText(String.valueOf(bwarning));
            bwarnings1.setText(String.valueOf(bwarning));
        }
        if (wb == 2 || wb==5 || wb==8 || wb == 11|| wb==14 || wb==17||wb == 20 || wb==23 || wb==26){
            amountb++;
            amountbt++;
            amountb2++;
            amountb2t++;
            amountb3++;
            amountb3t++;

            ab=amountb;
            ab2=amountb2t;
            ab3=amountb3t;

            bs11.setText(String.valueOf(amountb));
            bs11t.setText(String.valueOf(amountb));
            bs22.setText(String.valueOf(amountb2));
            bs22t.setText(String.valueOf(amountb2t));
            bs33.setText(String.valueOf(amountb3));
            bs33t.setText(String.valueOf(amountb3t));

            labelcolor a = new labelcolor();
            a.colorL(ab,ab2,ab3);
    }

      //  System.out.println(wb);
        bwarnings.setText(String.valueOf(bwarning));
        bwarnings1.setText(String.valueOf(bwarning));

        String[] str4 = new String[5];
        str4[0] = "Referee";
        str4[1] = roundt.getText();
        str4[2] = lbltimer.getText();
        str4[3] = " Warning Blue, Removed";
        str4[4] = rcompetitor.getText()+" " +rtotal.getText()+":" + btotal.getText()+" "+ bcompetitor.getText();
        btm.addDate(str4);
        btm.fireTableDataChanged();



    }
}
