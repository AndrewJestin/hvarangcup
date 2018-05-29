package additional;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static main.adminscreen.timmaxround;
import static main.adminscreen.tmaxround;


public class maxrnd implements ActionListener {



    public void actionPerformed(ActionEvent event) {

        if (event.getActionCommand().equals("+")) {
           tmaxround++;
            timmaxround.setText(String.valueOf(tmaxround));
//System.out.println(tmaxround);
        }
        if (event.getActionCommand().equals("-")) {

            tmaxround--;
         //   System.out.println(tmaxround);
            timmaxround.setText(String.valueOf(tmaxround));
        }
        if (event.getActionCommand().equals("-")&& tmaxround==0)
            tmaxround =1;
        timmaxround.setText(String.valueOf(tmaxround));
       // System.out.println(tmaxround);
    }}