package main;

/**
 * Created by Andrew on 24.04.2017.
 */


import additional.gamepad1;
import additional.gamepad2;
import additional.gamepad3;
import additional.gamepad4;
import org.lwjgl.LWJGLException;
import org.lwjgl.input.Controllers;

import javax.swing.*;
import java.awt.*;
    /**
     * Created by Andrew on 15.02.2017.
     */

    public class mainform {
        public static BookTableModel btm = new BookTableModel();

        public static org.lwjgl.input.Controller controller1;
        public static org.lwjgl.input.Controller controller2;
        public static org.lwjgl.input.Controller controller3;
        public static org.lwjgl.input.Controller controller4;
        public static JFrame frame3 = new JFrame("History log");
        public static  JFrame frame1 = new JFrame("Экран 2");

        public static void main (String[] args){
            JFrame.setDefaultLookAndFeelDecorated(true);
            JFrame frame = new JFrame("Админка");

            adminscreen demo = new adminscreen ();
            frame.setContentPane(demo.createContentPane());

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(1280,800);
            frame.setVisible(true);
            //  frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
            JFrame.setDefaultLookAndFeelDecorated(true);



            mainscreen demo1 = new mainscreen ();
            frame1.setContentPane(demo1.createContentPane());

            frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame1.setSize(1280,720);
            frame1.setVisible(true);
            frame1.getContentPane().setBackground(Color.BLACK);

            JFrame.setDefaultLookAndFeelDecorated(true);

            // JFrame frame3 = new JFrame("History log");
//frame3.setSize(1200,1200);
            JPanel panel = new JPanel();
            panel.setLayout(new BorderLayout());
            // BookTableModel btm = new BookTableModel();
            JTable table = new JTable(btm);

            JScrollPane tableContainer = new JScrollPane(table);

            panel.add(tableContainer, BorderLayout.CENTER);
            frame3.setState(JFrame.ICONIFIED);
            frame3.getContentPane().add(panel);

            frame3.pack();
            frame3.setSize(800,800);
            frame3.setVisible(true);
            try {
                Controllers.create();
            }catch (LWJGLException e)
            {
                e. printStackTrace();
            }
            Controllers.poll();

            controller1= Controllers.getController(0);
        controller2= Controllers.getController(1);
        controller3= Controllers.getController(2);
       controller4= Controllers.getController(3);


            while (true) {
                try {
                    Thread.sleep(100);

                } catch (Exception e) {
                }

                gamepad1 ng1 = new gamepad1();
                gamepad2 ng2 = new gamepad2();
                gamepad3 ng3 = new gamepad3();
                gamepad4 ng4 = new gamepad4();









                }
            }
        }




