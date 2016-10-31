package codewars;

public class Demo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Demo10.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));

	}
	
	public static String createPhoneNumber(int[] numbers) {
	    // Your code here!
		return new String('('+""+numbers[0]+numbers[1]+numbers[2]+')'+" "+numbers[3]+numbers[4]+numbers[5]+"-"+numbers[6]+numbers[7]+numbers[8]+numbers[9]);
	}

}
