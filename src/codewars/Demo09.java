package codewars;

import java.util.Stack;

public class Demo09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Demo09.isValid(new char[] {'n','s','n','s','n','s','n','s','n','s'}));

	}
	
	public static boolean isValid(char[] walk) {
		if (walk.length!=10)
			return false;
		final Stack<String> stack = new Stack<>();
		String[] arr = new String[walk.length];
		int i=0;
		for (char c : walk) {
			arr[i] = c+"";
			i++;
		}

        for (final String direction : arr) {
            final String lastElement = stack.size() > 0 ? stack.lastElement() : null;

            switch(direction) {
                case "n": if ("s".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
                case "s": if ("n".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
                case "e":  if ("w".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
                case "w":  if ("e".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
            }
        }
        if (stack.isEmpty())
		    return true;
        else
        	return false;
	}

}
