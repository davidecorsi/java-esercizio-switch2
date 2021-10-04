import java.util.Scanner;

/*
 * Scrivete un applicazione che chieda all'utente una stringa e calcoli il numero di occorrenze di ogni
 * vocale.
 */
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Inserisci una stringa ");
		String s = input.nextLine();
		int a = 0;
		int e = 0;
		int i = 0;
		int o = 0;
		int u = 0;
		for(int j = 0; j < s.length(); j++) {
			char c = s.charAt(j);
			switch(c) {
			case 'A':
			case 'a':
				a++;
				break;
			case 'E':
			case 'e':
				e++;
				break;
			case 'I':
			case 'i':
				i++;
				break;
			case 'O':
			case 'o':
				o++;
				break;
			case 'U':
			case 'u':
				u++;
				break;
			}
		}
		System.out.println("Il numero di occorrenze di A è " + a);
		System.out.println("Il numero di occorrenze di E è " + e);
		System.out.println("Il numero di occorrenze di I è " + i);
		System.out.println("Il numero di occorrenze di O è " + o);
		System.out.println("Il numero di occorrenze di U è " + u);
	}
}
