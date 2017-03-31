package prj;

import java.util.Scanner;

public class Level {

	Scanner scan = new Scanner(System.in);

	// M�thode qui d�termine le niveau et donc le tableau pour lequel le joueur
	// jouera
	public String[][] Afficher(String niveaux) {

		// Cr�ation d'un tableau � 2 dimansions vide de taille 6/6 pour stocker
		// les donn�es plus tard
		

		// Insertion des donn�es dans chaque tableau

		// Chaque ligne correspond a un jeu diff�rent
		// La cinqui�me valeur d'une ligne correspond toujours a la
		// r�ponse
		// La sixieme valeur correspond toujours au nombre de lettres dans
		// la r�ponse
		String[][] jeuNiveau1 = { { "Pomme", "Fraise", "P�che", "Cerise", "fruit", "5" },
				{ "Epinard", "Carrotte", "Pomme de terre", "Courge", "l�gume", "6" },
				{ "France", "Russie", "Mexique", "Allemagne", "pays", "4" },
				{ "Vert", "Violet", "Orange", "Blanc", "couleur", "7" },
				{ "Tennis", "Natation", "Danse", "Athl�tisme", "sport", "5" },
				{ "Lion", "Gu�pard", "Panterre", "Crocodile", "animal", "6" } };

		String[][] jeuNiveau2 = { { "Nike", "Addidas", "Apple", "Dell", "marque", "6" },
				{ "Averse", "Pleuvoir", "Crachin", "Bruine", "pluie", "5" },
				{ "Frayeur", "Effroi", "Epouvante", "Apeurer", "peur", "4" },
				{ "Acteur", "Studio", "Filmer", "Cin�aste", "cin�ma", "6" },
				{ "Vague", "Marin", "Mar�e", "Ecume", "mer", "3" },
				{ "Rivi�re", "Ruisseau", "Inondation", "Pluie", "eau", "3" } };

		String[][] jeuNiveau3 = { { "Sc�ne", "Drame", "Coulisses", "R�le", "th��tre", "7" },
				{ "Chapitre", "Pr�face", "D�dicace", "Page", "livre", "5" },
				{ "Journal", "T�l�vision", "Radio", "Internet", "media", "5" },
				{ "Enveloppe", "Date", "Signature", "Timbre", "lettre", "6" },
				{ "Classe", "El�ve", "Instituteur", "Craie", "�cole", "5" },
				{ "Rire", "Chant", "Heureux", "Sourire", "bonheur", "7" } };

		String[][] jeuNiveau4 = { { "Vue", "Odorat", "Ou�e", "Toucher", "sens", "4" },
				{ "Menuisier", "Ma�on", "Vendeur", "Professeur", "m�tier", "6" },
				{ ":)", "xD", ":p", "oO", "smiley", "6" },
				{ "George Clooney", "Hugh Jackman", "Mark Hamill", "Scarlett Johansson", "acteur", "6" },
				{ "Fanta", "Coca", "Orangina", "Pepsi", "soda", "4" },
				{ "Clafoutis", "Eclair", "Paris-Brest", "Macaron", "dessert", "7" } };
		
		String[][] jeu = new String[6][6];

		// V�rification du niveau choisit par l'utilisateur (valide ou non)
		while ((!niveaux.equalsIgnoreCase("1")) && (!niveaux.equalsIgnoreCase("2")) && (!niveaux.equalsIgnoreCase("3")) && (!niveaux.equalsIgnoreCase("4"))) {
			System.out.println("Error! Ce niveau n'existe pas!\n");
			System.out.println("Saisissez un niveau existant");
			niveaux = scan.nextLine();
		}
		
		if (niveaux.equalsIgnoreCase("1")) {
			jeu = jeuNiveau1;
		} else if (niveaux.equalsIgnoreCase("2")) {
			jeu = jeuNiveau2;
		} else if (niveaux.equalsIgnoreCase("3")) {
			jeu = jeuNiveau3;
		} else if (niveaux.equalsIgnoreCase("4")) {
			jeu = jeuNiveau4;
		}

		// Retourner le tableau � afficher
		return jeu;

	}

	public String[][] getJeu(String[][] jeu) {
		return jeu;
	}

	// M�thode qui r�cup�re le mot correspondant � la r�ponse finale
	public String ReponseJeu(String[][] jeu, int next) {
		// Case du tableau correspondant a la r�ponse du jeu
		String reponseJeu = jeu[next][4];
		return reponseJeu;
	}

	// M�thode qui r�cup�re le nombre de lettres composants la r�ponse
	public String LettreJeu(String[][] jeu, int next) {
		// Case du tableau correspondant au nombre de lettres de la r�ponse
		String lettreJeu = jeu[next][5];
		return lettreJeu;
	}

	// M�thode qui affiche les indices et le nombre de lettres de la r�ponse
	public void Aller(String[][] jeu, String lettreJeu, int next) {

		// affiche les mot du jeu
		System.out.println("\n1." + jeu[next][0] + " 2." + jeu[next][1] + " 3." + jeu[next][2] + " 4." + jeu[next][3]);
		System.out.print("\nLe mot est constitu� de " + lettreJeu + " lettres parmis les lettre suivantes : ");

	}
}
