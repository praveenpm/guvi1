package matrix;
public class PalinCheck {
	 static long ss=0;;

	public static void main(String[] args) {
		String inString = "1,2,94,8901";
		String[] s=inString.split(",");
		printCombo(s, s.length - 1);
		System.out.println(ss);
	}

	public static void printCombo(String[] inputString, int len) {
		if (len > 0) {
			if (len == inputString.length - 1) {
				generateAllPalindromeSequences(inputString);
			}
			String[] charArr = inputString;
			int count;
			String temp;
			printCombo(inputString, len-1);
			printCombo(inputString, len-1);
			printCombo(inputString, len-1);
			for (count = len - 1; count < inputString.length; count++) {
				temp = charArr[count];
				charArr[count] = charArr[count + 1];
				charArr[count + 1] = temp;
				{
					generateAllPalindromeSequences(charArr);
					printCombo(charArr, len -1);
				}
				if (count == (inputString.length - 2)) {
					break;
				}
			}
		}
	}

	public static void generateAllPalindromeSequences(String seq[]) {
		String s=new String();
		for(int i=0;i<seq.length;i++){
			s+=seq[i];
		}
			if(ss<Long.parseLong(s))
			{
				ss=Long.parseLong(s);
			}
		
	}
	}