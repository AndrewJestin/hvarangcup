package additional;


import static main.adminscreen.*;
import static main.mainscreen.btotal;
import static main.mainscreen.rtotal;


public class labelcolor4 {


    public void colorL(int ab4, int ar4) {

        if (ab4 < ar4){
            rglobal4=1;
            bglobal4=0;
//            rtotal1.setText(String.valueOf(rglobal));
//            btotal1.setText(String.valueOf(bglobal));
//            rtotal.setText(String.valueOf(rglobal));
//            btotal.setText(String.valueOf(bglobal));
         //   System.out.println(bglobal2);
        }
        if (ab4 > ar4){
            bglobal4=1;
            rglobal4=0;

//            rtotal1.setText(String.valueOf(rglobal));
//            btotal1.setText(String.valueOf(bglobal));
//            rtotal.setText(String.valueOf(rglobal));
//            btotal.setText(String.valueOf(bglobal));
        }
        if (ab4 == ar4){
            bglobal4=0;
            rglobal4=0;


        }

        if (bglobal1+bglobal2+bglobal3+bglobal4 == 0) {
            bglobal = 0;
            rtotal1.setText(String.valueOf(rglobal));
            btotal1.setText(String.valueOf(bglobal));
            rtotal.setText(String.valueOf(rglobal));
            btotal.setText(String.valueOf(bglobal));}

        if (bglobal1+bglobal2+bglobal3+bglobal4 == 1){

            bglobal = 1;
            rtotal1.setText(String.valueOf(rglobal));
            btotal1.setText(String.valueOf(bglobal));
            rtotal.setText(String.valueOf(rglobal));
            btotal.setText(String.valueOf(bglobal));}
        if (bglobal1+bglobal2+bglobal3+bglobal4 == 2){

            bglobal = 2;
            rtotal1.setText(String.valueOf(rglobal));
            btotal1.setText(String.valueOf(bglobal));
            rtotal.setText(String.valueOf(rglobal));
            btotal.setText(String.valueOf(bglobal));}
        if (bglobal1+bglobal2+bglobal3+bglobal4 == 3){

            bglobal = 3;
            rtotal1.setText(String.valueOf(rglobal));
            btotal1.setText(String.valueOf(bglobal));
            rtotal.setText(String.valueOf(rglobal));
            btotal.setText(String.valueOf(bglobal));}

        if (bglobal1+bglobal2+bglobal3+bglobal4 == 4){
            bglobal = 4;
            rtotal1.setText(String.valueOf(rglobal));
            btotal1.setText(String.valueOf(bglobal));
            rtotal.setText(String.valueOf(rglobal));
            btotal.setText(String.valueOf(bglobal));}

        if (rglobal1+rglobal2+rglobal3+rglobal4 == 0) {
            rglobal = 0;
            rtotal1.setText(String.valueOf(rglobal));
            btotal1.setText(String.valueOf(bglobal));
            rtotal.setText(String.valueOf(rglobal));
            btotal.setText(String.valueOf(bglobal));}

        if (rglobal1+rglobal2+rglobal3+rglobal4 == 2) {
            rglobal = 2;
            rtotal1.setText(String.valueOf(rglobal));
            btotal1.setText(String.valueOf(bglobal));
            rtotal.setText(String.valueOf(rglobal));
            btotal.setText(String.valueOf(bglobal));}

        if (rglobal1+rglobal2+rglobal3+rglobal4 == 3) {
            rglobal = 3;
            rtotal1.setText(String.valueOf(rglobal));
            btotal1.setText(String.valueOf(bglobal));
            rtotal.setText(String.valueOf(rglobal));
            btotal.setText(String.valueOf(bglobal));}

        if (rglobal1+rglobal2+rglobal3+rglobal4 == 4) {
            rglobal = 4;
            rtotal1.setText(String.valueOf(rglobal));
            btotal1.setText(String.valueOf(bglobal));
            rtotal.setText(String.valueOf(rglobal));
            btotal.setText(String.valueOf(bglobal));}

        if (rglobal1+rglobal2+rglobal3+rglobal4 == 1) {
            rglobal = 1;
            rtotal1.setText(String.valueOf(rglobal));
            btotal1.setText(String.valueOf(bglobal));
            rtotal.setText(String.valueOf(rglobal));
            btotal.setText(String.valueOf(bglobal));}






    }

}
