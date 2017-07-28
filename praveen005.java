package test;
import java.util.Scanner;
public class Student 
{
	public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	String a=sc.next();
	String d=new StringBuffer(a).reverse().toString();
	System.out.println(d);

}

}