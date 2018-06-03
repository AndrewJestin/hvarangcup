package additional;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static main.adminscreen.*;
import static main.mainform.btm;
import static main.mainscreen.*;


public class penaltyblue implements ActionListener {


    public void actionPerformed(ActionEvent e) {

        bpen++;
        bpenal = bpen;

        amountb--;
        amountbt--;
        amountb2--;
        amountb2t--;
        amountb3--;
        amountb3t--;
        amountb4--;
        amountb4t--;

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

    String[] str8 = new String[5];
    str8[0] = "Referee";
    str8[1] = round.getText();
    str8[2] = lbltimer.getText();
    str8[3] = " Penalty(-1 point) Blue";
    str8[4] = rcompetitor.getText()+" " +rtotal.getText()+":" + btotal.getText()+" "+ bcompetitor.getText();
        btm.addDate(str8);
        btm.fireTableDataChanged();

}

}