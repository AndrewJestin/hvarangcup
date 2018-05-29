package additional;


import static main.adminscreen.*;
import static main.mainscreen.btotal;
import static main.mainscreen.rtotal;


public class labelcolor5 {


    public void colorL(int ab1, int ar1) {

        if (ab < ar){
            rglobal1=1;
            bglobal1=0;

        }
        if (ab > ar){
            bglobal1=1;
            rglobal1=0;


        }
        if (ab == ar){
            bglobal1=0;
            rglobal1=0;


        }
        if (ab2 < ar2){
            rglobal2=1;
            bglobal2=0;
//            rtotal1.setText(String.valueOf(rglobal));
//            btotal1.setText(String.valueOf(bglobal));
//            rtotal.setText(String.valueOf(rglobal));
//            btotal.setText(String.valueOf(bglobal));
           // System.out.println(bglobal2);
        }
        if (ab2 > ar2){
            bglobal2=1;
            rglobal2=0;

//            rtotal1.setText(String.valueOf(rglobal));
//            btotal1.setText(String.valueOf(bglobal));
//            rtotal.setText(String.valueOf(rglobal));
//            btotal.setText(String.valueOf(bglobal));
        }
        if (ab2 == ar2){
            bglobal2=0;
            rglobal2=0;


        }  if (ab3 < ar3){
            rglobal3=1;
            bglobal3=0;
//            rtotal1.setText(String.valueOf(rglobal));
//            btotal1.setText(String.valueOf(bglobal));
//            rtotal.setText(String.valueOf(rglobal));
//            btotal.setText(String.valueOf(bglobal));
            //    System.out.println(bglobal2);
        }
        if (ab3 > ar3){
            bglobal3=1;
            rglobal3=0;

//            rtotal1.setText(String.valueOf(rglobal));
//            btotal1.setText(String.valueOf(bglobal));
//            rtotal.setText(String.valueOf(rglobal));
//            btotal.setText(String.valueOf(bglobal));
        }
        if (ab3 == ar3){
            bglobal3=0;
            rglobal3=0;


        }
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
