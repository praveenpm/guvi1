package vc;

public class polindrome {

	public static void main(String[] args) {
	String str="1212166";
	String revstring="";
	for(int i=str.length()-1;i>=0;--i){
		revstring+=str.charAt(i);
			}
		System.out.println(revstring);
		if(revstring.equalsIgnoreCase(str))
		{
		System.out.println("the string is palindrome");
	}
	else
		{
		System.out.println("not palindrome");
		}
}
}
