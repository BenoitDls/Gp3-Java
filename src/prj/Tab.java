package prj;

import java.util.Scanner;

public class Tab extends Game{
	Scanner scan = new Scanner(System.in);
	String ouiOuNon2;
	String oui = "o";
	String non = "n";

	int scoreTotal;
	int i;
	int count;

	public Tab() {
	}

	public void displayTab() {
		Joueur score = new Joueur();

		do {
			for (int test = 0; test <=5; test++) {

				int min = 0;
				// modifier la valeur suivant le nombre de possiblit� de jeu
				// dans le tableau
				int max = 5;
				int r = min + (int) (Math.random() * ((max - min) + 1));
				// valeur qui d�termine le choix du jeu, la ligne du tableau
				int choixJeu = r;

				// tableau chaque ligne correspond a un jeu doff�rent
				// la cinqui�me valeur dune ligne correspond tounours a la
				// reponse
				// la sixieme valeur correspond toujour au nombre de lettre de
				// la r�ponse
				String jeu[][] = { { "Pomme", "Fraise", "P�che", "Cerise", "fruit", "5" },
						{ "Epinard", "Carrotte", "Pomme de terre", "Courge", "l�gume", "6" },
						{ "France", "Russie", "Mexique", "Allemagne", "pays", "4" },
						{ "Vert", "Violet", "Orange", "Blanc", "couleur", "7" },
						{ "Tennis", "Natation", "Danse", "Athl�tisme", "sport", "5" },
						{ "Lion", "Gu�pard", "Panterre", "Crocodile", "animal", "6" } };

				// case du tableau correspondant a la reponse du jeu
				String reponseJeu = jeu[choixJeu][4];
				String lettreJeu = jeu[choixJeu][5];

				int taille = reponseJeu.length();

				// affiche les mot du jeu
				System.out.println("\n1." + jeu[choixJeu][0] + " 2." + jeu[choixJeu][1] + " 3." + jeu[choixJeu][2]
						+ " 4." + jeu[choixJeu][3]);
				System.out.print("\nLe mot est constitu� de " + lettreJeu + " lettres parmis les lettre suivantes : ");

				System.out.println(letters(reponseJeu, taille));

				System.out.println("Le mot est :");
				String reponse = scan.nextLine();

				int essaie = 0;

				// si la premiere reponse est bonne
				if (reponse.equalsIgnoreCase(reponseJeu)) {
					essaie++;
					if (essaie >= 3) {
						scoreTotal = scoreTotal + 1;
						System.out.println(
								"Dommage tu as trouv� la r�ponse en plus de 3 essais! Tu gagnes seulement 1 point");
					} else if (essaie == 2) {
						scoreTotal = scoreTotal + 2;
						System.out.println("Bravo tu as trouver la r�ponse en 2 essais! Tu gagnes 2 points.");
					} else if (essaie == 1) {
						scoreTotal = scoreTotal + 3;
						System.out.println("Bravo tu as trouver la r�ponse en 1 essais! Tu gagnes 3 points.");
					}else if (essaie >=8){
						scoreTotal = scoreTotal + 0;
						System.out.println("Dommage tu as trouv� la r�ponse en plus de 8 essais! tu ne gagnes pas de point.");
					}

					// si la premiere reponse est fausse
				}

				else if (reponse.equalsIgnoreCase("exit")) {
					break;
				}

				else {
					String reponse2;
					do {
						System.out.println("Mauvaise r�ponse! \nLe mot est :");
						reponse2 = scan.nextLine();
						essaie++;
						count++;
						if (count >= 2) {
							System.out.println("Le mot commence par la lettre : " + reponseJeu.charAt(0));
						}
						// si une des reponses suivantes est bonne
					} while (!reponse2.equalsIgnoreCase(reponseJeu));
					essaie++;
					if (essaie >= 3) {
						scoreTotal = scoreTotal + 1;
						System.out.println("Dommage tu as trouv� la r�ponse en plus de 3 essais tu gagnes seulement 1 point.");
					} else if (essaie == 2) {
						scoreTotal = scoreTotal + 2;
						System.out.println("Bravo tu as trouver la r�ponse en 2 essais! tu gagnes 2 points.");
					} else if (essaie == 1) {
						scoreTotal = scoreTotal + 3;
						System.out.println("Bravo tu as trouver la r�ponse en 1 essais! Tu gagnes 3 points.");
					}
					else if (essaie >=8){
						scoreTotal = scoreTotal + 0;
						System.out.println("Dommage tu as trouv� la r�ponse en plus de 8 essais tu ne gagnes pas de point.");
					}
				}

				System.out.println("Score : " + scoreTotal + "\n");
			}

			System.out.println("Voulez vous rejouez ? (O/N)");
			ouiOuNon2 = scan.nextLine();

			while (!oui.equalsIgnoreCase(ouiOuNon2) && (!non.equalsIgnoreCase(ouiOuNon2))) {
				System.out.println("\nSelectionner O ou N :");
				ouiOuNon2 = scan.nextLine();
			}
		} while(ouiOuNon2.equalsIgnoreCase(oui));

	}
	
	public int getTotal(){
		return scoreTotal;
	}
	
	public String getAnswer(){
		return ouiOuNon2;
	}

	public char[] letters(String reponseJeu, int taille) {
		char[] tab = new char[taille];
		char[] tab1 = new char[0];
		char temp;
		for (i = 0; i < taille; i++) {
			tab[i] = reponseJeu.charAt(i);
		}

		for (i = 0; i < (taille) - 1; i++) {
			int j = (int) (Math.random() * (i + 1));// j est une valeur
													// al�atoire
			temp = tab[i];
			tab[i] = tab[j];
			tab[j] = temp;
		}

		for (i = 0; i < taille; i++) {
			int min1 = 97;
			int max1 = 122;
			int p = min1 + (int) (Math.random() * ((max1 - min1) + 1));
			int lettre = p;
			System.out.print((char) lettre);
			System.out.print(tab[i]);
		}
		return tab1;
	}
}
