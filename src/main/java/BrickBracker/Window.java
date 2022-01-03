package BrickBracker;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Window extends JFrame {
    private String string="Icon.png";
    public Window() throws HeadlessException {
        setBounds(10,10,700,600);
        setTitle("Brick Ball");
        loadIcon(string);
        add(new gamePlay());
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    //set icon image
    private void loadIcon(String strPath)
    {
        var icon=new ImageIcon(strPath);
        setIconImage(icon.getImage());
    }
}
