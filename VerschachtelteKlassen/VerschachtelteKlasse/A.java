package VerschachtelteKlasse;

public class A { //Toplevel Class/Äußere Klasse
	
	public void main(String args[]) {
		new A().new B();
		A a = new A();
		B b = a.new B();
	}
	
	//
	private int i = 12;
	protected class B{//Nested Class/Innere Klasse
		private int a = i;
	}
	
	//
	A(){
		C c = new C();
		c.x = 5;
	}
	class C{//Nested Class/Innere Klasse
		int x = 10;
	}
	
	//
	class D{//Nested Class/Innere Klasse
		//static int a = 0; //Fehler Innere Klassen können keine static Variablen erhalten
		static final int b = 12; //Innere Klassen können static final bestitzen
	}
}
