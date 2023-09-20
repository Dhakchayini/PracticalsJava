package Condition;

public class Ifclass {
	
	int i=55;
	private void rupees() {
		if(i>40&&i<=60)
		{
			System.out.println("You marked as Second Class");
		}
		else if(i>=60 && i<=100)
		{
			System.out.println("You marked as Distinct Class");
		}
		else
		{
			System.out.println("You are Failed");
		}
	}
	
	
	
	
	

	public static void main(String[] args) {
		
		Ifclass a=new Ifclass();
		a.rupees();
	}


}