package Polymorphism;

public class Overriding1 extends Overriding {

	@Override
	public void zomato(String menu) {

		super.zomato("Lunch");
		System.out.println("Full Meals");
	}

	@Override
	public void paymentmode(String paytype) {
		super.paymentmode("COD");
		System.out.println("Payment Mode :" + paytype);
	}

	public static void main(String[] args) {
	
	Overriding1 a = new Overriding1();
	a.zomato("Lunch");
	a.paymentmode("gpay");
	}
}
