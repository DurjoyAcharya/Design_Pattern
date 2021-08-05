package ObserverPattern;

import jdk.jfr.Event;

import javax.swing.*;
import java.awt.*;

public class SwingObserverCreated {
        JFrame jFrame;
        public void Go()
        {
            jFrame=new JFrame();
            JButton jButton=new JButton("Should I do it?");
            jButton.addActionListener(Event->{
                System.out.println("Don't do it you might regret it");
            });
            jButton.addActionListener(Event->{
                System.out.println("Come On Do It?");
            });
            jFrame.getContentPane().add(BorderLayout.CENTER,jButton);
            jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jFrame.setSize(300,300);
            jFrame.setVisible(true);
        }

    public static void main(String[] args) {
        new SwingObserverCreated().Go();
    }
}
