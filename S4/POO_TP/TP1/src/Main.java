import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*System.out.println("***********EX01***********");
        System.out.println("Salut les ami(es)");

        System.out.println("\n***********EX02***********");
        int a = 23, b = 33;
        System.out.println(a + " + " + b + " = " + (a+b));
        double c = 32.44, d = 89.3;
        System.out.println(c + " + " + d + " = " + (c+d));
        boolean e = true, f = false;
        System.out.println(e + " ou " + f + " = " + (e || f));
        System.out.println(e + " et " + f + " = " + (e && f));*/

        System.out.println("\n***********EX03***********");
        int nbr = 0;
        int D = 0;
        while (true){
            System.out.print("Veuilliez introduire un nbr: ");
            nbr = sc.nextInt();
            if(nbr > 1000 && nbr % 2 == 0){
                D = nbr - 1000;
                break;
            }
        }

        System.out.println("La diffirence par rapport a 1000 est: " + D);

        int sommeDiv = D;
        int max = 0;
        int min = 0;

        // Trouver le plus petit diviseur de D (hormis 1)
        for(int i = 2; i <= D / 2; i++){
            if(D % i == 0){
                min = i;
                break; // On sort de la boucle dès qu'on trouve le premier diviseur
            }
        }
        for(int i = 1; i <= D / 2; i++){
            if(D % i == 0){
                max = i;
                sommeDiv += i;
            }
        }
        System.out.println("La somme des diviseurs de " + D + ": " + sommeDiv);
        System.out.println("Le plus grand diviseur de " + D + " est " + max);
        System.out.println("Le plus petit diviseur de " + D + " (hormis 1) est " + min);



        /*System.out.println("\n***********EX04***********");
        int choix = 0;
        System.out.print("Choisi la couleur de feu (1-Rouge / 2-Orange / 3-Vert): ");
        choix = sc.nextInt();
        switch (choix) {
            case 1 -> System.out.println("STOP!");
            case 2 -> System.out.println("Prepare toi a arrete");
            case 3 -> System.out.println("Vous pouvez demarrer");
            default -> System.out.println("Feu inconnu");
        }*/

        /*System.out.println("\n***********EX05***********");
        //Creation de instance Etudiant
        Etudiant E1 = new Etudiant("Lamine", 20, 10.1);
        Etudiant E2 = new Etudiant("LB", 25, 15.2);
        //Afficher les info des etudiant
        System.out.println("*****E1:*****");
        E1.afficherInfo();
        System.out.println("*****E2:*****");
        E2.afficherInfo();
        //Augmenter la moyenne de E1 et reafficher ses info
        E1.augmenterMoyenne(0.5);
        System.out.println("*****E1:*****");
        E1.afficherInfo();

        System.out.println("\n***********EX06***********");
        TestCompteBancaire test = new TestCompteBancaire();*/

        /*System.out.println("\n***********EX07***********");
        int[] tab = {7,2,9,2,6,10,2,8,10,13,9,2,9,20,15};
        int occ = 0;
        int rech = 9;

        for(int nbr : tab){
            if(nbr == rech){
                occ++;
            }
        }

        System.out.println("Le nomre des ocurences de " + rech + " est: " + occ);*/

        /*System.out.println("\n***********EX08***********");
        double[] nombres = new double[10];
        double sum = 0;
        double moyenne = 0;
        for(int i = 0; i < nombres.length; i++){
            System.out.print("Entrer le nombre " + (i+1) + ": ");
            nombres[i] = sc.nextDouble();
            sum += nombres[i];
        }
        double min = nombres[0];
        for(double nombre : nombres){
            if(nombre < min){
                min = nombre;
            }
        }
        moyenne = sum / nombres.length;
        System.out.println("La moyenne des element des nombre entree est: " + moyenne);
        System.out.println("le min est: " + min);*/

//        System.out.println("\n***********EX Supp***********");

    }
}
