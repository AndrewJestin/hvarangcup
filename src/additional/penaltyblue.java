package additional;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static main.adminscreen.*;
import static main.mainform.btm;
import static main.mainscreen.*;


public class penaltyblue implements ActionListener {


    public void actionPerformed(ActionEvent e) {

        bpen++;
        bpenal = bpen;

        bglobal--;
        btotal.setText(String.valueOf(bglobal));
        btotal1.setText(String.valueOf(bglobal));
        System.out.println(round.getText() + ". Время - " + min + ":" + count + " Камджон синему (-1 балл)");

//        if (bpenal ==1){
//            bpenalty.setBackground(Color.yellow);
//        //    bpenalty.setBorder(BorderFactory.createLineBorder(Color.black));
//            amountb--;
//            ab = amountb;
//           // System.out.println(ab);
//            bs11.setText(String.valueOf(amountb));
//            bs1.setText(String.valueOf(amountb));
//            amountb2--;
//            ab2 = amountb2;
//           // System.out.println(ab2);
//            bs22.setText(String.valueOf(amountb2));
//            bs2.setText(String.valueOf(amountb2));
//            amountb3--;
//            ab3 = amountb3;
//           // System.out.println(ab3);
//            bs33.setText(String.valueOf(amountb3));
//            bs3.setText(String.valueOf(amountb3));
//            amountb4--;
//            ab4 = amountb4;
//          //  System.out.println(ab4);
//            bs44.setText(String.valueOf(amountb4));
//            bs4.setText(String.valueOf(amountb4));
//        }
//        if (bpenal ==2){
//
//            amountb--;
//            ab = amountb;
//           // System.out.println(ab);
//            bs11.setText(String.valueOf(amountb));
//            bs1.setText(String.valueOf(amountb));
//            amountb2--;
//            ab2 = amountb2;
//          //  System.out.println(ab2);
//            bs22.setText(String.valueOf(amountb2));
//            bs2.setText(String.valueOf(amountb2));
//            amountb3--;
//            ab3 = amountb3;
//          //  System.out.println(ab3);
//            bs33.setText(String.valueOf(amountb3));
//            bs3.setText(String.valueOf(amountb3));
//            amountb4--;
//            ab4 = amountb4;
//           // System.out.println(ab4);
//            bs44.setText(String.valueOf(amountb4));
//            bs4.setText(String.valueOf(amountb4));
//
//        }
//        if (bpenal ==3){
//
//            amountb--;
//            ab = amountb;
//           // System.out.println(ab);
//            bs11.setText(String.valueOf(amountb));
//            bs1.setText(String.valueOf(amountb));
//            amountb2--;
//            ab2 = amountb2;
//           // System.out.println(ab2);
//            bs22.setText(String.valueOf(amountb2));
//            bs2.setText(String.valueOf(amountb2));
//            amountb3--;
//            ab3 = amountb3;
//           // System.out.println(ab3);
//            bs33.setText(String.valueOf(amountb3));
//            bs3.setText(String.valueOf(amountb3));
//            amountb4--;
//            ab4 = amountb4;
//           // System.out.println(ab4);
//            bs44.setText(String.valueOf(amountb4));
//            bs4.setText(String.valueOf(amountb4));
//        }
//
//        if (bpenal == 4){
//            bpen=3;
//        }
//
//        labelcolor5 a = new labelcolor5();
//        a.colorL(ab, ar);
//     //   System.out.println(bpenal);
        bpenalty11.setText(String.valueOf(bpen));
        bpenalty.setText(String.valueOf(bpen));

    String[] str8 = new String[5];
    str8[0] = "Referee";
    str8[1] = round.getText();
    str8[2] = lbltimer.getText();
    str8[3] = " Penalty(-1 point) Blue";
    str8[4] = rcompetitor.getText()+" " +rtotal.getText()+":" + btotal.getText()+" "+ bcompetitor.getText();
        btm.addDate(str8);
        btm.fireTableDataChanged();

}

}