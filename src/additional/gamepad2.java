package additional;

import org.lwjgl.input.Controllers;

import static main.adminscreen.*;
import static main.mainform.btm;
import static main.mainform.controller2;
import static main.mainscreen.*;

/**
 * Created by Andrew on 29.11.2017.
 */
public class gamepad2 {



    public gamepad2() {

//
        controller2.poll();

        while (Controllers.next()) {

            if (controller2.isButtonPressed(3)) {
                amount2++;
                amount2t++;
                ar2=amount2t;


                // System.out.println(amount);
                rs22t.setText(String.valueOf(amount2t));
                rs22.setText(String.valueOf(amount2));

                labelcolor2 a = new labelcolor2();
                a.colorL(ar,ar2,ar3,ar4);

                String[]str14 =new String[5];
               // str14[0] = boxUmpire22.getText();
                str14[1] = round.getText();
                str14[2] = lbltimer.getText();
                str14[3] = "1 point Red";
                str14[4] = rcompetitor.getText()+" " +rtotal.getText()+":" + btotal.getText()+" "+ bcompetitor.getText();
                btm.addDate(str14);
                btm.fireTableDataChanged();
            }
            if (controller2.isButtonPressed(1)) {
                amountb2++;
                amountb2t++;

                ab2=amountb2t;



                bs22t.setText(String.valueOf(amountb2t));
                bs22.setText(String.valueOf(amountb2));

                labelcolor a = new labelcolor();
                a.colorL(ab,ab2,ab3,ab4);
                String[]str11 =new String[5];
               // str11[0] = boxUmpire22.getText();
                str11[1] = round.getText();
                str11[2] = lbltimer.getText();
                str11[3] = "1 point Blue";
                str11[4] = rcompetitor.getText()+" " +rtotal.getText()+":" + btotal.getText()+" "+ bcompetitor.getText();
                btm.addDate(str11);
                btm.fireTableDataChanged();


            }


            if (controller2.isButtonPressed(4)) {
                amount2--;
                amount2t--;

                ar2=amount2t;

                // System.out.println(amount);
                rs22t.setText(String.valueOf(amount2t));
                rs22.setText(String.valueOf(amount2));
                labelcolor2 a = new labelcolor2();
                a.colorL(ar,ar2,ar3,ar4);

                String[]str22 =new String[5];
               // str22[0] = boxUmpire22.getText();
                str22[1] = round.getText();
                str22[2] = lbltimer.getText();
                str22[3] = "1 point Red,Removed";
                str22[4] = rcompetitor.getText()+" " +rtotal.getText()+":" + btotal.getText()+" "+ bcompetitor.getText();
                btm.addDate(str22);
                btm.fireTableDataChanged();

            }
            if (controller2.isButtonPressed(5)) {
                amountb2--;
                amountb2t--;

                ab2=amountb2t;


                bs22t.setText(String.valueOf(amountb2t));
                bs22.setText(String.valueOf(amountb2));
                labelcolor a = new labelcolor();
                a.colorL(ab,ab2,ab3,ab4);
                String[]str21 =new String[5];
               // str21[0] = boxUmpire22.getText();
                str21[1] = round.getText();
                str21[2] = lbltimer.getText();
                str21[3] = "1 point Blue,Removed";
                str21[4] = rcompetitor.getText()+" " +rtotal.getText()+":" + btotal.getText()+" "+ bcompetitor.getText();
                btm.addDate(str21);
                btm.fireTableDataChanged();

            }
            }

        }
    }


