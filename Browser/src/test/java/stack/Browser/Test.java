package stack.Browser;

import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Big is garden";
		
		String desired="";
	
		String b[]=a.split(" ");
		
		for (int i = 0; i < b.length; i++) {
			System.out.println("  "+b[i]);
			desired=desired+b[i].charAt(0);
			
		}

		System.out.println(" " +desired);
	}

}
