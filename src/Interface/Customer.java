package Interface;

public class Customer implements supermarket, wholesaleshop {

	@Override
	public void oil() {
		System.out.println("Gingelly oil");
		
	}

	@Override
	public void rice() {
		System.out.println("Ponni Rice");
		
	}

	@Override
	public void grocery() {
		System.out.println("Biscuits");
		
	}

	@Override
	public void vegetables(String greens, String watery) {
		System.out.println("Green Veggies:"+ greens);
		System.out.println("Watery Veggies:"+ watery);
	}

	@Override
	public void fruits(String seasons, String regular) {
		System.out.println("Season Fruits:"+ seasons);
		System.out.println("Regular Fruits:"+ regular);
	}
	
	public static void main(String[] args) {
		Customer a = new Customer();
		
		a.oil();
		a.rice();
		a.grocery();
		a.vegetables("Spinach", "bottle");
	a.fruits("Ice Apple", "Apple");
	}

	@Override
	public void nuts(String drynuts, String freshnuts) {
		System.out.println("Drynuts " + drynuts);
		System.out.println("Freshnuts " + freshnuts);
		
	}
	
}

	

	