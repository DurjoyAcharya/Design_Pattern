package ImageEncryptionAndDecryption;

import javax.swing.*;
import java.awt.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.InputMismatchException;

public class Window extends JFrame {
    private Font font;
    private JTextField textfield;
    private JButton button;
    private String msg;
    private int temp=0;
    private JFileChooser chooser;
    private FileInputStream fis;
    private FileOutputStream fos;
    public Window() throws HeadlessException {
        setTitle("Image Encryption");
        setSize(400,400);
        setLocationRelativeTo(null);
        font=new Font("Roboto",Font.BOLD,25);
        setLayout(new FlowLayout());
        Button();
        TextField();
        add(textfield);
        add(button);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    //for creating buttom
    private void Button()
    {
        button= new JButton();
        button.setText("OpenImage");
        button.setFont(font);
        button.addActionListener(e->{
            System.out.println("Processing......");
            msg=textfield.getText();
            try{
                 temp=Integer.parseInt(msg);
                 Operate(temp);
            }catch (InputMismatchException error)
            {
                error.printStackTrace();
            }
            System.out.println(msg);
        });
    }

    private void Operate(int key) {
        chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        var selectedFile = chooser.getSelectedFile();
        try{
            fis=new FileInputStream(selectedFile);
            byte[] data=new byte[fis.available()];
            fis.read(data);
            int i=0;
            for (byte b:data) {

                data[i]=(byte)(b^key);
                i++;
            }
            fos=new FileOutputStream(selectedFile);
            fos.write(data);
            fos.close();
            fis.close();
            JOptionPane.showMessageDialog(null,"Done");

        }catch (IOException ee)
        {
            ee.printStackTrace();
        }
    }
    private void TextField()
    {
        textfield=new JTextField(10);
        textfield.setFont(font);
    }
}
