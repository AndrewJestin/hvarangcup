package additional;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import static main.adminscreen.*;
import static main.mainform.*;
import static main.mainscreen.*;

/**
 * Created by Andrew on 12.03.2017.
 */
public class ekran1 implements ActionListener {


    public void actionPerformed(ActionEvent event) {
        if (event.getActionCommand().equals("1920*1080")) {
            screen=2;
            System.out.println(screen);
            frame1.setExtendedState(JFrame.MAXIMIZED_BOTH);
            lblcategory.setLocation(1020, 30);
            lblcategory.setSize(860, 80);
            lblcategory.setHorizontalAlignment(4);
            lblcategory.setVerticalAlignment(0);
            lblcategory.setFont(new Font("Arial", Font.BOLD, 50));
            //  lblcategory.setBorder(BorderFactory.createLineBorder(Color.black));
            // timer.setBackground(Color.yellow);

            lblcategory.setOpaque(true);
            // номер боя (надпись)
            lblmatch.setLocation(40, 780);
            lblmatch.setSize(170, 40);
            lblmatch.setHorizontalAlignment(0);
            lblmatch.setVerticalAlignment(0);
            lblmatch.setFont(new Font("Arial", Font.BOLD, 35));

            lblmatch.setOpaque(true);

            // номер боя


            lblMatchNo.setLocation(20, 830);
            lblMatchNo.setSize(220, 220);
            lblMatchNo.setHorizontalAlignment(0);
            lblMatchNo.setVerticalAlignment(0);
            lblMatchNo.setFont(new Font("Arial", Font.BOLD, 100));
           // lblMatchNo.setBorder(BorderFactory.createLineBorder(Color.black,7));
            // timer.setBackground(Color.yellow);
            lblMatchNo.setOpaque(true);
            //      таймер

            lbltimer1.setLocation(730, 130);
            lbltimer1.setSize(500, 180);
            lbltimer1.setHorizontalAlignment(0);
            lbltimer1.setVerticalAlignment(0);
            lbltimer1.setFont(new Font("Arial", Font.BOLD, 180));
            // lbltimer1.setBorder(BorderFactory.createLineBorder(Color.black));
            // timer.setBackground(Color.yellow);
            lbltimer1.setOpaque(true);


            //   кто побеждает





            round.setLocation(20, 0);
            round.setSize(470, 140);
            round.setHorizontalAlignment(0);
            // round.setBackground(Color.yellow);
            round.setOpaque(true);
            //  round.setBorder(BorderFactory.createLineBorder(Color.black));
            round.setFont(new Font("Arial", Font.BOLD, 90));


            //  судья 1


            rs1.setLocation(1110, 830);
            rs1.setSize(200, 100);
            rs1.setHorizontalAlignment(0);

            rs1.setFont(new Font("Arial", Font.BOLD, 90));
            rs1.setOpaque(true);


            bs1.setLocation(1110, 950);
            bs1.setSize(200, 100);
            bs1.setHorizontalAlignment(0);

            bs1.setFont(new Font("Arial", Font.BOLD, 90));
            bs1.setOpaque(true);


            //  судья 2

            rs2.setLocation(1310, 830);
            rs2.setSize(200, 100);
            rs2.setHorizontalAlignment(0);

            rs2.setFont(new Font("Arial", Font.BOLD, 90));
            rs2.setOpaque(true);


            bs2.setLocation(1310, 950);
            bs2.setSize(200, 100);
            bs2.setHorizontalAlignment(0);

            bs2.setFont(new Font("Arial", Font.BOLD, 90));
            bs2.setOpaque(true);


            //судья 3
            rs3.setLocation(1510, 830);
            rs3.setSize(200, 100);

            rs3.setFont(new Font("Arial", Font.BOLD, 90));
            rs3.setOpaque(true);


            bs3.setLocation(1510, 950);
            bs3.setSize(200, 100);

            bs3.setFont(new Font("Arial", Font.BOLD, 90));
            bs3.setOpaque(true);


            // судья 4




            //участники 1 и 2
            rcompetitor.setLocation(250, 830);
            rcompetitor.setSize(870, 100);

            rcompetitor.setFont(new Font("Arial", Font.BOLD, 60));
            rcompetitor.setOpaque(true);


            bcompetitor.setLocation(250, 950);
            bcompetitor.setSize(870, 100);

            bcompetitor.setFont(new Font("Arial", Font.BOLD, 60));
            bcompetitor.setOpaque(true);


            // общие очки
            btotal.setLocation(195, 150);
            btotal.setSize(400, 600);
            btotal.setFont(new Font("Arial", Font.BOLD, 400));
            btotal.setOpaque(true);


            rtotal.setLocation(1320, 150);
            rtotal.setSize(400, 600);
            rtotal.setFont(new Font("Arial", Font.BOLD, 400));
            rtotal.setOpaque(true);

// штрафы

            rpenalty.setLocation(1717, 150);
            rpenalty.setSize(180, 303);
            rpenalty.setOpaque(true);
            rpenalty.setFont(new Font("Arial", Font.BOLD, 140));


            bpenalty.setLocation(20, 150);
            bpenalty.setSize(178, 303);
            bpenalty.setOpaque(true);
            bpenalty.setFont(new Font("Arial", Font.BOLD, 140));


//  предупреждения

            rwarnings.setLocation(1717, 450);
            rwarnings.setSize(180, 300);
            rwarnings.setFont(new Font("Arial", Font.BOLD, 140));

            bwarnings.setLocation(20, 450);
            bwarnings.setSize(178, 300);
            bwarnings.setFont(new Font("Arial", Font.BOLD, 140));




            //ImageIcon tkd = new ImageIcon("tkd2big.gif");


            ekran1.setText("1280*800");




        } else if (event.getActionCommand().equals("1280*800")) {
            screen=1;


            lblMatchNo.setLocation(10, 565);
            lblMatchNo.setSize(125, 125);
            lblMatchNo.setFont(new Font("Arial", Font.BOLD, 70));
            lblMatchNo.setOpaque(true);


            lblmatch.setLocation(0, 510);
            lblmatch.setSize(170, 40);
            lblmatch.setFont(new Font("Arial", Font.BOLD, 30));
            lblmatch.setOpaque(true);

            lblcategory.setLocation(400, 5);
            lblcategory.setSize(850, 60);
            lblcategory.setHorizontalAlignment(4);
            lblcategory.setFont(new Font("Arial", Font.BOLD, 40));
            lblcategory.setVerticalAlignment(0);
            lblcategory.setOpaque(true);

            lbltimer1.setLocation(440, 80);
            lbltimer1.setSize(400, 120);
            lbltimer1.setFont(new Font("Arial", Font.BOLD, 120));
            lbltimer1.setOpaque(true);



// номер раунда

            round.setLocation(10, 10);
            round.setSize(370, 70);
            round.setFont(new Font("Arial",Font.BOLD,60));
            round.setOpaque(true);
            round.setHorizontalAlignment(2);

            //  судья 1

            rs1.setLocation(670, 565);
            rs1.setSize(150, 60);

            rs1.setFont(new Font("Arial",Font.BOLD,60));
            rs1.setOpaque(true);

            bs1.setLocation(670, 630);
            bs1.setSize(150, 60);
            bs1.setFont(new Font("Arial",Font.BOLD,60));
            bs1.setOpaque(true);

            //  судья 2

            rs2.setLocation(820, 565);
            rs2.setSize(150, 60);
            rs2.setFont(new Font("Arial",Font.BOLD,60));
            rs2.setOpaque(true);

            bs2.setLocation(820, 630);
            bs2.setSize(150, 60);
            bs2.setFont(new Font("Arial",Font.BOLD,60));
            bs2.setOpaque(true);

            //судья 3
            rs3.setLocation(970, 565);
            rs3.setSize(150, 60);
            rs3.setFont(new Font("Arial",Font.BOLD,60));
            rs3.setOpaque(true);

            bs3.setLocation(970, 630);
            bs3.setSize(150, 60);
            bs3.setFont(new Font("Arial",Font.BOLD,60));
            bs3.setOpaque(true);


            // судья 4




            //участники 1 и 2
            rcompetitor.setLocation(150, 565);
            rcompetitor.setSize(520, 60);
            rcompetitor.setHorizontalAlignment(0);
            rcompetitor.setFont(new Font("Arial",Font.BOLD,50));
            rcompetitor.setOpaque(true);



            bcompetitor.setLocation(150, 630);
            bcompetitor.setSize(520, 60);
            bcompetitor.setFont(new Font("Arial",Font.BOLD,50));
            bcompetitor.setOpaque(true);

            // общие очки
            btotal.setLocation(130, 90);
            btotal.setSize(260, 390);
            btotal.setFont(new Font("Arial",Font.BOLD,280));
            btotal.setOpaque(true);


            rtotal.setLocation(890, 90);
            rtotal.setSize(260, 390);
            rtotal.setFont(new Font("Arial",Font.BOLD,280));
            rtotal.setOpaque(true);

// штрафы

            rpenalty.setLocation(1147, 90);
            rpenalty.setSize(118, 195);
            rpenalty.setHorizontalAlignment(0);
            rpenalty.setBackground(Color.yellow);
            rpenalty.setOpaque(true);
           // rpenalty.setBorder(BorderFactory.createLineBorder(Color.black));
            rpenalty.setFont(new Font("Arial",Font.BOLD,90));




            bpenalty.setLocation(15, 90);
            bpenalty.setSize(118, 195);
            bpenalty.setHorizontalAlignment(0);
            bpenalty.setBackground(Color.yellow);
            bpenalty.setOpaque(true);
           // bpenalty.setBorder(BorderFactory.createLineBorder(Color.black));
            bpenalty.setFont(new Font("Arial",Font.BOLD,90));


//  предупреждения


            rwarnings.setLocation(1147, 282);
            rwarnings.setSize(118, 198);
            rwarnings.setFont(new Font("Arial",Font.BOLD,90));


            bwarnings.setLocation(15, 282);
            bwarnings.setSize(118, 198);
            bwarnings.setFont(new Font("Arial",Font.BOLD,90));



            nlblrnd1.setLocation(560, 360);
            nlblrnd1.setSize(160, 50);

            nlblrnd2.setLocation(560, 420);
            nlblrnd2.setSize(160, 50);

           // bwarnings.setBorder(BorderFactory.createLineBorder(Color.black));
            ekran1.setText("1920*1080");
            nlblrnd1.setFont(new Font("Arial",Font.BOLD,40));
            nlblrnd2.setFont(new Font("Arial",Font.BOLD,40));


        }
        else {

        }
    }



}

