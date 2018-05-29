package additional;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static main.adminscreen.lblMatchNo1;
import static main.adminscreen.matchno1;
import static main.mainscreen.lblMatchNo;


public class maxmatch implements ActionListener {



    public void actionPerformed(ActionEvent event) {

        if (event.getActionCommand().equals("+")) {
            matchno1++;
            lblMatchNo1.setText(String.valueOf(matchno1));
            lblMatchNo.setText(String.valueOf(matchno1));
           // System.out.println(matchnos);
            System.out.println(matchno1);

        }
        if (event.getActionCommand().equals("-")) {

            matchno1--;
            // System.out.println(tmaxmin);
            lblMatchNo1.setText(String.valueOf(matchno1));
            lblMatchNo.setText(String.valueOf(matchno1));
            System.out.println(matchno1);
        }
        if (event.getActionCommand().equals("-")&& matchno1<0)
            matchno1 = 0;
        lblMatchNo1.setText(String.valueOf(matchno1));
        lblMatchNo.setText(String.valueOf(matchno1));
        // System.out.println(tmaxmin);
    }
}