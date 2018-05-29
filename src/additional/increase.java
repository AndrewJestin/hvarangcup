package additional;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static main.adminscreen.*;

public class increase implements ActionListener {



    public void actionPerformed(ActionEvent e) {


        amountb++;
        ab=amountb;
        System.out.println(ab);
        bs11.setText(String.valueOf(amountb));



        labelcolor a = new labelcolor();
       // a.colorL(ab, ar);

    }
}
