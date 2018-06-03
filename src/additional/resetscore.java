package additional;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static main.adminscreen.*;
import static main.mainscreen.*;


public class resetscore implements ActionListener {



    public void actionPerformed(ActionEvent b) {


        amount=0;
        amountb=0;
        amountt=0;
        amountbt=0;
        ar=amount;
        ab=amountb;
        rs11.setText(String.valueOf(amount));
        bs11.setText(String.valueOf(amountb));
        rs11t.setText(String.valueOf(amount));
        bs11t.setText(String.valueOf(amountb));
        amount2=0;
        amountb2=0;
        amount2t=0;
        amountb2t=0;
        ar2=amount2;
        ab2=amountb2;
        rs22.setText(String.valueOf(amount2));
        bs22.setText(String.valueOf(amountb2));
        rs22t.setText(String.valueOf(amount2));
        bs22t.setText(String.valueOf(amountb2));
        amount3=0;
        amountb3=0;
        amount3t=0;
        amountb3t=0;
        ar3=amount3;
        ab3=amountb3;
        rs33.setText(String.valueOf(amount3));
        bs33.setText(String.valueOf(amountb3));
        rs33t.setText(String.valueOf(amount3));
        bs33t.setText(String.valueOf(amountb3));
        amount4=0;
        amountb4=0;
        amount4t=0;
        amountb4t=0;
        ar4=amount4;
        ab4=amountb4;
        rs44.setText(String.valueOf(amount4));
        bs44.setText(String.valueOf(amountb4));
        rs44t.setText(String.valueOf(amount4));
        bs44t.setText(String.valueOf(amountb4));
       rwarning=0;
          bwarning=0;
         wr=rwarning;
         wb=bwarning;
        bwarnings.setText(String.valueOf(bwarning));
        bwarnings1.setText(String.valueOf(bwarning));
        rwarnings.setText(String.valueOf(rwarning));
        rwarnings1.setText(String.valueOf(rwarning));
        rpen=0;
        bpen=0;
        rpenalty11.setText(String.valueOf(rpen));
        bpenalty11.setText(String.valueOf(bpen));
        rpenalty.setText(String.valueOf(rpen));
     //  leader.setText(String.valueOf("DRAW"));
        bpenalty.setText(String.valueOf(bpen));

        bglobal=0;
        rglobal=0;
        bglobal1=0;
        rglobal1=0;
        bglobal2=0;
        rglobal2=0;
        bglobal3=0;
        rglobal3=0;
        bglobal4=0;
        rglobal4=0;
        btotal1.setText(String.valueOf(bglobal));
        btotal.setText(String.valueOf(bglobal));
        rtotal.setText(String.valueOf(rglobal));
        rtotal1.setText(String.valueOf(rglobal));

        round1.setText("1");
        round.setText("ROUND : 1");
        matchno1 =1;
        lblMatchNo1.setText(matchno1+"");
        roundt.setText("FIGHT : "+String.valueOf(matchno1));
        raddpoint=0;
        rs5.setText(raddpoint+"");
        baddpoint=0;
        bs5.setText(baddpoint+"");
     }

}
