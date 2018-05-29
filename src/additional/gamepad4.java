package additional;

import org.lwjgl.input.Controllers;

import static main.adminscreen.*;
import static main.mainform.btm;
import static main.mainform.controller4;
import static main.mainscreen.*;

/**
 * Created by Andrew on 29.11.2017.
 */
public class gamepad4 {



    public gamepad4() {

//
        controller4.poll();

        while (Controllers.next()) {

            if (controller4.isButtonPressed(3)) {
                amount4++;
                amount4t++;
                ar4=amount4t;


//
                // System.out.println(amount);
                rs44t.setText(String.valueOf(amount4t));
                rs44.setText(String.valueOf(amount4));

                labelcolor2 a = new labelcolor2();
                a.colorL(ar,ar2,ar3,ar4);

                String[]str16 =new String[5];
              //  str16[0] = boxUmpire42.getText();
                str16[1] = round.getText();
                str16[2] = lbltimer.getText();
                str16[3] = "1 point Red";
                str16[4] = rcompetitor.getText()+" " +rtotal.getText()+":" + btotal.getText()+" "+ bcompetitor.getText();
                btm.addDate(str16);
                btm.fireTableDataChanged();
            }
            if (controller4.isButtonPressed(1)) {
                amountb4++;
                amountb4t++;

                ab4=amountb4t;


                bs44t.setText(String.valueOf(amountb4t));
                bs44.setText(String.valueOf(amountb4));

                labelcolor a = new labelcolor();
                a.colorL(ab,ab2,ab3,ab4);
                String[]str13 =new String[5];
               // str13[0] = boxUmpire42.getText();
                str13[1] = round.getText();
                str13[2] = lbltimer.getText();
                str13[3] = "1 point Blue";
                str13[4] = rcompetitor.getText()+" " +rtotal.getText()+":" + btotal.getText()+" "+ bcompetitor.getText();
                btm.addDate(str13);
                btm.fireTableDataChanged();

            }


            if (controller4.isButtonPressed(4)) {
                amount4--;
                amount4t--;
                ar4=amount4t;
                rs44t.setText(String.valueOf(amount4t));
                rs44.setText(String.valueOf(amount4));
                labelcolor2 a = new labelcolor2();
                a.colorL(ar,ar2,ar3,ar4);
                String[]str17 =new String[5];
              //  str17[0] = boxUmpire42.getText();
                str17[1] = round.getText();
                str17[2] = lbltimer.getText();
                str17[3] = "1 point Red,Removed";
                str17[4] = rcompetitor.getText()+" " +rtotal.getText()+":" + btotal.getText()+" "+ bcompetitor.getText();
                btm.addDate(str17);
                btm.fireTableDataChanged();
            }
            if (controller4.isButtonPressed(5)) {
                amountb4--;
                amountb4t--;
                ab4=amountb4t;
                bs44t.setText(String.valueOf(amountb4t));
                bs44.setText(String.valueOf(amountb4));
                labelcolor a = new labelcolor();
                a.colorL(ab,ab2,ab3,ab4);
                String[]str18 =new String[5];
               // str18[0] = boxUmpire42.getText();
                str18[1] = round.getText();
                str18[2] = lbltimer.getText();
                str18[3] = "1 point Blue,Removed";
                str18[4] = rcompetitor.getText()+" " +rtotal.getText()+":" + btotal.getText()+" "+ bcompetitor.getText();
                btm.addDate(str18);
                btm.fireTableDataChanged();

            }

            }

        }
    }


