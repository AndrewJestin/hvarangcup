package main;

import additional.*;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static main.mainform.btm;
import static main.mainform.frame3;
import static main.mainscreen.*;

/**
 * Created by Daha on 24.04.2017.
 */
//import static additional.TimerListener.brkcount;


    /**
     * Created by Andrew on 24.02.2017.
     */


    public class adminscreen {
        public static int screen=1;
        public static JTextField lblUmpire1 = new JTextField("Umpire 1");
        public static JTextField lblUmpire2= new JTextField("Umpire 2");
        public static JTextField lblUmpire3 = new JTextField("Umpire 3");
        public static JTextField lblUmpire4 = new JTextField("Umpire 4");
        public static JLabel category = new JLabel("TOTAL:");
        public static int brk = 0;
        public static int tmaxround = 1;  // количество раундов в  поединке
        public static int tmaxmin = 0;  // количество минут в раунде
        public static int tmaxsec = 0;  // количество секунд в раунде
        public static int brkcount = 0; // время перерыва
        public static int min = 0;
        public static int rglobal = 0;
        public static int bglobal = 0;
        public static int rglobal1 = 0;
        public static int bglobal1 = 0;
        public static int rglobal2 = 0;
        public static int bglobal2 = 0;
        public static int rglobal3 = 0;
        public static int bglobal3 = 0;
        public static int rglobal4 = 0;
        public static int bglobal4 = 0;
        public static int count = 0;
        public static int amount = 0;
        public static int amountt = 0;
        public static int amountb = 0;
        public static int amountbt = 0;
        public static int ar;
        public static int ab;
        public static int amount2 = 0;
        public static int amount2t = 0;
        public static int amountb2 = 0;
        public static int amountb2t = 0;
        public static int ar2;
        public static int ab2;
        public static int amount3 = 0;
        public static int amount3t = 0;
        public static int amountb3 = 0;
        public static int amountb3t = 0;
        public static int ar3;
        public static int ab3;
        public static int amount4 = 0;
        public static int amount4t = 0;
        public static int amountb4 = 0;
        public static int amountb4t = 0;
        public static int ar4;
        public static int ab4;
        public static int rndnum = 1;
        public static int startstop = 2;
        public static int brktime=0;
        public static int br;
        public static int rwarning = 0;
        public static int bwarning = 0;
        public static int wr;
        public static int wb;
        public static JLabel rwarnings1 = new JLabel("0");
        public static JLabel bwarnings1 = new JLabel("0");
        public static JLabel btotal1 = new JLabel("0");
        public static JLabel rtotal1 = new JLabel("0");
        public static JLabel rpenalty11 = new JLabel("0");
        public static JLabel bpenalty11 = new JLabel("0");
        public static int rpen = 0;
        public static int bpen = 0;
        public static int rpenal;
        public static int bpenal;
        public static JTextField rcompetitor1 = new JTextField("Red");
        public static JTextField bcompetitor1 = new JTextField("Blue");
        public static JLabel rs11 = new JLabel("0");
        public static JLabel bs11 = new JLabel("0");
        public static JLabel rs22 = new JLabel("0");
        public static JLabel bs22 = new JLabel("0");
        public static JLabel rs33 = new JLabel("0");
        public static JLabel bs33 = new JLabel("0");
        public static JLabel rs44 = new JLabel("0");
        public static JLabel bs44 = new JLabel("0");
        public static JLabel rs11t = new JLabel("0");
        public static JLabel bs11t = new JLabel("0");
        public static JLabel rs22t = new JLabel("0");
        public static JLabel bs22t = new JLabel("0");
        public static JLabel rs33t = new JLabel("0");
        public static JLabel bs33t = new JLabel("0");
        public static JLabel rs44t = new JLabel("0");
        public static JLabel bs44t = new JLabel("0");
        public static JLabel bs5 = new JLabel("0");
        public static JLabel rs5 = new JLabel("0");
        public static int raddpoint = 0;
        public static int baddpoint = 0;

        public static JLabel lbltimer = new JLabel("00:00");
       // public static JLabel roundstop = new JLabel("Rounds");
        public static JLabel minutestop = new JLabel("Minutes");
        public static JLabel secondsstop = new JLabel("Seconds");
       // public static JLabel breeaktop = new JLabel("Break");
        public static JLabel timmaxround = new JLabel(tmaxround + "");
        public static JLabel timmaxmin = new JLabel("");
        public static JLabel timmaxsec = new JLabel("");
        public static JLabel timbreaktime = new JLabel();
        public static JButton btnlog = new JButton("Show log");
        public static JLabel round1 = new JLabel(rndnum + "");
        public static Timer timer;
        public static JButton btnplusmaxrnd = new JButton("+");
        public static JButton btnminusmaxrnd = new JButton("-");
        public static JButton btnplusmaxmin = new JButton("+");
        public static JButton btnminusmaxmin = new JButton("-");
        public static JButton btnplusmaxsec = new JButton("+");
        public static JButton btnminusmaxsec = new JButton("-");
        public static JButton btnplusbrk = new JButton("+");
        public static JButton btnminusbrk = new JButton("-");
        public static JButton ekran1 = new JButton("1920*1080");
        public static JCheckBox bbelts = new JCheckBox();
        public static JButton btnWatch = new JButton("START");
          public static JButton theme = new JButton("Black");
        public static int rowarray = 0;
        public static int matchno1 = 1;
        public static JButton btnplusmatch = new JButton("+");
        public static JButton btnminusmatch = new JButton("-");
        public static JLabel lblMatchNo1 = new JLabel(matchno1 + "");



        public JPanel createContentPane() {




            JPanel totalGUI = new JPanel();
            totalGUI.setLayout(null);

//JLabel lblMatchNo1  = new JLabel(matchno+"");
            lblMatchNo1.setLocation(50, 630);
            lblMatchNo1.setSize(100, 110);
            lblMatchNo1.setHorizontalAlignment(0);
            lblMatchNo1.setForeground(Color.black);
            //  lblMatchNo1.setVerticalAlignment(0);
            lblMatchNo1.setFont(new Font("Arial", Font.BOLD, 45));
            lblMatchNo1.setBorder(BorderFactory.createLineBorder(Color.black, 2));

            // timer.setBackground(Color.yellow);
            lblMatchNo1.setOpaque(true);
            totalGUI.add(lblMatchNo1);


            JLabel freeware = new JLabel("Secondary screen resolution must be 1280x720                                             This program is distributed free of charge!                                         (C) Andrei Jestin  jestin.andrei@gmail.com   ");
            freeware.setLocation(10, 750);
            freeware.setSize(1250, 15);
            freeware.setHorizontalAlignment(0);
            //freeware.setBackground(Color.white);
            freeware.setOpaque(true);
            freeware.setForeground(Color.black);
            freeware.setFont(new Font("Arial",Font.ITALIC,15));
            totalGUI.add(freeware);

// кнопка прибавления номера боя
//JButton btnplusmatch = new JButton("+");
            btnplusmatch.setLocation(10, 630);
            btnplusmatch.setSize(40, 55);

            btnplusmatch.setFont(new Font("Arial", Font.BOLD, 25));
            btnplusmatch.setBorder(BorderFactory.createLineBorder(Color.black));
            // btnplusmaxrnd.setBackground(Color.red);
            btnplusmatch.addActionListener(new maxmatch());
            btnplusmatch.setVisible(true);
            totalGUI.add(btnplusmatch);

//  кнопка вычитания номера боя
            //   JButton btnminusmatch = new JButton("-");
            btnminusmatch.setLocation(10, 685);
            btnminusmatch.setSize(40, 55);

            btnminusmatch.setFont(new Font("Arial", Font.BOLD, 25));
            btnminusmatch.setBorder(BorderFactory.createLineBorder(Color.black));
            // btnminusmaxrnd.setBackground(Color.red);
            btnminusmatch.addActionListener(new maxmatch());
            btnminusmatch.setVisible(true);
            totalGUI.add(btnminusmatch);


//lbl category
            category.setLocation(50, 75);
            category.setSize(170, 50);
            category.setHorizontalAlignment(0);
            category.setForeground(Color.black);
            category.setFont(new Font("Arial", Font.BOLD, 40));
            // lblcategory.setBorder(BorderFactory.createLineBorder(Color.black));
            category.setOpaque(true);

            totalGUI.add(category);


            lblUmpire1.setLocation(500, 600);
            lblUmpire1.setSize(145, 30);
            lblUmpire1.setHorizontalAlignment(0);
            lblUmpire1.setForeground(Color.black);
            lblUmpire1.setFont(new Font("Arial", Font.BOLD, 15));
            // lblcategory.setBorder(BorderFactory.createLineBorder(Color.black));
            lblUmpire1.setOpaque(true);
            totalGUI.add(lblUmpire1);

            lblUmpire2.setLocation(650, 600);
            lblUmpire2.setSize(145, 30);
            lblUmpire2.setHorizontalAlignment(0);
            lblUmpire2.setForeground(Color.black);
            lblUmpire2.setFont(new Font("Arial", Font.BOLD, 15));
            // lblcategory.setBorder(BorderFactory.createLineBorder(Color.black));
            lblUmpire2.setOpaque(true);
            totalGUI.add(lblUmpire2);

            lblUmpire3.setLocation(800, 600);
            lblUmpire3.setSize(145, 30);
            lblUmpire3.setHorizontalAlignment(0);
            lblUmpire3.setForeground(Color.black);
            lblUmpire3.setFont(new Font("Arial", Font.BOLD, 15));
            // lblcategory.setBorder(BorderFactory.createLineBorder(Color.black));
            lblUmpire3.setOpaque(true);
            totalGUI.add(lblUmpire3);

            lblUmpire4.setLocation(950, 600);
            lblUmpire4.setSize(145, 30);
            lblUmpire4.setHorizontalAlignment(0);
            lblUmpire4.setForeground(Color.black);
            lblUmpire4.setFont(new Font("Arial", Font.BOLD, 15));
            lblUmpire4.setOpaque(true);
            totalGUI.add(lblUmpire4);



            // кнопка прибавления секунд

            btnplusmaxsec.setLocation(1100, 200);
            btnplusmaxsec.setSize(40, 40);

            btnplusmaxsec.setFont(new Font("Arial", Font.BOLD, 25));
            btnplusmaxsec.setBorder(BorderFactory.createLineBorder(Color.black));
            btnplusmaxsec.addActionListener(new maxsec());
            btnplusmaxsec.setVisible(true);
            totalGUI.add(btnplusmaxsec);

//  кнопка вычитания секунд

            btnminusmaxsec.setLocation(1100, 280);
            btnminusmaxsec.setSize(40, 40);
            btnminusmaxsec.setFont(new Font("Arial", Font.BOLD, 25));
            btnminusmaxsec.setBorder(BorderFactory.createLineBorder(Color.black));
            btnminusmaxsec.addActionListener(new maxsec());
            btnminusmaxsec.setVisible(true);
            totalGUI.add(btnminusmaxsec);

// кнопка прибавления раундов

            btnplusmaxrnd.setLocation(900, 200);
            btnplusmaxrnd.setSize(40, 40);
            btnplusmaxrnd.setFont(new Font("Arial", Font.BOLD, 25));
            btnplusmaxrnd.setBorder(BorderFactory.createLineBorder(Color.black));
            btnplusmaxrnd.addActionListener(new maxrnd());
            btnplusmaxrnd.setVisible(false);
            totalGUI.add(btnplusmaxrnd);

//  кнопка вычитания раундов

            btnminusmaxrnd.setLocation(900, 280);
            btnminusmaxrnd.setSize(40, 40);
            btnminusmaxrnd.setFont(new Font("Arial", Font.BOLD, 25));
            btnminusmaxrnd.setBorder(BorderFactory.createLineBorder(Color.black));
            btnminusmaxrnd.addActionListener(new maxrnd());
            btnminusmaxrnd.setVisible(false);
            totalGUI.add(btnminusmaxrnd);

// кнопка прибавления минут

            btnplusmaxmin.setLocation(1000, 200);
            btnplusmaxmin.setSize(40, 40);
            btnplusmaxmin.setFont(new Font("Arial", Font.BOLD, 25));
            btnplusmaxmin.setBorder(BorderFactory.createLineBorder(Color.black));
            btnplusmaxmin.addActionListener(new maxmin());
            btnplusmaxmin.setVisible(true);
            totalGUI.add(btnplusmaxmin);

//  кнопка вычитания минут

            btnminusmaxmin.setLocation(1000, 280);
            btnminusmaxmin.setSize(40, 40);
            btnminusmaxmin.setFont(new Font("Arial", Font.BOLD, 25));
            btnminusmaxmin.setBorder(BorderFactory.createLineBorder(Color.black));
            btnminusmaxmin.addActionListener(new maxmin());
            btnminusmaxmin.setVisible(true);
            totalGUI.add(btnminusmaxmin);

            // кнопка прибавления перерыва

            btnplusbrk.setLocation(1200, 200);
            btnplusbrk.setSize(40, 40);
            btnplusbrk.setFont(new Font("Arial", Font.BOLD, 25));
            btnplusbrk.setBorder(BorderFactory.createLineBorder(Color.black));
            btnplusbrk.addActionListener(new maxbrk());
            btnplusbrk.setVisible(false);
            totalGUI.add(btnplusbrk);

//  кнопка вычитания перерыва

            btnminusbrk.setLocation(1200, 280);
            btnminusbrk.setSize(40, 40);
            btnminusbrk.setFont(new Font("Arial", Font.BOLD, 25));
            btnminusbrk.setBorder(BorderFactory.createLineBorder(Color.black));
            btnminusbrk.addActionListener(new maxbrk());
            btnminusbrk.setVisible(false);
            totalGUI.add(btnminusbrk);

//  кол-во раундов в таймере
            timmaxround.setLocation(900, 240);
            timmaxround.setSize(40, 40);
            timmaxround.setHorizontalAlignment(0);
            timmaxround.setOpaque(true);
            timmaxround.setBorder(BorderFactory.createLineBorder(Color.black));
            timmaxround.setForeground(Color.black);
            timmaxround.setFont(new Font("Arial", Font.BOLD, 25));
            timmaxround.setVisible(false);
            totalGUI.add(timmaxround);

//  кол-во минут в таймере
            timmaxmin.setLocation(1000, 240);
            timmaxmin.setSize(40, 40);
            timmaxmin.setHorizontalAlignment(0);
            timmaxmin.setOpaque(true);
            timmaxmin.setBorder(BorderFactory.createLineBorder(Color.black));
            timmaxmin.setForeground(Color.black);
            timmaxmin.setFont(new Font("Arial", Font.BOLD, 25));
            totalGUI.add(timmaxmin);
//  кол-во секунд в таймере
            timmaxsec.setLocation(1100, 240);
            timmaxsec.setSize(40, 40);
            timmaxsec.setHorizontalAlignment(0);
            timmaxsec.setOpaque(true);
            timmaxsec.setBorder(BorderFactory.createLineBorder(Color.black));
            timmaxsec.setForeground(Color.black);
            timmaxsec.setFont(new Font("Arial", Font.BOLD, 25));
            totalGUI.add(timmaxsec);
// продолжительность перерыва

            timbreaktime.setLocation(1200, 240);
            timbreaktime.setSize(40, 40);
            timbreaktime.setHorizontalAlignment(0);
            timbreaktime.setOpaque(true);
            timbreaktime.setBorder(BorderFactory.createLineBorder(Color.black));
            timbreaktime.setForeground(Color.black);
            timbreaktime.setFont(new Font("Arial", Font.BOLD, 25));
            timbreaktime.setVisible(false);
            totalGUI.add(timbreaktime);

// номер раунда
            round1.setLocation(910, 20);
            round1.setSize(70, 70);
            round1.setHorizontalAlignment(0);
            round1.setBackground(Color.yellow);
            round1.setOpaque(true);
            round1.setBorder(BorderFactory.createLineBorder(Color.black));
            round1.setForeground(Color.black);
            round1.setFont(new Font("Arial", Font.BOLD, 45));
            round1.setVisible(false);
            totalGUI.add(round1);

//      таймер

            lbltimer.setLocation(960, 20);
            lbltimer.setSize(220, 70);
            lbltimer.setHorizontalAlignment(0);
            lbltimer.setForeground(Color.black);
            lbltimer.setVerticalAlignment(0);
            lbltimer.setFont(new Font("Arial", Font.BOLD, 60));
            lbltimer.setBorder(BorderFactory.createLineBorder(Color.black));
            lbltimer.setOpaque(true);
            totalGUI.add(lbltimer);

            // табличка rounds
//
//            roundstop.setLocation(870, 150);
//            roundstop.setSize(100, 40);
//            roundstop.setHorizontalAlignment(0);
//            roundstop.setForeground(Color.black);
//            roundstop.setVerticalAlignment(0);
//            roundstop.setFont(new Font("Arial", Font.BOLD, 20));
//            roundstop.setOpaque(true);
//            totalGUI.add(roundstop);
            // табличка minutes

            minutestop.setLocation(970, 150);
            minutestop.setSize(100, 40);
            minutestop.setHorizontalAlignment(0);
            minutestop.setForeground(Color.black);
            minutestop.setVerticalAlignment(0);
            minutestop.setFont(new Font("Arial", Font.BOLD, 20));
            minutestop.setOpaque(true);
            totalGUI.add(minutestop);
            // табличка seconds
            secondsstop.setLocation(1070, 150);
            secondsstop.setSize(100, 40);
            secondsstop.setHorizontalAlignment(0);
            secondsstop.setForeground(Color.black);
            secondsstop.setVerticalAlignment(0);
            secondsstop.setFont(new Font("Arial", Font.BOLD, 20));
            secondsstop.setOpaque(true);
            totalGUI.add(secondsstop);
            // табличка Break
//            breeaktop.setLocation(1170, 150);
//            breeaktop.setSize(100, 40);
//            breeaktop.setHorizontalAlignment(0);
//            breeaktop.setForeground(Color.black);
//            breeaktop.setVerticalAlignment(0);
//            breeaktop.setFont(new Font("Arial", Font.BOLD, 20));
//            breeaktop.setOpaque(true);
//            totalGUI.add(breeaktop);

//  сброс
            JButton btnReset = new JButton("RESET");
            btnReset.setLocation(1100, 360);
            btnReset.setSize(120, 60);
            btnReset.setFont(new Font("Arial", Font.BOLD, 25));
            btnReset.setBorder(BorderFactory.createLineBorder(Color.black));
            btnReset.setBackground(Color.red);
            btnReset.addActionListener(new WatchButtonListener());
            btnReset.setVisible(true);
            totalGUI.add(btnReset);


//  старт таймера

            //JButton btnWatch = new JButton("Start");
            btnWatch.setLocation(900, 360);
            btnWatch.setSize(120, 60);
            btnWatch.setBackground(Color.green);
            btnWatch.setFont(new Font("Arial", Font.BOLD, 25));
            btnWatch.setBorder(BorderFactory.createLineBorder(Color.black));
            btnWatch.addActionListener((ActionListener) new WatchButtonListener());
            timer = new Timer(1000, new TimerListener());
            btnWatch.setVisible(true);
            totalGUI.add(btnWatch);

            // звуковой сигнал
            JButton btnSignal = new JButton("*Beep");
            btnSignal.setLocation(900, 440);
            btnSignal.setSize(120, 60);
            btnSignal.setFont(new Font("Arial", Font.BOLD, 25));
            btnSignal.setBorder(BorderFactory.createLineBorder(Color.black));
            btnSignal.addActionListener((ActionListener) new WatchButtonListener());
            btnSignal.setVisible(true);
            totalGUI.add(btnSignal);



            btnlog.setLocation(20, 540);
            btnlog.setSize(80, 30);
            btnlog.setFont(new Font("Arial", Font.BOLD, 10));
            btnlog.setBorder(BorderFactory.createLineBorder(Color.black));
            btnlog.addActionListener(new LogButtonListener());
            totalGUI.add(btnlog);

// штраф синий

            JButton penaltyplusblue = new JButton("+");
            penaltyplusblue.setLocation(750, 290);
            penaltyplusblue.setSize(50, 60);
            penaltyplusblue.setBackground(Color.yellow);
            penaltyplusblue.setForeground(Color.black);
            penaltyplusblue.setFont(new Font("Arial", Font.BOLD, 20));
            penaltyplusblue.setBorder(BorderFactory.createLineBorder(Color.black));
            penaltyplusblue.addActionListener(new penaltyblue());
            totalGUI.add(penaltyplusblue);

            JButton penaltyblueminus = new JButton("-");
            penaltyblueminus.setLocation(800, 290);
            penaltyblueminus.setSize(50, 60);
            penaltyblueminus.setBackground(Color.yellow);
            penaltyblueminus.setForeground(Color.black);
            penaltyblueminus.setFont(new Font("Arial", Font.BOLD, 20));
            penaltyblueminus.setBorder(BorderFactory.createLineBorder(Color.black));
            penaltyblueminus.addActionListener(new penaltyminusblue());
            totalGUI.add(penaltyblueminus);
//
//// штраф красный

            JButton penaltyplusred = new JButton("+");
            penaltyplusred.setLocation(150, 290);
            penaltyplusred.setSize(50, 60);
            penaltyplusred.setBackground(Color.yellow);
            penaltyplusred.setForeground(Color.black);
            penaltyplusred.setFont(new Font("Arial", Font.BOLD, 20));
            penaltyplusred.setBorder(BorderFactory.createLineBorder(Color.black));
            penaltyplusred.addActionListener(new penaltyred());
            totalGUI.add(penaltyplusred);

            JButton penaltyredminus = new JButton("-");
            penaltyredminus.setLocation(200, 290);
            penaltyredminus.setSize(50, 60);
            penaltyredminus.setBackground(Color.yellow);
            penaltyredminus.setForeground(Color.black);
            penaltyredminus.setBorder(BorderFactory.createLineBorder(Color.black));
            penaltyredminus.setFont(new Font("Arial", Font.BOLD, 20));
            penaltyredminus.addActionListener(new penaltyminusred());
            totalGUI.add(penaltyredminus);
            //предупреждения

            rwarnings1.setLocation(150, 350);
            rwarnings1.setSize(100, 150);
            rwarnings1.setHorizontalAlignment(0);
            rwarnings1.setForeground(Color.black);
            rwarnings1.setBorder(BorderFactory.createLineBorder(Color.black));
            rwarnings1.setVerticalAlignment(SwingConstants.TOP);
            rwarnings1.setFont(new Font("Arial", Font.BOLD, 75));
            totalGUI.add(rwarnings1);

            bwarnings1.setLocation(750, 350);
            bwarnings1.setSize(100, 150);
            bwarnings1.setHorizontalAlignment(0);
            bwarnings1.setVerticalAlignment(SwingConstants.TOP);
            bwarnings1.setForeground(Color.black);
            bwarnings1.setFont(new Font("Arial", Font.BOLD, 75));
            bwarnings1.setBorder(BorderFactory.createLineBorder(Color.black));
            totalGUI.add(bwarnings1);

            // штрафные очки
            rpenalty11.setLocation(150, 200);
            rpenalty11.setSize(100, 90);
            rpenalty11.setHorizontalAlignment(0);
            rpenalty11.setForeground(Color.black);
            rpenalty11.setVerticalAlignment(SwingConstants.BOTTOM);
            rpenalty11.setBorder(BorderFactory.createLineBorder(Color.black));
            rpenalty11.setFont(new Font("Arial", Font.BOLD, 75));
            rpenalty11.setBackground(Color.yellow);
            rpenalty11.setOpaque(true);
            totalGUI.add(rpenalty11);

            bpenalty11.setLocation(750, 200);
            bpenalty11.setSize(100, 90);
            bpenalty11.setHorizontalAlignment(0);
            bpenalty11.setForeground(Color.black);
            bpenalty11.setVerticalAlignment(SwingConstants.BOTTOM);
            bpenalty11.setFont(new Font("Arial", Font.BOLD, 75));
            bpenalty11.setBorder(BorderFactory.createLineBorder(Color.black));
            bpenalty11.setBackground(Color.yellow);
            bpenalty11.setOpaque(true);
            totalGUI.add(bpenalty11);

            // общие очки
            btotal1.setLocation(500, 200);
            btotal1.setSize(250, 300);
            btotal1.setHorizontalAlignment(0);
            btotal1.setForeground(Color.white);
            btotal1.setBackground(Color.blue);
            btotal1.setFont(new Font("Arial", Font.BOLD, 220));
            btotal1.setBorder(BorderFactory.createLineBorder(Color.black));
            btotal1.setOpaque(true);

            totalGUI.add(btotal1);
            rtotal1.setLocation(250, 200);
            rtotal1.setSize(250, 300);
            rtotal1.setHorizontalAlignment(0);
            rtotal1.setForeground(Color.white);
            rtotal1.setBackground(Color.red);
            rtotal1.setFont(new Font("Arial", Font.BOLD, 220));
            rtotal1.setBorder(BorderFactory.createLineBorder(Color.black));
            rtotal1.setOpaque(true);
            totalGUI.add(rtotal1);


// Сброс очков


            JButton resetButton = new JButton("RESET ALL");
            resetButton.setLocation(1120, 680);
            resetButton.setSize(120, 50);
            resetButton.setBackground(Color.white);
            resetButton.setForeground(Color.black);
            resetButton.addActionListener(new resetscore());
            totalGUI.add(resetButton);

            JButton btnnext = new JButton("NEXT");
            btnnext.setLocation(1120, 610);
            btnnext.setSize(120, 50);
            btnnext.setBackground(Color.white);
            btnnext.setForeground(Color.black);
            btnnext.addActionListener(new nextmatch());
            totalGUI.add(btnnext);


            // замечания синий

            JButton warningplusblue = new JButton("+");
            warningplusblue.setLocation(750, 440);
            warningplusblue.setSize(50, 60);
            warningplusblue.setBackground(Color.blue);
            warningplusblue.setForeground(Color.white);
            warningplusblue.setFont(new Font("Arial", Font.BOLD, 40));
            warningplusblue.addActionListener(new waringblue());
            warningplusblue.setBorder(BorderFactory.createLineBorder(Color.black));
            totalGUI.add(warningplusblue);


            JButton warningminusblue = new JButton("-");
            warningminusblue.setLocation(800, 440);
            warningminusblue.setSize(50, 60);
            warningminusblue.setBackground(Color.blue);
            warningminusblue.setForeground(Color.white);
            warningminusblue.setBorder(BorderFactory.createLineBorder(Color.black));

            warningminusblue.setFont(new Font("Arial", Font.BOLD, 40));
            warningminusblue.addActionListener(new warningblueminus());
            totalGUI.add(warningminusblue);

// замечания красный

            JButton warningplusred = new JButton("+");
            warningplusred.setLocation(150, 440);
            warningplusred.setSize(50, 60);
            warningplusred.setBackground(Color.red);
            warningplusred.setForeground(Color.white);
            warningplusred.setFont(new Font("Arial", Font.BOLD, 40));
            warningplusred.addActionListener(new warningred());
            warningplusred.setBorder(BorderFactory.createLineBorder(Color.black));
            totalGUI.add(warningplusred);


            JButton warningminusred = new JButton("-");
            warningminusred.setLocation(200, 440);
            warningminusred.setSize(50, 60);
            warningminusred.setBackground(Color.red);
            warningminusred.setForeground(Color.white);
            warningminusred.setBorder(BorderFactory.createLineBorder(Color.black));
            warningminusred.setFont(new Font("Arial", Font.BOLD, 40));


            warningminusred.addActionListener(new warningredminus());
            totalGUI.add(warningminusred);


            //участники 1 и 2

            rcompetitor1.setLocation(150, 630);
            rcompetitor1.setSize(350, 50);
            rcompetitor1.setHorizontalAlignment(0);
            rcompetitor1.setForeground(Color.white);
            rcompetitor1.setBackground(Color.red);
            rcompetitor1.setFont(new Font("Arial", Font.BOLD, 30));
            rcompetitor1.getDocument().addDocumentListener(new DocumentListener() {

                public void removeUpdate(DocumentEvent e) {
                    System.out.println("removeUpdate");
                    rcompetitor.setText("Red");
                }

                public void insertUpdate(DocumentEvent e) {
                    System.out.println("insertUpdate");
                    rcompetitor.setText(rcompetitor1.getText());
                }

                public void changedUpdate(DocumentEvent e) {
                    System.out.println("changedUpdate");
                    rcompetitor.setText(rcompetitor1.getText());
                }
            });
            rcompetitor1.setOpaque(true);

            totalGUI.add(rcompetitor1);

            bcompetitor1.setLocation(150, 690);
            bcompetitor1.setSize(350, 50);
            bcompetitor1.setHorizontalAlignment(0);
            bcompetitor1.setForeground(Color.white);
            bcompetitor1.setBackground(Color.blue);
            bcompetitor1.setFont(new Font("Arial", Font.BOLD, 30));
            bcompetitor1.setOpaque(true);
            bcompetitor1.getDocument().addDocumentListener(new DocumentListener() {

                public void removeUpdate(DocumentEvent e) {
                    System.out.println("removeUpdate");
                    bcompetitor.setText("Blue");
                }

                public void insertUpdate(DocumentEvent e) {
                    System.out.println("insertUpdate");
                    bcompetitor.setText(bcompetitor1.getText());
                }

                public void changedUpdate(DocumentEvent e) {
                    System.out.println("changedUpdate");
                    bcompetitor.setText(bcompetitor1.getText());
                }
            });
            totalGUI.add(bcompetitor1);
            //  судья 1


            rs11.setLocation(500, 630);
            rs11.setSize(150, 50);
            rs11.setHorizontalAlignment(0);
            rs11.setForeground(Color.white);
            rs11.setBackground(Color.red);
            rs11.setFont(new Font("Arial", Font.BOLD, 45));
            rs11.setOpaque(true);


            totalGUI.add(rs11);

            bs11.setLocation(500, 690);
            bs11.setSize(150, 50);
            bs11.setHorizontalAlignment(0);
            bs11.setForeground(Color.white);
            bs11.setBackground(Color.blue);
            bs11.setFont(new Font("Arial", Font.BOLD, 45));
            bs11.setOpaque(true);

            totalGUI.add(bs11);

            //  судья 2

            rs22.setLocation(650, 630);
            rs22.setSize(150, 50);
            rs22.setHorizontalAlignment(0);
            rs22.setForeground(Color.white);
            rs22.setBackground(Color.red);
            rs22.setFont(new Font("Arial", Font.BOLD, 45));
            rs22.setOpaque(true);


            totalGUI.add(rs22);

            bs22.setLocation(650, 690);
            bs22.setSize(150, 50);
            bs22.setHorizontalAlignment(0);
            bs22.setForeground(Color.white);
            bs22.setBackground(Color.blue);
            bs22.setFont(new Font("Arial", Font.BOLD, 45));
            bs22.setOpaque(true);

            totalGUI.add(bs22);


            //судья 3
            rs33.setLocation(800, 630);
            rs33.setSize(150, 50);
            rs33.setHorizontalAlignment(0);
            rs33.setForeground(Color.white);
            rs33.setBackground(Color.red);
            rs33.setFont(new Font("Arial", Font.BOLD, 45));
            rs33.setOpaque(true);


            totalGUI.add(rs33);

            bs33.setLocation(800, 690);
            bs33.setSize(150, 50);
            bs33.setHorizontalAlignment(0);
            bs33.setForeground(Color.white);
            bs33.setBackground(Color.blue);
            bs33.setFont(new Font("Arial", Font.BOLD, 45));
            bs33.setOpaque(true);

            totalGUI.add(bs33);
            // судья 4

            rs44.setLocation(950, 630);
            rs44.setSize(150, 50);
            rs44.setHorizontalAlignment(0);
            rs44.setForeground(Color.white);
            rs44.setBackground(Color.red);
            rs44.setFont(new Font("Arial", Font.BOLD, 45));
            rs44.setOpaque(true);


            totalGUI.add(rs44);

            bs44.setLocation(950, 690);
            bs44.setSize(150, 50);
            bs44.setHorizontalAlignment(0);
            bs44.setForeground(Color.white);
            bs44.setBackground(Color.blue);
            bs44.setFont(new Font("Arial", Font.BOLD, 45));
            bs44.setOpaque(true);

            totalGUI.add(bs44);

            rs5.setLocation(350, 501);
            rs5.setSize(50, 50);
            rs5.setHorizontalAlignment(0);
            rs5.setForeground(Color.white);
            rs5.setBackground(Color.red);
            rs5.setFont(new Font("Arial", Font.BOLD, 45));
            rs5.setOpaque(true);


            totalGUI.add(rs5);

            bs5.setLocation(600, 501);
            bs5.setSize(50, 50);
            bs5.setHorizontalAlignment(0);
            bs5.setForeground(Color.white);
            bs5.setBackground(Color.blue);
            bs5.setFont(new Font("Arial", Font.BOLD, 40));
            bs5.setOpaque(true);

            totalGUI.add(bs5);

            JButton lblraddpointplus = new JButton("+");
            lblraddpointplus.setLocation(250, 501);
            lblraddpointplus.setSize(100, 50);
            lblraddpointplus.setHorizontalAlignment(0);
            lblraddpointplus.setForeground(Color.white);
           // lblraddpointplus.setVerticalAlignment(SwingConstants.BOTTOM);
            lblraddpointplus.addActionListener(new raddpoints());
            lblraddpointplus.setFont(new Font("Arial", Font.BOLD, 45));
            lblraddpointplus.setBackground(Color.red);
            lblraddpointplus.setOpaque(true);
            totalGUI.add(lblraddpointplus);

            JButton lblraddpointminus = new JButton("-");
            lblraddpointminus.setLocation(400, 501);
            lblraddpointminus.setSize(100, 50);
            lblraddpointminus.setHorizontalAlignment(0);
            lblraddpointminus.setForeground(Color.white);
            //lblraddpointminus.setVerticalAlignment(SwingConstants.BOTTOM);
            lblraddpointminus.setFont(new Font("Arial", Font.BOLD, 45));
            lblraddpointminus.addActionListener(new rremovepoints());
            lblraddpointminus.setBackground(Color.red);
            lblraddpointminus.setOpaque(true);
            totalGUI.add(lblraddpointminus);

            JButton lblbaddpointplus = new JButton("+");
            lblbaddpointplus.setLocation(500, 501);
            lblbaddpointplus.setSize(100, 50);
            lblbaddpointplus.setHorizontalAlignment(0);
            lblbaddpointplus.setForeground(Color.white);
            // lblraddpointplus.setVerticalAlignment(SwingConstants.BOTTOM);
            lblbaddpointplus.addActionListener(new baddpoints());
            lblbaddpointplus.setFont(new Font("Arial", Font.BOLD, 45));
            lblbaddpointplus.setBackground(Color.blue);
            lblbaddpointplus.setOpaque(true);
            totalGUI.add(lblbaddpointplus);

            JButton lblbaddpointminus = new JButton("-");
            lblbaddpointminus.setLocation(650, 501);
            lblbaddpointminus.setSize(100, 50);
            lblbaddpointminus.setHorizontalAlignment(0);
            lblbaddpointminus.setForeground(Color.white);
            //lblraddpointminus.setVerticalAlignment(SwingConstants.BOTTOM);
            lblbaddpointminus.setFont(new Font("Arial", Font.BOLD, 45));
            lblbaddpointminus.addActionListener(new bremovepoints());
            lblbaddpointminus.setBackground(Color.blue);
            lblbaddpointminus.setOpaque(true);
            totalGUI.add(lblbaddpointminus);

            rs11t.setLocation(250, 50);
            rs11t.setSize(150, 50);
            rs11t.setHorizontalAlignment(0);
            rs11t.setForeground(Color.white);
            rs11t.setBackground(Color.red);
            rs11t.setFont(new Font("Arial", Font.BOLD, 45));
            rs11t.setOpaque(true);


            totalGUI.add(rs11t);

            bs11t.setLocation(250, 105);
            bs11t.setSize(150, 50);
            bs11t.setHorizontalAlignment(0);
            bs11t.setForeground(Color.white);
            bs11t.setBackground(Color.blue);
            bs11t.setFont(new Font("Arial", Font.BOLD, 45));
            bs11t.setOpaque(true);

            totalGUI.add(bs11t);

            //  судья 2

            rs22t.setLocation(400, 50);
            rs22t.setSize(150, 50);
            rs22t.setHorizontalAlignment(0);
            rs22t.setForeground(Color.white);
            rs22t.setBackground(Color.red);
            rs22t.setFont(new Font("Arial", Font.BOLD, 45));
            rs22t.setOpaque(true);
            totalGUI.add(rs22t);

            bs22t.setLocation(400, 105);
            bs22t.setSize(150, 50);
            bs22t.setHorizontalAlignment(0);
            bs22t.setForeground(Color.white);
            bs22t.setBackground(Color.blue);
            bs22t.setFont(new Font("Arial", Font.BOLD, 45));
            bs22t.setOpaque(true);
            totalGUI.add(bs22t);


            //судья 3
            rs33t.setLocation(550, 50);
            rs33t.setSize(150, 50);
            rs33t.setHorizontalAlignment(0);
            rs33t.setForeground(Color.white);
            rs33t.setBackground(Color.red);
            rs33t.setFont(new Font("Arial", Font.BOLD, 45));
            rs33t.setOpaque(true);
            totalGUI.add(rs33t);

            bs33t.setLocation(550, 105);
            bs33t.setSize(150, 50);
            bs33t.setHorizontalAlignment(0);
            bs33t.setForeground(Color.white);
            bs33t.setBackground(Color.blue);
            bs33t.setFont(new Font("Arial", Font.BOLD, 45));
            bs33t.setOpaque(true);
            totalGUI.add(bs33t);
            // судья 4

            rs44t.setLocation(700, 50);
            rs44t.setSize(150, 50);
            rs44t.setHorizontalAlignment(0);
            rs44t.setForeground(Color.white);
            rs44t.setBackground(Color.red);
            rs44t.setFont(new Font("Arial", Font.BOLD, 45));
            rs44t.setOpaque(true);
            totalGUI.add(rs44t);

            bs44t.setLocation(700, 105);
            bs44t.setSize(150, 50);
            bs44t.setHorizontalAlignment(0);
            bs44t.setForeground(Color.white);
            bs44t.setBackground(Color.blue);
            bs44t.setFont(new Font("Arial", Font.BOLD, 45));
            bs44t.setOpaque(true);

            totalGUI.add(bs44t);


            return totalGUI;


        }


        private class WatchButtonListener implements ActionListener {
            public void actionPerformed(ActionEvent event) {
                if (event.getActionCommand().equals("START")) {

                    min=tmaxmin;
                  count=tmaxsec;
                  brkcount=br;

                    btnWatch.setText("STOP");
                    btnWatch.setBackground(Color.yellow);
                    // btnReset.setEnabled(false);
                    sound.playSound("sounds/start2s.wav");
                    timer.start();


                    String[] str10 = new String[5];
                    str10[0] = "Jury President";
                    str10[1] = roundt.getText();
                    str10[2] = lbltimer.getText();
                    str10[3] = "New Team Sparring begins!";
                    str10[4] = rcompetitor.getText()+" " +rtotal.getText()+":" + btotal.getText()+" "+ bcompetitor.getText();
                    btm.addDate(str10);
                    btm.fireTableDataChanged();

                } else if (event.getActionCommand().equals("RESUME")) {
                    btnWatch.setBackground(Color.yellow);
                    btnWatch.setText("STOP");
                    timer.start();

                } else if (event.getActionCommand().equals("*Beep")) {
                    sound.playSound("sounds/pip.wav").join();

                } else if (event.getActionCommand().equals("RESET")) {
                    count = 0;
                    min = 0;
                    brk = 0;
                    rndnum = 1;

                    lbltimer.setText("00:00");
                    lbltimer1.setText("00:00");
                    timer.stop();
                    btnWatch.setText("START");
                    btnWatch.setBackground(Color.green);

                } else {
                    timer.stop();
                    btnWatch.setText("RESUME");
                    btnWatch.setBackground(Color.green);
                }
            }
        }

        private class LogButtonListener implements ActionListener {
            public void actionPerformed(ActionEvent event) {
                if (event.getActionCommand().equals("Show log")) {
                    frame3.setExtendedState(JFrame.NORMAL);
                    btnlog.setText("Hide log");


                } else if (event.getActionCommand().equals("Hide log")) {
                    frame3.setState(JFrame.ICONIFIED);
                    btnlog.setText("Show log");


                } else {

                }
            }
        }


      //  DefaultListModel model = new DefaultListModel();



    }








