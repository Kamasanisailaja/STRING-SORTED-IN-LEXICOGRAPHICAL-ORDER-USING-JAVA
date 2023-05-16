import java.util.*;
public class Stringsorted {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String s=sc.nextLine();
        char c[]=s.toCharArray();
        Arrays.sort(c);
        for(char t:c)
        {
            System.out.println(t);
        }

    }
}
