package additional;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static main.adminscreen.ab;
import static main.adminscreen.amountb;
import static main.adminscreen.bs11;

public class DecreseBlue implements ActionListener {



    public void actionPerformed(ActionEvent b) {


        amountb--;
      ab=amountb;

        System.out.println(ab);
        bs11.setText(String.valueOf(amountb));

//        labelcolor a = new labelcolor();
//        a.colorL(ab, ar);


    }
}
