package TempleteMathodPatternJava.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
    public static void main(String...durjoy) throws IOException {
        var scan=new BufferedReader(new InputStreamReader(System.in));
        Network network=null;
        System.out.print("Input UserName: ");
        var Name=scan.readLine();
        System.out.print("Input PassWord: ");
        var pass=scan.readLine();
        System.out.println("Create Post Input Message: ");
        var post=scan.readLine();
        System.out.println("Please Choice the platform where you want to post\n\n" +
                "1. Facebook\n" +
                "2. Twitter\n");
        var choice= Integer.parseInt(scan.readLine());
        if (choice==1)
            network=new Facebook(Name,pass);
        else if (choice==2)
            network=new Twitter(Name,pass);
        network.Post(post);

    }
}
