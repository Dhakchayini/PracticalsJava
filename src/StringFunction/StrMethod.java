package StringFunction;

public class StrMethod {

	public static void main(String[] args) {
		String a = "Kaaju";
		String b = "Laddu";
		String c = " Rasamalai";
		String d = "RASAMALAI";
		String f = "RASAMALAI";
		String h="  ";
		System.out.println("lenght of the string is:"+a.length());
		boolean e = d.equals(c);
		System.out.println("String is equal or not:"+ e);
		boolean equalsIgnoreCase = d.equalsIgnoreCase(c);
		System.out.println("String with Ignorecase:"+equalsIgnoreCase);
		String upperCase = b.toUpperCase();
		System.out.println(upperCase);
		String lowerCase = d.toLowerCase();
		System.out.println(lowerCase);
		boolean startsWith = b.startsWith("l");
		System.out.println(startsWith);
		boolean endsWith = d.endsWith("I");
		System.out.println(endsWith);
		boolean contains = a.contains("Aaj");
		System.out.println(contains);
		int indexOf = c.indexOf("a");
		System.out.println(indexOf);
		int lastIndexOf = d.lastIndexOf("A");
		System.out.println(lastIndexOf);
		char charAt = a.charAt(4);
		System.out.println(charAt);
		String replace = c.replace("Rasamalai", "Boondhi");
		System.out.println(replace);
		String substring = d.substring(3);
		System.out.println(substring);
		System.out.println(c);
		String trim = c.trim();
		System.out.println(trim);
		String concat = a.concat(b);
		System.out.println(concat);
		System.out.println(f==d);
		boolean empty = h.isEmpty();
		System.out.println(empty);
	}
}
