import java.util.Scanner;

public class EX3 {
    EX3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer un chaine de caractere :");
        String str = sc.nextLine();
//        System.out.println(str.replaceAll("\\W+", ""));
        System.out.println(replaceSymb(str));
        sc.close();
    }

    static String replaceSymb(String str){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (String.valueOf(str.charAt(i)).matches("[\\w]")) {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}
