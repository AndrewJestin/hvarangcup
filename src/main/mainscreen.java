package main;

import javax.swing.*;
import java.awt.*;

import static main.adminscreen.*;
/**
 * Created by Daha on 24.04.2017.
 */


    /**
     * Created by Andrew on 24.02.2017.
     */

    public class mainscreen {
        public static JLabel lblcategory = new JLabel("ADULT MALE -64kg.");
        public static JLabel lblmatch = new JLabel("Match No.");
       // public static JLabel leader = new JLabel("DRAW");
        public static JLabel lblMatchNo = new JLabel(lblMatchNo1.getText());
                public static JLabel rpenalty = new JLabel("0");
        public static JLabel bpenalty = new JLabel("0");
        public static JLabel nlblrnd1 = new JLabel("1 Rnd.");
        public static JLabel nlblrnd2 = new JLabel("2 Rnd.");
        public static JLabel rs1 = new JLabel("0");
        public static JLabel bs1 = new JLabel("0");
        public static JLabel rs2 = new JLabel("0");
        public static JLabel bs2 = new JLabel("0");
        public static JLabel rs3 = new JLabel("0");
        public static JLabel bs3 = new JLabel("0");

        public static JLabel rcompetitor = new JLabel("Red");
        public static JLabel bcompetitor = new JLabel("Blue");
        public static JLabel btotal = new JLabel("0");
        public static JLabel rwarnings = new JLabel("0");
        public static JLabel bwarnings = new JLabel("0");
        public static JLabel rtotal = new JLabel("0");
        public static JLabel round = new JLabel("ROUND : "+rndnum);
        public static JLabel roundt = new JLabel("FIGHT : "+lblMatchNo1.getText());
        public static JLabel lbltimer1 = new JLabel("00:00");
        // public static JLabel lblkicks2 = new JLabel("Compulsory techniques ");
        //gamepad



        public JPanel createContentPane() {


            JPanel totalGUI = new JPanel();
            totalGUI.setLayout(null);




// номер боя (надпись)
            lblmatch.setLocation(0, 505);
            lblmatch.setSize(170, 40);
            lblmatch.setHorizontalAlignment(0);
            lblmatch.setForeground(Color.white);
            lblmatch.setVerticalAlignment(0);
            lblmatch.setBackground(Color.black);
            lblmatch.setFont(new Font("Arial", Font.BOLD, 25));
            // lblmatch.setBorder(BorderFactory.createLineBorder(Color.black,5));
            lblmatch.setOpaque(true);
            lblmatch.setVisible(false);
            totalGUI.add(lblmatch);
// номер боя


            lblMatchNo.setLocation(10, 555);
            lblMatchNo.setSize(140, 135);
            lblMatchNo.setHorizontalAlignment(0);
            lblMatchNo.setVerticalAlignment(0);
            lblMatchNo.setFont(new Font("Arial", Font.BOLD, 70));
            lblMatchNo.setForeground(Color.white);
            lblMatchNo.setBorder(BorderFactory.createLineBorder(Color.white,5));
            lblMatchNo.setBackground(Color.black);
            lblMatchNo.setOpaque(true);
            lblMatchNo.setVisible(false);
            totalGUI.add(lblMatchNo);
//      таймер

            lbltimer1.setLocation(440, 2);
            lbltimer1.setSize(400, 120);
            lbltimer1.setHorizontalAlignment(0);
            lbltimer1.setVerticalAlignment(0);
            lbltimer1.setFont(new Font("Arial", Font.BOLD, 135));
            lbltimer1.setForeground(Color.white);
            lbltimer1.setBackground(Color.black);
            lbltimer1.setOpaque(true);
            totalGUI.add(lbltimer1);




// номер раунда
            round.setLocation(10, 10);
            round.setSize(370, 70);
            round.setHorizontalAlignment(2);
            round.setFont(new Font("Arial",Font.BOLD,60));
            round.setBackground(Color.black);
            round.setOpaque(true);
            round.setForeground(Color.white);
            round.setVisible(false);
            totalGUI.add(round);

            roundt.setLocation(10, 10);
            roundt.setSize(370, 70);
            roundt.setHorizontalAlignment(2);
            roundt.setFont(new Font("Arial",Font.BOLD,60));
            roundt.setBackground(Color.black);
            roundt.setOpaque(true);
            roundt.setForeground(Color.white);
            totalGUI.add(roundt);

            //  судья 1


            rs1.setLocation(670, 565);
            rs1.setSize(150, 60);
            rs1.setHorizontalAlignment(0);
            rs1.setFont(new Font("Arial",Font.BOLD,60));
            rs1.setForeground(Color.white);
            rs1.setBackground(Color.red);
            rs1.setOpaque(true);
rs1.setVisible(false);
            totalGUI.add(rs1);

            bs1.setLocation(670, 630);
            bs1.setSize(150, 60);
            bs1.setHorizontalAlignment(0);
            bs1.setForeground(Color.white);
            bs1.setBackground(Color.blue);
            bs1.setFont(new Font("Arial",Font.BOLD,60));
            bs1.setOpaque(true);
            bs1.setVisible(false);

            totalGUI.add(bs1);

            //  судья 2

            rs2.setLocation(820, 565);
            rs2.setSize(150, 60);
            rs2.setHorizontalAlignment(0);
            rs2.setForeground(Color.white);
            rs2.setBackground(Color.red);
            rs2.setFont(new Font("Arial",Font.BOLD,60));
            rs2.setOpaque(true);
            rs2.setVisible(false);


            totalGUI.add(rs2);

            bs2.setLocation(820, 630);
            bs2.setSize(150, 60);
            bs2.setHorizontalAlignment(0);
            bs2.setForeground(Color.white);
            bs2.setBackground(Color.blue);
            bs2.setFont(new Font("Arial",Font.BOLD,60));
            bs2.setOpaque(true);
            bs2.setVisible(false);

            totalGUI.add(bs2);


            //судья 3
            rs3.setLocation(970, 565);
            rs3.setSize(150, 60);
            rs3.setHorizontalAlignment(0);
            rs3.setForeground(Color.white);
            rs3.setBackground(Color.red);
            rs3.setFont(new Font("Arial",Font.BOLD,60));
            rs3.setOpaque(true);
            rs3.setVisible(false);


            totalGUI.add(rs3);

            bs3.setLocation(970, 630);
            bs3.setSize(150, 60);
            bs3.setHorizontalAlignment(0);
            bs3.setForeground(Color.white);
            bs3.setBackground(Color.blue);
            bs3.setFont(new Font("Arial",Font.BOLD,60));
            bs3.setOpaque(true);
            bs3.setVisible(false);

            totalGUI.add(bs3);
            // судья 4



            //участники 1 и 2
            rcompetitor.setLocation(160, 565);
            rcompetitor.setSize(510, 60);
            rcompetitor.setHorizontalAlignment(0);
            rcompetitor.setForeground(Color.white);
            rcompetitor.setBackground(Color.red);
            rcompetitor.setFont(new Font("Arial",Font.BOLD,40));
            rcompetitor.setOpaque(true);
            rcompetitor.setVisible(false);

            totalGUI.add(rcompetitor);

            bcompetitor.setLocation(160, 630);
            bcompetitor.setSize(510, 60);
            bcompetitor.setHorizontalAlignment(0);
            bcompetitor.setForeground(Color.white);
            bcompetitor.setBackground(Color.blue);
            bcompetitor.setFont(new Font("Arial",Font.BOLD,40));
            bcompetitor.setOpaque(true);
            bcompetitor.setVisible(false);

            totalGUI.add(bcompetitor);




            // общие очки
            btotal.setLocation(175, 150);
            btotal.setSize(450, 450);
            btotal.setHorizontalAlignment(0);
            btotal.setFont(new Font("Arial",Font.BOLD,370));
            btotal.setForeground(Color.white);
            btotal.setBackground(Color.blue);
            btotal.setBorder(BorderFactory.createLineBorder(Color.white,3));
            btotal.setOpaque(true);

            totalGUI.add(btotal);
            rtotal.setLocation(625, 150);
            rtotal.setSize(450, 450);
            rtotal.setHorizontalAlignment(0);
            rtotal.setForeground(Color.white);
            rtotal.setBackground(Color.red);
            rtotal.setFont(new Font("Arial",Font.BOLD,370));
            rtotal.setBorder(BorderFactory.createLineBorder(Color.white,3));
            rtotal.setOpaque(true);
            totalGUI.add(rtotal);
// штрафы

            rpenalty.setLocation(1072, 150);
            rpenalty.setSize(163, 225);
            rpenalty.setHorizontalAlignment(0);
            rpenalty.setBackground(Color.yellow);
            rpenalty.setOpaque(true);
            rpenalty.setBorder(BorderFactory.createLineBorder(Color.white,3));
            rpenalty.setFont(new Font("Arial",Font.BOLD,130));

            totalGUI.add(rpenalty);



            bpenalty.setLocation(15, 150);
            bpenalty.setSize(163, 225);
            bpenalty.setHorizontalAlignment(0);
            bpenalty.setBackground(Color.yellow);
            bpenalty.setOpaque(true);
            bpenalty.setBorder(BorderFactory.createLineBorder(Color.white,3));
            bpenalty.setFont(new Font("Arial",Font.BOLD,130));
            totalGUI.add(bpenalty);

//  предупреждения

            rwarnings.setLocation(1072, 372);
            rwarnings.setSize(163, 228);
            rwarnings.setHorizontalAlignment(0);
            rwarnings.setForeground(Color.black);
            rwarnings.setBackground(Color.LIGHT_GRAY);
            rwarnings.setOpaque(true);
            rwarnings.setBorder(BorderFactory.createLineBorder(Color.white,3));
            rwarnings.setFont(new Font("Arial",Font.BOLD,130));

            totalGUI.add(rwarnings);


            bwarnings.setLocation(15, 372);
            bwarnings.setSize(163, 228);
            bwarnings.setHorizontalAlignment(0);
            bwarnings.setForeground(Color.black);
            bwarnings.setBackground(Color.lightGray);
            bwarnings.setOpaque(true);
            bwarnings.setFont(new Font("Arial",Font.BOLD,130));
            bwarnings.setBorder(BorderFactory.createLineBorder(Color.white,3));
            totalGUI.add(bwarnings);



            totalGUI.setOpaque(true);


            return totalGUI;





        }

    }






