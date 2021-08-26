package TemplatePattern.frame;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    private static final long SerialVersionUID=2L;

    public MyFrame(String title) throws HeadlessException {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,300);
        this.setVisible(true);
    }
    public void Paint(Graphics graphics)
    {
        super.paint(graphics);
        var msg="Durjoy Acharya";
        graphics.drawString(msg,100,100);
    }

    public static void main(String[] args) {
        var myframe=new MyFrame("da-durjoy@outlook.com");
            myframe.Paint(new DebugGraphics());
    }
}
