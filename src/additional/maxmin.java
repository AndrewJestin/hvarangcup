package additional;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static main.adminscreen.*;
import static main.adminscreen.count;
import static main.adminscreen.min;
import static main.mainscreen.lbltimer1;


public class maxmin implements ActionListener {



    public void actionPerformed(ActionEvent event) {


        if (event.getActionCommand().equals("+")) {
            tmaxmin++;
            timmaxmin.setText(String.valueOf(tmaxmin));



        }

        if (event.getActionCommand().equals("-")) {

            tmaxmin--;
           // System.out.println(tmaxmin);
            timmaxmin.setText(String.valueOf(tmaxmin));


        }
        if (event.getActionCommand().equals("-")&& tmaxmin<0)
            tmaxmin =0;
        timmaxmin.setText(String.valueOf(tmaxmin));

       // System.out.println(tmaxmin);
    }}