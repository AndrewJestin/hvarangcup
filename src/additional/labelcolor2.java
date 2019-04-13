package additional;


import static main.adminscreen.rglobal;
import static main.adminscreen.rglobal2;
import static main.adminscreen.rtotal1;
import static main.mainscreen.rtotal;

public class labelcolor2 {


    public void colorL(int ar, int ar2,int ar3) {


        rglobal = (ar+ar2+ar3)/3;
        System.out.println(rglobal);
        rtotal.setText(String.valueOf(rglobal));
        rtotal1.setText(String.valueOf(rglobal));

//            rtotal1.setText(String.valueOf(rglobal));
//            btotal1.setText(String.valueOf(bglobal));
//            rtotal.setText(String.valueOf(rglobal));
//            btotal.setText(String.valueOf(bglobal));
            System.out.println(rglobal2);






    }

}
