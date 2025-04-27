import java.util.Scanner;

public class testEtudiant {
    public static void main(String args[]){
        String nom ;
        int age;
        double moyenne;
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrer le nom: ");
        nom = sc.nextLine();
        do{
            System.out.print("Entrer l'age: ");
            age = sc.nextInt();
        }while(age < 0);
        do{
            System.out.print("Entrer la moyenne: ");
            moyenne = sc.nextDouble();
        }while(moyenne < 0 || moyenne > 20);

        Etudiant e = new Etudiant(nom, age, moyenne);
        System.out.println(e.getNom());
        System.out.println(e.getAge());
        System.out.println(e.getNoteMoyenne());
    }
}
