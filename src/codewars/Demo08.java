package codewars;

public class Demo08 {

	public static void main(String[] args) {
		

	}
	
    public static int largestDifference(int[] data) {
    	int diff = data.length-1;
    	while (diff>0) {
			for (int i = 0; i + diff < data.length; i++) {
				if (data[i]<=data[i+diff])
					return diff;
			}
			diff--;
		}
        return 0;

    }

}
