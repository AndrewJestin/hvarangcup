package additional;

import org.lwjgl.input.Controllers;

import static main.adminscreen.*;
import static main.mainform.btm;
import static main.mainform.controller1;
import static main.mainscreen.*;

/**
 * Created by Andrew on 29.11.2017.
 */
public class gamepad1 {
    public static int rlastr = 0;
    public static int blastr = 0;


    public gamepad1() {

//
        controller1.poll();

        while (Controllers.next()) {

            switch(Controllers.getEventControlIndex()) {

                case (1):
                    if (controller1.isButtonPressed(1)){
                        amountb++;
                amountbt++;

                ab=amountbt;



                bs11.setText(String.valueOf(amountb));
                bs11t.setText(String.valueOf(amountbt));


                labelcolor a = new labelcolor();
                a.colorL(ab,ab2,ab3);
                String[]str =new String[5];
                str[0] = lblUmpire1.getText();
                str[1] = roundt.getText();
                str[2] = lbltimer.getText();
                str[3] = "1 point Blue";
                str[4] = rcompetitor.getText()+" " +rtotal.getText()+":" + btotal.getText()+" "+ bcompetitor.getText();
                btm.addDate(str);
                btm.fireTableDataChanged();
                    }

                    break;
                case 3:
                    if (controller1.isButtonPressed(3)){
                        amount++;
                amountt++;
                ar=amountt;

                // System.out.println(amount);



                System.out.println("Судья: "+lblUmpire1.getText()+ ", "+round.getText()+". Время - "+min+":"+count+"  прибавленно 1 очко красному");
                rs11.setText(String.valueOf(amount));
                rs11t.setText(String.valueOf(amountt));


                labelcolor2 a = new labelcolor2();
                a.colorL(ar,ar2,ar3);
                String[]str2 =new String[5];
                str2[0] = lblUmpire1.getText();
                str2[1] = roundt.getText();
                str2[2] = lbltimer.getText();
                str2[3] = "1 point Red";
                // str2[4] = "Red " +rtotal.getText()+":"+btotal.getText()+" Blue";
                str2[4] = rcompetitor.getText()+" " +rtotal.getText()+":" + btotal.getText()+" "+ bcompetitor.getText();
                btm.addDate(str2);
                btm.fireTableDataChanged();
                    }
                    break;

            }


//            if (controller1.isButtonPressed(3)) {
//                amount++;
//                amountt++;
//                ar=amountt;
//
//                // System.out.println(amount);
//
//
//
//                System.out.println("Судья: "+lblUmpire1.getText()+ ", "+round.getText()+". Время - "+min+":"+count+"  прибавленно 1 очко красному");
//                rs11.setText(String.valueOf(amount));
//                rs11t.setText(String.valueOf(amountt));
//
//
//                labelcolor2 a = new labelcolor2();
//                a.colorL(ar,ar2,ar3);
//                String[]str2 =new String[5];
//                str2[0] = lblUmpire1.getText();
//                str2[1] = roundt.getText();
//                str2[2] = lbltimer.getText();
//                str2[3] = "1 point Red";
//                // str2[4] = "Red " +rtotal.getText()+":"+btotal.getText()+" Blue";
//                str2[4] = rcompetitor.getText()+" " +rtotal.getText()+":" + btotal.getText()+" "+ bcompetitor.getText();
//                btm.addDate(str2);
//                btm.fireTableDataChanged();
//
//
//
//            }
//
//          else if (controller1.isButtonPressed(1)) {
//                amountb++;
//                amountbt++;
//
//                ab=amountbt;
//
//
//
//                bs11.setText(String.valueOf(amountb));
//                bs11t.setText(String.valueOf(amountbt));
//
//
//                labelcolor a = new labelcolor();
//                a.colorL(ab,ab2,ab3);
//                String[]str =new String[5];
//                str[0] = lblUmpire1.getText();
//                str[1] = roundt.getText();
//                str[2] = lbltimer.getText();
//                str[3] = "1 point Blue";
//                str[4] = rcompetitor.getText()+" " +rtotal.getText()+":" + btotal.getText()+" "+ bcompetitor.getText();
//                btm.addDate(str);
//                btm.fireTableDataChanged();
//
//
//            }
//
//
//           else if (controller1.isButtonPressed(4)) {
//                amount--;
//
//                ar=amountt;
//
//                // System.out.println(amount);
//                System.out.println("Судья: "+lblUmpire1.getText()+ ", "+round.getText()+". Время - "+min+":"+count+"  снято 1 очко красному");
//                rs11.setText(String.valueOf(amount));
//                rs11t.setText(String.valueOf(amountt));
//                labelcolor2 a = new labelcolor2();
//                a.colorL(ar,ar2,ar3);
//
//                String[]str24 =new String[5];
//                str24[0] = lblUmpire1.getText();
//                str24[1] = roundt.getText();
//                str24[2] = lbltimer.getText();
//                str24[3] = "1 point Red,Removed";
//                str24[4] = rcompetitor.getText()+" " +rtotal.getText()+":" + btotal.getText()+" "+ bcompetitor.getText();
//                btm.addDate(str24);
//                btm.fireTableDataChanged();
//
//            }
//           else  if (controller1.isButtonPressed(5)) {
//                amountb--;
//
//                ab=amountbt;
//
//
//                System.out.println("Судья: "+lblUmpire1.getText()+ ", "+round.getText()+". Время - "+min+":"+count+"  снято 1 очко синему ");
//                bs11.setText(String.valueOf(amountb));
//                bs11t.setText(String.valueOf(amountbt));
//                labelcolor a = new labelcolor();
//                a.colorL(ab,ab2,ab3);
//                String[]str23 =new String[5];
//                str23[0] = lblUmpire1.getText();
//                str23[1] = roundt.getText();
//                str23[2] = lbltimer.getText();
//                str23[3] = "1 point Blue,Removed";
//                str23[4] = rcompetitor.getText()+" " +rtotal.getText()+":" + btotal.getText()+" "+ bcompetitor.getText();
//                btm.addDate(str23);
//                btm.fireTableDataChanged();
//
//
//            }

        }

    }

}
