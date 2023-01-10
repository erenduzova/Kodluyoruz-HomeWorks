package question9;

public class Main {

	public static void main(String[] args) {

		MyList liste = new MyList();

		System.out.println(liste);

		liste.add("Eren");
		System.out.println(liste);
		
		for (int i = 0; i < 6; i++) {
			liste.add("Cem");
			System.out.println(liste);
		}
		

	}

}
