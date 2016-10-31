package codewars;

public class Demo12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Demo12.howmuch(1, 100)+"\n\r"+Demo12.howmuch(1, 60));

	}
	
	public static String howmuch(int m, int n) {
		// your code
		if (m>=n) {
			int x = n;
			n = m;
			m = x;
		}
		int high = (n-1)/9+1;
		int low = (m-1)/9;
		String str = new String();
		for (int i = low+1; i < high; i++) {
			if ((9*i-1)%7==0) {
				str = str+"[M: "+(9*i+1)+" B: "+(9*i-1)/7+" C: "+i+"]";
			}
		}
		return "["+str+"]";
	}

}
