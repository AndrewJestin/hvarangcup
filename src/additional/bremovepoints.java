package additional;



        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

        import static main.adminscreen.*;
        import static main.mainform.btm;
        import static main.mainscreen.*;


public class bremovepoints implements ActionListener {


    public void actionPerformed(ActionEvent e) {

        baddpoint--;


        if (baddpoint < 0) {
            baddpoint = 0;
        } else {
        amountb--;
        amountbt--;
        amountb2--;
        amountb2t--;
        amountb3--;
        amountb3t--;
        amountb4--;
        amountb4t--;

        ab=amountbt;
        ab2=amountb2t;
        ab3=amountb3t;
        ab4=amountb4t;
        bs11.setText(String.valueOf(amountb));
        bs11t.setText(String.valueOf(amountbt));
        bs22.setText(String.valueOf(amountb2));
        bs22t.setText(String.valueOf(amountb2t));
        bs33.setText(String.valueOf(amountb3));
        bs33t.setText(String.valueOf(amountb3t));
        bs44.setText(String.valueOf(amountb4));
        bs44t.setText(String.valueOf(amountb4t));
        labelcolor2 a = new labelcolor2();
        a.colorL(ab,ab2,ab3,ab4);
        bs5.setText(String.valueOf(baddpoint));
        //rpenalty.setText(String.valueOf(rpen));


        String[] str6 = new String[5];
        str6[0] = "Referee";
        str6[1] = roundt.getText();
        str6[2] = lbltimer.getText();
        str6[3] = "  Blue,1 point Removed";
        str6[4] = rcompetitor.getText() + " " + rtotal.getText() + ":" + btotal.getText() + " " + bcompetitor.getText();
        btm.addDate(str6);
        btm.fireTableDataChanged();
         }
    }
}
