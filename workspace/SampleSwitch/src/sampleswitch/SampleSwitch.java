package sampleswitch;

public class SampleSwitch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i=0; i<6; i++)
		switch (i)
		{
		case 0:
			System.out.println("i is zero");
			break;
		case 1:
			System.out.println("i is one");
			break;
		case 2:
			System.out.println("i is two");
			break;	
		case 3:
			System.out.println("i is three");
			break;	
	    default:
	    	//throw new Error("i is greater than 3...");
	    	System.out.println("i is greater 3");	
		
		}
		
		
	}

}
