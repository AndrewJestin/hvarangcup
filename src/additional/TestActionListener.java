package additional;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static main.adminscreen.*;


public class TestActionListener implements ActionListener {



    public void actionPerformed(ActionEvent event) {


        amount++;

        ar =amount;
      //  System.out.println(amount);

        rs11.setText(String.valueOf(amount));

        labelcolor a = new labelcolor();
        a.colorL(ab,ab2,ab3);

    }
}
