import java.util.Scanner;


public class RepeatedNoInArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt();
		int a[]=new int[len];
		for(int i=0;i<len;i++){
			a[i]=sc.nextInt();
		}for(int i=0;i<len;i++){
			for(int j=1;j<len-1;j++){
				if(a[i]==a[j]){
					System.out.println(a[i]);
				}
			}
		}
	}

}