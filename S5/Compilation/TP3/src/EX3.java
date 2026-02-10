import java.util.Scanner;

public class EX3 {

    static int i = 0;
    static String ch;
    static boolean err = false;
    static int errpos = -1;
    static String errExpected = "";

    static void Z(String chaine){
        // reset parser state
        i = 0;
        err = false;
        errpos = -1;
        errExpected = "";
        ch = chaine + "#";
        S();
        if(ch.charAt(i) == '#' && !err){
            System.out.println("Chaine accepte");
        } else {
            if (!err && ch.charAt(i) != '#') {
                err = true;
                errpos = i;
                errExpected = "fin";
            }
            System.out.println("Chaine non accepte");
            gesterr(chaine);
        }

    }
    static void S(){
        if (err) return;
        char la = ch.charAt(i);
        if (la == 'a' || la == 'b' || la == 'c' || la == 'd' || la == 'e' || la == '#') {
            X();
            Y();
            V();
        } else {
            err = true;
            errpos = i;
            errExpected = "'a' ou 'b' ou 'c' ou 'd' ou 'e' ou fin";
        }
    }

    static void X(){
        if (err) return;
        if(ch.charAt(i) == 'a'){
            i++;
            X();
        }
    }

    static void Y(){
        if (err) return;
        if(ch.charAt(i) == 'b'){
            i++;
            Y();
        } else if(ch.charAt(i) == 'c'){
            i++;
            Y();
        }
    }

    static void V(){
        if (err) return;
        if (ch.charAt(i) == 'd'){
            i++;
            V();
        } else if (ch.charAt(i) == 'e'){
            i++;
            X();
        } else {
            err = true;
        }
    }

    static void gesterr(String chaine) {
        int len = chaine.length();
        int caretPos = (errpos >= 0) ? errpos : i;
        if (caretPos > len) caretPos = len;
        String pointer = "";
        for (int k = 0; k < caretPos; k++) pointer += " ";
        pointer += "^";
        System.out.println(chaine);
        System.out.println(pointer);
        if (errpos >= 0) {
            if (errExpected == null || errExpected.isEmpty()) {
                System.out.println("Erreur de syntaxe a la position " + errpos);
            } else {
                System.out.println("Il doit avoir " + errExpected + " a la position " + errpos);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("==================================================");
            System.out.println("Enter une chaine; ");
            if (!sc.hasNextLine()) break;
            Z(sc.nextLine());
        }
    }
}
