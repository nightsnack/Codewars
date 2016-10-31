package codewars;

import java.util.Arrays;
import java.util.Stack;

public class Demo06 {

	public static void main(String[] args) {
		String [] arr = Demo06.dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH"});
		System.out.println(Arrays.toString(arr));

	}
	
	public static String[] dirReduc(String[] arr) {
        final Stack<String> stack = new Stack<>();

        for (final String direction : arr) {
            final String lastElement = stack.size() > 0 ? stack.lastElement() : null;

            switch(direction) {
                case "NORTH": if ("SOUTH".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
                case "SOUTH": if ("NORTH".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
                case "EAST":  if ("WEST".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
                case "WEST":  if ("EAST".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
            }
        }
        return stack.stream().toArray(String[]::new);
    }
	
    public static String[] dirReduc1(String[] arr) {
		Stack<String> stack = new Stack<>();
		stack.push(arr[0]);
		
    	for (int i = 1; i < arr.length; i++) {
            boolean flag = false;
			while(judgeReverse(arr[i],stack.peek().toString())) {
				stack.pop();
				if (i<arr.length-1)
					i++;
				else {
					flag = true;
					break;
				}
				if (stack.isEmpty()) {
					stack.push(arr[i]);
					if (i<arr.length-1)
						i++;
					else {
						flag = true;
						break;
					}
				}
			}
			if (!flag)
			stack.push(arr[i]);
		}
//    	stack.str
    	String[] o = new String[stack.size()];
    	Object[] obj = stack.toArray();
    	int i = 0;
    	for (Object oo:obj) 
    	{
    		o[i] = (String) oo;
    		i++;
    	}
        return o;
    }
    
    public static boolean judgeReverse(String A , String B) {
    	switch (A) {
		case "NORTH":
			if (B=="SOUTH") {
				return true;
			}
			return false;
		case "SOUTH":
			if (B=="NORTH") {
				return true;
			}
			return false;
		case "EAST":
			if (B=="WEST") {
				return true;
			}
			return false;
		case "WEST":
			if (B=="EAST") {
				return true;
			}
			return false;			
		}
		return false;
    }

}
