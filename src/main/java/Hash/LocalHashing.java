package Hash;


import java.util.Arrays;

public class LocalHashing {
public static void main(String[] args)
{
    String[] old={"Jan","Tim","Mia","Sam","Leo","Ted","Bea","Lou","Ada","Max","Zoe"};
    //Arrays.stream(ConvertIntoHashing(old)).forEach(System.out::println);
    String[] update=Arrays.copyOf(ConvertIntoHashing(old),old.length);
    System.out.println(Find(update,"Jan"));
    System.out.println(Find(update,"Cue"));
}
private static String[] ConvertIntoHashing(String[] old)
{
    String[] Update=new String[old.length];

    for (int i = 0; i < old.length; i++) {
        int index=SumOfAscii(old[i])% old.length;
        Update[i]=old[index];
    }
    return Update;
}
private static int ASCII_value(char c)
{
    return c;
}
private static char ASCII(int n)
{
    return (char) n;
}
private static int SumOfAscii(String str)
{
    int ans=0;
    for (int i = 0; i < str.length(); i++)
        ans+=ASCII_value(str.charAt(i));
    return ans;
  }
  private static String Find(String[] HashStr,String key)
  {
      final String s = HashStr[SumOfAscii(key) % HashStr.length];
      if (key==s)
            return "Matching";
      else return "Not Matching";
  }
}
