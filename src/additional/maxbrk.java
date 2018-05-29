package additional;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//import static additional.TimerListener.br;
import static main.adminscreen.brktime;
import static main.adminscreen.br;
import static main.adminscreen.timbreaktime;


public class maxbrk implements ActionListener {



    public void actionPerformed(ActionEvent event) {
       // br=brktime;

        if (event.getActionCommand().equals("+")) {
            brktime++;
br=brktime;
          timbreaktime.setText(String.valueOf(brktime));

            //brktime=br+1;
           System.out.println(brktime);
        }
        if (event.getActionCommand().equals("-")) {

            brktime--;
          br=brktime;
           System.out.println(brktime);
           timbreaktime.setText(String.valueOf(brktime));
        }
        if (event.getActionCommand().equals("-")&& brktime<0){
            brktime =60;
            br=brktime;
            timbreaktime.setText(String.valueOf(brktime));

     System.out.println(brktime);
    }
    if (event.getActionCommand().equals("+")&& brktime>60){
        brktime =0;
        br=brktime;

        timbreaktime.setText(String.valueOf(brktime));

     System.out.println(brktime);
        }
}

}