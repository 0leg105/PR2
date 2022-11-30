package VerschachtelteKlasse;

public class arten {
	
	//Nonstatic Member Class
	class A{
		class B{}
	}
	
	//Local Class
	class C{
		void methode() {
			class D{}
		}
	}

}
