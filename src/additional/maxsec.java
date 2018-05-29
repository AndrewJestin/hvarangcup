package additional;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static main.adminscreen.*;
import static main.adminscreen.lbltimer;
import static main.adminscreen.tmaxmin;
import static main.mainscreen.lbltimer1;


public class maxsec implements ActionListener {



    public void actionPerformed(ActionEvent event) {

        if (event.getActionCommand().equals("+")) {
            tmaxsec++;
            timmaxsec.setText(String.valueOf(tmaxsec));

        }
        if (event.getActionCommand().equals("-")) {

            tmaxsec--;
          //  System.out.println(tmaxsec);
            timmaxsec.setText(String.valueOf(tmaxsec));

        }
        if (event.getActionCommand().equals("-")&& tmaxsec<0){
            tmaxsec =59;
        timmaxsec.setText(String.valueOf(tmaxsec));
      //  System.out.println(tmaxsec);
    }
        if (event.getActionCommand().equals("+")&& tmaxsec>59){
            tmaxsec =0;
            timmaxsec.setText(String.valueOf(tmaxsec));
           // System.out.println(tmaxsec);
        }
    }

}