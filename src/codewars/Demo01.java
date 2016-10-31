package codewars;

import java.util.ArrayList;

public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(dbLinear(10));

	}
	
	public static int dbLinear(int n) {
	    // Your code goes here. Have fun!
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(new Integer(1));
		int gt = 0;
		int lt = 0;
		int eq = 0;
		while (gt+lt-eq<n) {
			int a = 2*arrayList.get(lt)+1;
			int b = 3*arrayList.get(gt)+1;
			if (a<b) {
				arrayList.add(new Integer(a));
				lt++;
			} else if (a>b) {
				arrayList.add(new Integer(b));
				gt++;
			} else {
				arrayList.add(new Integer(a));
				lt++;
				gt++;
				eq++;
			}
		}
		return arrayList.get(n);
	  }
	

}
