package StringFunction;

public class Types {

	public static void main(String[] args) {
		// Immutable String type
		String a = "1";
		String b = "1";
		String c = "Swathy@02";
		String d = "cycle";
		System.out.println("Immutable Stringtype memoery address:");
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		System.out.println(System.identityHashCode(c));
		System.out.println(System.identityHashCode(d));
		System.out.println(System.identityHashCode(c = a + c));
		System.out.println(System.identityHashCode(d = a + b + c + d));
//mutable stringtype
		System.out.println("Mutable storage Details : ");
		StringBuffer n= new StringBuffer("Ali");
		StringBuffer p =new StringBuffer("Baaba");
		StringBuffer q = new StringBuffer("Ali");
		System.out.println(System.identityHashCode(n));
		System.out.println(System.identityHashCode(q));
		System.out.println(System.identityHashCode(p));
		System.out.println(System.identityHashCode(p=n.append(p)));
			}
}
