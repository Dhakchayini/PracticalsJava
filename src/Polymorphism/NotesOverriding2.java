package Polymorphism;

public class NotesOverriding2 extends NotesOverriding1 { // Overriding Method

	@Override
	public void kalki(String bookname, String bookname1) {

		super.kalki("PS1", "Sivagamiyin sabatham");
		System.out.println("Display Book Name:" + bookname1);
	}

public static void main(String[] args) {
	NotesOverriding2 a =new NotesOverriding2();
	a.kalki("PS2", "Sivagami2");
		
}
}
