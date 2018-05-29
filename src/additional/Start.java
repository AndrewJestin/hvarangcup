package additional;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import static main.adminscreen.*;


public  class Start implements ActionListener {

int min =0;
int brk=0;

    public void actionPerformed(ActionEvent b) {

//if (startstop==1)
//    {startstop=2;}
//    if (startstop==2){
//    startstop=1;
//    }

        Timer t = new Timer(1000, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                count++;

                lbltimer.setText("0" + min + ":" + count);
                if (count < 10) {
                    lbltimer.setText("0" + min + ":0" + count);
                }
                if (count == 60 && min != 2) {
                    count = 0;
                    min++;
                    lbltimer.setText("0" + min + ":0" + count);
                }
                if (min == 2) {
                    count = 0;
                    min = 0;
                    rndnum++;
                    round1.setText(rndnum + "");
                    lbltimer.setText("0" + min + ":0" + count);


                }
            }




        });

        if (startstop==1){t.start();
           }
   if (startstop==2){
         t.setDelay(0);
    }
}}
