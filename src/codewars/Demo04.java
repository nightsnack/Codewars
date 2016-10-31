package codewars;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    System.out.println(Arrays.toString(john(11).toArray()));
		System.out.println(Arrays.toString(ann(6).toArray()));
		System.out.println(sumJohn(75));
		System.out.println(sumAnn(150));
	}
	
    public static ArrayList<Long> john(long n) {
        // your code
    	ArrayList<Long> john = new ArrayList<Long>();
    	ArrayList<Long> ann = new ArrayList<Long>();
    	john.add((long) 0);
    	ann.add((long) 1);
    	for (int i = 1; i < n; i++) {  
			john.add(i-ann.get(john.get(i-1).intValue()));
			ann.add(i-john.get(ann.get(i-1).intValue()));
		}
    	return john;
    }
    
    public static ArrayList<Long> ann(long n) {
    	ArrayList<Long> john = new ArrayList<Long>();
    	ArrayList<Long> ann = new ArrayList<Long>();
    	john.add((long) 0);
    	ann.add((long) 1);
    	for (int i = 1; i < n; i++) {  
			john.add(i-ann.get(john.get(i-1).intValue()));
			ann.add(i-john.get(ann.get(i-1).intValue()));
		}
    	return ann;
    }
    
    public static long sumJohn(long n) {
    	ArrayList<Long> sumj = john(n);
    	long sum = 0;
    	for (int i = 0; i < sumj.size(); i++) {
			sum+=sumj.get(i);
		}
    	return sum;
    }
    
    public static long sumAnn(long n) {
    	ArrayList<Long> suma = ann(n);
    	long sum = 0;
    	for (int i = 0; i < suma.size(); i++) {
			sum+=suma.get(i);
		}
    	return sum;
    }

}
