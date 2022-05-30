package arrayMatrix;
import java.util.*;

public class stack {

	public static void main(String[] args) {
		
		//Stack Program 
		
		stackP stackObj=new stackP();
		stackObj.push('a');
		stackObj.push('b');
		stackObj.push('c');
		System.out.println(stackObj.pop());
		System.out.println(stackObj.pop());
	}
}
