package codewars;


public class Demo07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Demo07.convertBits(7, 17));
		System.out.println(Integer.bitCount(7^17));
		System.out.println(Integer.toBinaryString(7));
		System.out.println(Integer.toBinaryString(17));

	}


	    public static int convertBits(int a, int b) {
	    	String str_a = new String(Integer.toBinaryString(a)+"");
	    	String str_b = new String(Integer.toBinaryString(b)+"");
	    	char[] strarr_a;
	    	char[] strarr_b;
	    	if (str_a.length()>str_b.length())
	    	{
	    		strarr_a = str_a.toCharArray();
		    	strarr_b = str_b.toCharArray();
	    	}
	    	else {
	    		strarr_a = str_b.toCharArray();
		    	strarr_b = str_a.toCharArray();
	    	}
	    	int x = strarr_a.length-strarr_b.length;
	    	int k = 0;
	    	for (int i = 0; i <strarr_a.length; i++) {
	    		if(i>=x)
	    		{
	    			if (strarr_a[i] != strarr_b[i-x]) {
						k++;
					}
	    		} else if (strarr_a[i]=='1') {
					k++;
				}
			}
	      return k;
	    }
//		10010100111011000000111111000
//		00000010101100010010101011001
}
