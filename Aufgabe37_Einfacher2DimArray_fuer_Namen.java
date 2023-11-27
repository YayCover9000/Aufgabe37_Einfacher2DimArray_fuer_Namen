import java.util.Scanner;
public class Aufgabe37_Einfacher2DimArray_fuer_Namen {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int zeilen = 2;
		
//		int zeilen = sc.nextInt();
		
		//ArrayBau(zeilen,2);
		//Namensliste_einlesen();
		Namenliste();
		sc.close();
	}
	private static void ArrayBau(int zeilen, int spalten) {
		Scanner VN = new Scanner(System.in);
		
		String[][] array = new String[zeilen][spalten];
		
		for(int i = 0; i < array.length; i++) {
			for(int j  = 0; j < array[i].length; j++) {
//				array[i][j] = "Vor/Nachname";
				array[i][j] = VN.next();
			}
		}
		
		for(String[] e : array) {
			for(String k : e) {
				System.out.print(" " + k);
			}
					
		System.out.println();
		}
			VN.close();
	}
	// Möglichkeit 2 BESSER
	private static void Namensliste_einlesen() {
		// Scanner zum Einlesen von Benutzereingaben
        Scanner scanner = new Scanner(System.in);

        // Anzahl der Personen in der Liste
        System.out.print("Anzahl der Personen: ");
        int numPersons = scanner.nextInt();
        scanner.nextLine(); // Verbrauche den Zeilenwechsel im Puffer

        // Arrays für Vornamen und Nachnamen
        String[][] vornameArray = new String[numPersons][];
        String[][] nachnameArray = new String[numPersons][];

        // Benutzereingabe für jeden Eintrag in der Liste
        for (int i = 0; i < numPersons; i++) {
            System.out.print("Geben Sie den vollständigen Namen für Person " + (i + 1) + " ein (Vornamen, Nachnamen): ");
            String fullName = scanner.nextLine();

            // Trennen von Vornamen und Nachnamen durch Komma
            String[] nameParts = fullName.split(",", 2);

            // Trennen von mehreren Vornamen und Nachnamen
            vornameArray[i] = nameParts[0].split("\\s*,\\s*");
            nachnameArray[i] = nameParts[1].split("\\s*,\\s*");
        }

        // Ausgabe der Namensliste
        System.out.println("\nNamensliste:");
        for (int i = 0; i < numPersons; i++) {
            System.out.print("Person " + (i + 1) + ": Vornamen = ");
            for (String vorname : vornameArray[i]) {
                System.out.print(vorname + " ");
            }
            System.out.print(", Nachnamen = ");
            for (String nachname : nachnameArray[i]) {
                System.out.print(nachname + " ");
            }
            System.out.println();
        }

        // Schließen Sie den Scanner
        scanner.close();
	}
	// möglichkeit 3 AM BESTEN
		private static void Namenliste() {
		// Scanner zum Einlesen von Benutzereingaben
	    Scanner scanner = new Scanner(System.in);
	
	    // Anzahl der Personen in der Liste
	    System.out.print("Anzahl der Personen: ");
	    int numPersons = scanner.nextInt();
	    scanner.nextLine(); // Verbrauche den Zeilenwechsel im Puffer
	
	    // Arrays für Vornamen und Nachnamen
	    String[][] vornameArray = new String[numPersons][];
	    String[][] nachnameArray = new String[numPersons][];
	
	    // Benutzereingabe für jeden Eintrag in der Liste
	    for (int i = 0; i < numPersons; i++) {
	        System.out.print("Geben Sie den vollständigen Namen für Person " + (i + 1) + " ein (Nachname, Vorname): ");
	        String fullName = scanner.nextLine();
	
	        // Trennen von Nachnamen und Vornamen durch Komma
	        String[] nameParts = fullName.split(",", 2);
	
	        // Trennen von mehreren Nachnamen und Vornamen
	        nachnameArray[i] = nameParts[0].split("\\s*,\\s*");
	        vornameArray[i] = nameParts[1].split("\\s*,\\s*");
	    }
	
	    // Ausgabe der Namensliste
	    System.out.println("\nNamensliste:");
	    for (int i = 0; i < numPersons; i++) {
	        System.out.print("Person " + (i + 1) + ": Vorname = ");
	        for (String vorname : vornameArray[i]) {
	            System.out.print(vorname + " ");
	        }
	        System.out.print(", Nachname = ");
	        for (String nachname : nachnameArray[i]) {
	            System.out.print(nachname + " ");
	        }
	
	        // Ausgabe des vollständigen Namens
	        System.out.println("\nVollständiger Name: " + String.join(" ", vornameArray[i]) + " " + String.join(" ", nachnameArray[i]));
	        System.out.println();
	    }
	
	    // Schließen Sie den Scanner
	    scanner.close();
	}
}
