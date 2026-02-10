import java.util.Scanner;

public class EX1 {
    EX1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer une chaine de caractere :");
        String str = sc.nextLine();
        System.out.println("Entrer un caractere :");
        char c = sc.next().charAt(0);
        System.out.println("Nombre d'occurences de " + c + " dans la chaine de caractere : " + occ(str, c));
        strCol(str);
        sc.close();
    }

    static int occ(String str, char c) {
        int occ = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                occ++;
            }
        }
        return occ;
    }

    static void strCol(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}
