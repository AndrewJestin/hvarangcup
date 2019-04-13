package additional;


import static main.adminscreen.bglobal;
import static main.adminscreen.btotal1;
import static main.mainscreen.btotal;


public class labelcolor {


    public void colorL(int ab, int ab2,int ab3) {


bglobal = (ab+ab2+ab3)/3;
System.out.println(bglobal);
        btotal.setText(String.valueOf(bglobal));
        btotal1.setText(String.valueOf(bglobal));
//        if (ab < ar){
//            rglobal1=1;
//            bglobal1=0;
//
//        }
//        if (ab > ar){
//            bglobal1=1;
//            rglobal1=0;
//
//
//        }
//        if (ab == ar){
//            bglobal1=0;
//            rglobal1=0;
//
//
//        }

//        if (bglobal1+bglobal2+bglobal3+bglobal4 == 0) {
//            bglobal = 0;
//            rtotal1.setText(String.valueOf(rglobal));
//            btotal1.setText(String.valueOf(bglobal));
//            rtotal.setText(String.valueOf(rglobal));
//            btotal.setText(String.valueOf(bglobal));}
//
//        if (bglobal1+bglobal2+bglobal3+bglobal4 == 1){
//
//            bglobal = 1;
//            rtotal1.setText(String.valueOf(rglobal));
//            btotal1.setText(String.valueOf(bglobal));
//            rtotal.setText(String.valueOf(rglobal));
//            btotal.setText(String.valueOf(bglobal));}
//        if (bglobal1+bglobal2+bglobal3+bglobal4 == 2){
//
//            bglobal = 2;
//            rtotal1.setText(String.valueOf(rglobal));
//            btotal1.setText(String.valueOf(bglobal));
//            rtotal.setText(String.valueOf(rglobal));
//            btotal.setText(String.valueOf(bglobal));}
//        if (bglobal1+bglobal2+bglobal3+bglobal4 == 3){
//
//            bglobal = 3;
//            rtotal1.setText(String.valueOf(rglobal));
//            btotal1.setText(String.valueOf(bglobal));
//            rtotal.setText(String.valueOf(rglobal));
//            btotal.setText(String.valueOf(bglobal));}
//
//        if (bglobal1+bglobal2+bglobal3+bglobal4 == 4){
//            bglobal = 4;
//            rtotal1.setText(String.valueOf(rglobal));
//            btotal1.setText(String.valueOf(bglobal));
//            rtotal.setText(String.valueOf(rglobal));
//            btotal.setText(String.valueOf(bglobal));}
//
//        if (rglobal1+rglobal2+rglobal3+rglobal4 == 0) {
//            rglobal = 0;
//            rtotal1.setText(String.valueOf(rglobal));
//            btotal1.setText(String.valueOf(bglobal));
//            rtotal.setText(String.valueOf(rglobal));
//            btotal.setText(String.valueOf(bglobal));}
//
//        if (rglobal1+rglobal2+rglobal3+rglobal4 == 2) {
//            rglobal = 2;
//            rtotal1.setText(String.valueOf(rglobal));
//            btotal1.setText(String.valueOf(bglobal));
//            rtotal.setText(String.valueOf(rglobal));
//            btotal.setText(String.valueOf(bglobal));}
//
//        if (rglobal1+rglobal2+rglobal3+rglobal4 == 3) {
//            rglobal = 3;
//            rtotal1.setText(String.valueOf(rglobal));
//            btotal1.setText(String.valueOf(bglobal));
//            rtotal.setText(String.valueOf(rglobal));
//            btotal.setText(String.valueOf(bglobal));}
//
//        if (rglobal1+rglobal2+rglobal3+rglobal4 == 4) {
//            rglobal = 4;
//            rtotal1.setText(String.valueOf(rglobal));
//            btotal1.setText(String.valueOf(bglobal));
//            rtotal.setText(String.valueOf(rglobal));
//            btotal.setText(String.valueOf(bglobal));}
//
//        if (rglobal1+rglobal2+rglobal3+rglobal4 == 1) {
//            rglobal = 1;
//            rtotal1.setText(String.valueOf(rglobal));
//            btotal1.setText(String.valueOf(bglobal));
//            rtotal.setText(String.valueOf(rglobal));
//            btotal.setText(String.valueOf(bglobal));}
//
//        if (rglobal<bglobal&&bglobal!=1){
//
//            leader.setBackground(Color.blue);
//            leader.setForeground(Color.white);
//            leader.setText("LEADER");
//            leader2.setBackground(Color.blue);
//            leader2.setForeground(Color.white);
//            leader2.setText("LEADER");
//            if (round.getText().equals("FINISHED")){
//                leader.setText("WINNER");
//                leader2.setText("WINNER");
//
//            }
//        }
//        else  if (rglobal>bglobal&&rglobal!=1)
//        { leader.setBackground(Color.red);
//            leader.setForeground(Color.white);
//            leader.setText("LEADER");
//            leader2.setBackground(Color.red);
//            leader2.setForeground(Color.white);
//            leader2.setText("LEADER");
//            if (round.getText().equals("FINISHED")){
//                leader.setText("WINNER");
//                leader2.setText("WINNER");
//
//            }
//        }
//        else { leader.setBackground(Color.BLACK);
//            leader.setForeground(Color.WHITE);
//            leader.setText("DRAW");
//            leader2.setBackground(Color.white);
//            leader2.setForeground(Color.black);
//            leader2.setText("DRAW");
//        }



    }

}
