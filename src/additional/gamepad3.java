package additional;

import org.lwjgl.input.Controllers;

import static main.adminscreen.*;
import static main.mainform.btm;
import static main.mainform.controller3;
import static main.mainscreen.*;

/**
 * Created by Andrew on 29.11.2017.
 */
public class gamepad3 {



    public gamepad3() {

//
        controller3.poll();

        while (Controllers.next()) {

            if (controller3.isButtonPressed(3)) {
                amount3++;
                amount3t++;
                ar3=amount3t;

                // System.out.println(amount);
                rs33t.setText(String.valueOf(amount3t));
                rs33.setText(String.valueOf(amount3));

                labelcolor2 a = new labelcolor2();
                a.colorL(ar,ar2,ar3,ar4);
                String[]str15 =new String[5];
              //  str15[0] = boxUmpire32.getText();
                str15[1] = round.getText();
                str15[2] = lbltimer.getText();
                str15[3] = "1 point Red";
                str15[4] = rcompetitor.getText()+" " +rtotal.getText()+":" + btotal.getText()+" "+ bcompetitor.getText();
                btm.addDate(str15);
                btm.fireTableDataChanged();


            }
            if (controller3.isButtonPressed(1)) {
                amountb3++;
                amountb3t++;

                ab3=amountb3t;


                bs33t.setText(String.valueOf(amountb3t));
                bs33.setText(String.valueOf(amountb3));

                labelcolor a = new labelcolor();
                a.colorL(ab,ab2,ab3,ab4);
                String[]str12 =new String[5];
               // str12[0] = boxUmpire32.getText();
                str12[1] = round.getText();
                str12[2] = lbltimer.getText();
                str12[3] = "1 point Blue";
                str12[4] = rcompetitor.getText()+" " +rtotal.getText()+":" + btotal.getText()+" "+ bcompetitor.getText();
                btm.addDate(str12);
                btm.fireTableDataChanged();

            }


            if (controller3.isButtonPressed(4)) {
                amount3--;
                amount3t--;

                ar3=amount3t;


                // System.out.println(amount);
                rs33t.setText(String.valueOf(amount3t));
                rs33.setText(String.valueOf(amount3));
                labelcolor2 a = new labelcolor2();
                a.colorL(ar,ar2,ar3,ar4);
                String[]str20 =new String[5];
               // str20[0] = boxUmpire32.getText();
                str20[1] = round.getText();
                str20[2] = lbltimer.getText();
                str20[3] = "1 point Red,Removed";
                str20[4] = rcompetitor.getText()+" " +rtotal.getText()+":" + btotal.getText()+" "+ bcompetitor.getText();
                btm.addDate(str20);
                btm.fireTableDataChanged();

            }
            if (controller3.isButtonPressed(5)) {
                amountb3--;
                amountb3t--;

                ab3=amountb3t;


                bs33t.setText(String.valueOf(amountb3t));
                bs33.setText(String.valueOf(amountb3));
                labelcolor a = new labelcolor();
                a.colorL(ab,ab2,ab3,ab4);
                String[]str19 =new String[5];
               // str19[0] = boxUmpire32.getText();
                str19[1] = round.getText();
                str19[2] = lbltimer.getText();
                str19[3] = "1 point Blue,Removed";
                str19[4] = rcompetitor.getText()+" " +rtotal.getText()+":" + btotal.getText()+" "+ bcompetitor.getText();
                btm.addDate(str19);
                btm.fireTableDataChanged();

            }

            }

        }
    }


