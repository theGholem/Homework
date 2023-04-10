package EXO1;

/**
 *     A) Faites l’analyse et la conception de la solution par un pseudo-code.
 * 
 * 
 * Déclaration de la méthode main
        
        Créer un objet Scanner pour obtenir l'entrée utilisateur
        Demander à l'utilisateur de saisir l'âge de la première personne
        Utiliser la méthode askForAge pour obtenir l'âge de la première personne
        Demander à l'utilisateur de saisir l'âge de la deuxième personne
        Utiliser la méthode askForAge pour obtenir l'âge de la deuxième personne
        Calculer la moyenne des deux âges saisis
        Afficher la moyenne des deux âges saisis
        Si l'âge de la première personne est supérieur à l'âge de la deuxième personne, afficher "La première personne est plus âgée"
        Sinon, si l'âge de la première personne est égal à l'âge de la deuxième personne, afficher "Les deux personnes ont le même âge"
        Sinon, afficher "La deuxième personne est plus âgée"
    
    Déclaration de la méthode askForAge
        Initialiser l'âge à zéro
        Tant que l'âge est inférieur ou égal à zéro
            Essayer de lire l'entrée utilisateur comme un entier
            Si l'entrée est inférieure ou égale à zéro, afficher "L'âge doit être strictement positif"
            Si une exception est levée, afficher "L'âge doit être un entier" et vider le tampon d'entrée
        Retourner l'âge saisi
 * 
 * 
 * 
 */



/**
 * 
 *    B) écrire le code associé que vous évaluez par rapport aux critères de qualité que vous
 *       connaissez et produire les résultats d’exécution selon deux ou trois jeux de données.
 */



import java.util.Scanner;

public class AgeDeuxPersonnes {

	public static void main(String[]args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("____Information relative à la premiere personne____\n");
		System.out.println("Veuillez saisir l'age svp");
		int old1=askForAge(input); // appeler la méthode askForAge pour obtenir l'âge de la premiere personne
		
		System.out.println("____Information relative à la deuxieme personne____\n");
		System.out.println("Veuillez saisir le second age svp");
		int old2=askForAge(input); // appeler la méthode askForAge pour obtenir l'âge de la deuxième personne
		
		double Moyenne=(old1+old2)/2;// calculer la moyenne des deux âges saisis
		System.out.println("\nLa moyenne des deux ages saisis vaut : "+Moyenne+"\n");
		

		if(old1>old2) {
			// afficher que la première personne est plus âgée
			System.out.println("\n' "+old1+" '"+" > ' "+old2+" ' , donc la premier personne est plus agée");
		}else if(old1==old2) {
			// afficher que les deux personnes ont le même âge
			System.out.println("\n' "+old1+" '"+" = ' "+old2+" ' , donc les deux personne ont le même age");
		}else {
			// afficher que la deuxième personne est plus âgée
			System.out.println("\n' "+old1+" '"+" < ' "+old2+" ' , donc la deuxieme personne est plus agée");
		}
		
	}
	
	/**
	 * 
	 * @param input
	 * @return age
	 * 
	 * @apiNote déclarer la méthode askForAge qui prend un objet Scanner comme argument et qui retourne un entier
	 */
	 private static int askForAge(Scanner input) {
	        int age = 0; // initialiser age à 0
	        while (age <= 0) {
	     
	            try {
	                age = input.nextInt(); // lire l'entier
	                if (age <= 0) {
	                	// afficher un message d'erreur
	                    System.out.println("L'âge doit être strictement positif"); 
	                }
	            } catch (Exception e) { // si une exception est levée (par exemple si l'utilisateur saisit autre chose qu'un entier)
	                System.out.println("L'âge doit être un entier"); // afficher un message d'erreur
	                input.next(); // vider la ligne pour éviter une boucle infinie
	            }
	        }
	        return age;
	    }
	
	 
	 /**
	  *  Jeux de test
	  */
	 
	 /*
	  * Cas 1 : Les deux personnes ont le même âge
	  *____Information relative à la premiere personne____

              Veuillez saisir l'age svp
              30
      ____Information relative à la deuxieme personne____

              Veuillez saisir le second age svp
              30

      La moyenne des deux ages saisi vaut : 30.0

      ' 30 ' = ' 30 ' , donc les deux personne ont le même age
      
      

	* Cas 2 : La première personne est plus jeune que la deuxième
	* ____Information relative à la premiere personne____

              Veuillez saisir l'age svp
              25
      ____Information relative à la deuxieme personne____

              Veuillez saisir le second age svp
              35

      La moyenne des deux ages saisi vaut : 30.0

      ' 25 ' < ' 35 ' , donc la deuxieme personne est plus agée

    
    * Cas 3 : La première personne est plus âgée que la deuxième
    * ____Information relative à la premiere personne____

            Veuillez saisir l'age svp
            40
     ____Information relative à la deuxieme personne____

     Veuillez saisir le second age svp
            30

    La moyenne des deux ages saisi vaut : 35.0

    ' 40 ' > ' 30 ' , donc la premier personne est plus agée

    
    
    */
	
}
