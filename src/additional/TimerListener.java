package additional;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static main.adminscreen.*;
import static main.mainscreen.*;


public class TimerListener implements ActionListener {




    //    int min =0;
    public void actionPerformed(ActionEvent event) {
        if (br == 60) {
            br=59;
        }
        count--;
        brkcount--;

        lbltimer.setText("0" + min + ":0" + count);
        lbltimer1.setText("0" + min + ":0" + count);
      //  round.setVisible(true);
        if (brk ==0){
            lbltimer1.setForeground(Color.white);
        }
        if (brk ==1){
            lbltimer1.setForeground(Color.yellow);
        }


        if (count == -1 && min != 0 && brk == 0) {
           // lbltimer.setText("0" + min + ":000" + tmaxsec);
            count = 59;
            min--;
            round1.setText("" + rndnum);
            round.setText("ROUND : " + rndnum);

          //  lbltimer.setText("0" + min + ":0" + tmaxsec);
          //  lbltimer1.setText("0" + min + ":0" + tmaxsec);

        }
        if (count < 10 && brk == 0) {
            round1.setText("" + rndnum);
            round.setText("ROUND : " + rndnum);
            lbltimer.setText("0" + min + ":0" + count);
            lbltimer1.setText("0" + min + ":0" + count);



        }
        if (count >9 && brk == 0) {
            round1.setText("" + rndnum);
            round.setText("ROUND : " + rndnum);
            lbltimer.setText("0" + min + ":" + count);
            lbltimer1.setText("0" + min + ":" + count);


        }

        if (min == 0 && count == 0) {
   sound.playSound("sounds/start2s.wav");
        }

        if (min == 0 && count == -1) {

          brkcount=br;
           // min = 0;
            brk = 1;
            lbltimer1.setForeground(Color.yellow);
            round1.setText("--");
            round.setText("BREAK");


                if (count < 10 && brk == 0){
                    lbltimer.setText("0" + min + ":0" + count);
                lbltimer1.setText("0" + min + ":0" + count);
        //        sound.playSound("sounds/start2s.wav").join();
            }

                if (count > 9 && brk == 0){
                    lbltimer.setText("0" + min + ":" + count);
                lbltimer1.setText("0" + min + ":" + count);

            }


            if (rndnum == tmaxround) {
                round.setText("FINISHED");
                round.setVisible(false);
                lbltimer.setText("TIME!");
                lbltimer1.setText("TIME!");
                timer.stop();
            }


        }


        if (round.getText().equals("BREAK") && brkcount < 10) {
            round1.setText("--");
            round.setText("BREAK");
            lbltimer.setText("0" + min + ":0" + brkcount);
            lbltimer1.setText("0" + min + ":0" + brkcount);


        }
        if (round.getText().equals("BREAK") && brkcount > 9) {
            round1.setText("--");
            round.setText("BREAK");
            lbltimer.setText("0" + min + ":" + brkcount);
            lbltimer1.setText("0" + min + ":" + brkcount);


        }


        if (brk == 1 && brkcount == -1) {
            lbltimer1.setForeground(Color.white);

            count = tmaxsec;
            min = tmaxmin;
            rndnum++;
           round1.setText(rndnum+"");
            round.setText("ROUND : " + rndnum);


          sound.playSound("sounds/start2s.wav").join();
            brk = 0;

                if (count < 10 && brk == 0){
                    lbltimer.setText("0" + min + ":0" + count);
                lbltimer1.setText("0" + min + ":0" + count);
             System.out.println(count);

            }

                if (count > 9 && brk == 0){
                    lbltimer.setText("0" + min + ":" + count);
                lbltimer1.setText("0" + min + ":" + count);


            }


        }
        if (rndnum == 1 && bbelts.isSelected()) {

            lblrnd2.setVisible(false);
            // rnd2red.setEnabled(false);
            //  rnd2blue.setEnabled(false);
            rnd2red.setVisible(false);
            rnd2blue.setVisible(false);

        }
        else if (rndnum==2 && bbelts.isSelected()){
            rnd1red.setEnabled(false);
            rnd1blue.setEnabled(false);
            rnd2red.setVisible(true);
            rnd2blue.setVisible(true);
            lblrnd2.setVisible(true);
        }
    }
}