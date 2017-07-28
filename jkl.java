import java.util.*;
public class Uunique
{
    public static void main(String args[])
    {
        int t=0,i;
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        for(i=0;i<n;i++)
        {
            t=t^a[i];
               
        }
         System.out.println(t);
    }
    
}