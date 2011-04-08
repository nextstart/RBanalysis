package stacktest;

import java.util.Stack;

public class TestStack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Stack mystack1 = new Stack();
	Stack mystack2 = new Stack();
	
	for(int i=0;i<=20;i++)
	mystack1.push(i);
	for(int j=0;j<=20;j++)
	mystack2.push(j);
	
	System.out.println("Stack is mystack1");
	for(int i=0; i<=20;i++)
    System.out.println(mystack1.pop());
	
	System.out.println("Stack is mystack2");
	for(int j=0; j<=20;j++)
    System.out.println(mystack2.pop());
	
	
		
	}

}
