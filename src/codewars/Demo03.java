package codewars;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Demo03.playPass("MY GRANMA CAME FROM NY ON THE 23RD OF APRIL 2015", 2));

	}
	
	public static String playPass(String s, int n) {
		// your code
		char[] passphrases = s.toCharArray();
		for (int i = 0; i < passphrases.length; i++) {
			Pattern pattern_letter_u = Pattern.compile("^[A-Z]+$");
			Matcher matcher_letter_u = pattern_letter_u.matcher(passphrases[i]+"");
			Pattern pattern_letter_l = Pattern.compile("^[a-z]+$");
			Matcher matcher_letter_l = pattern_letter_l.matcher(passphrases[i]+"");
			Pattern pattern_num = Pattern.compile("^[0-9]*$");
			Matcher matcher_num = pattern_num.matcher(passphrases[i]+"");
			if( matcher_letter_u.matches()) {
				if(passphrases[i]+n>90) {
					passphrases[i] = (char) (passphrases[i]+n-26);
				} else 
			    passphrases[i] = (char) (passphrases[i]+n);
			}
			if( matcher_letter_l.matches()) {
				if(passphrases[i]+n>122) {
					passphrases[i] = (char) (passphrases[i]+n-26);
				} else 
			    passphrases[i] = (char) (passphrases[i]+n);
			}
			if (matcher_num.matches()) {
				passphrases[i] = ((9-(Integer.parseInt(passphrases[i]+"")))+"").charAt(0);
			}
			if (i%2!=0) {
				 passphrases[i] = (passphrases[i]+"").toLowerCase().charAt(0);
			} else {
				 passphrases[i] = (passphrases[i]+"").toUpperCase().charAt(0);
			}
		}
		String string = "";
		for (int i = passphrases.length-1; i >= 0; i--) {
			string += passphrases[i];
		}
		return string;
	}

}
