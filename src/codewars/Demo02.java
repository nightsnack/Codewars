package codewars;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo02 {
	public static void main(String[] args) {
//		System.out.println(Demo2.sumDigNthTerm(10, new long[] {2, 1, 3}, 6));
		  Pattern pattern = Pattern.compile("^[A-Za-z]+$");
		  Matcher matcher = pattern.matcher("#A!C");
		  boolean b= matcher.matches();
		  System.out.println(b);
	}
	
    public static long sumDigNthTerm(long initval, long[] patternl, int nthterm) {
        int cyclenth = patternl.length;
        long sum = 0;
        for (long num:patternl) {
        	sum += num;
        }
        int remainder = (nthterm-1) % cyclenth;
        int cycle = (nthterm-1) / cyclenth;
//        cycle = cycle-1;
        long res = initval+sum*cycle;
        for (int i = 0; i < remainder; i++) {
			res += patternl[i];
		}
        String number = res+"";
        long resp = 0;
//        char[] num_arr = number.toCharArray();
        for (int i = 0; i < number.length(); i++) {
//        	resp+=number.charAt(i);
			resp += Long.parseLong(number.charAt(i)+"");
		}
    	return resp;
    }

}
