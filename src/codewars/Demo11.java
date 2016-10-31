package codewars;

public class Demo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Demo11.isPerfectPower(8));

	}
	
	public static int[] isPerfectPower(int n) {
		int[] x = new int[2];
		for (int i = 2; i < Math.log(n) / Math.log(2)+1; i++) {
			for (int j = 2; Math.pow(j, i) <=n ;j++ ) {
				if (Math.pow(j, i)==n) {
//					System.out.println(j+" "+i);
					x[0] = j;
					x[1] = i;
					return x;
				}
			}
		}
		return null;
	}

}
