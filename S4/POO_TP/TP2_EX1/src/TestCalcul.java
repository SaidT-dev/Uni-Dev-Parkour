import java.util.Scanner;

public class TestCalcul {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrer le premier nombre: ");
        int num1 = scanner.nextInt();
        System.out.print("Entrer le deuxieme nombre: ");
        int num2 = scanner.nextInt();

        int product = Calcul.produit(num1, num2);
        System.out.println("Le produit est: " + product);

        Calcul calcul = new Calcul(num1, num2);
        int sum = calcul.somme();
        System.out.println("La somme est: " + sum);

        scanner.close();
    }
}