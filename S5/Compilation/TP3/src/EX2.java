import java.util.Scanner;

public class EX2 {

    static int i = 0;
    static String ch;
    static boolean err = false;
    static int errpos = -1;
    static String errExpected = "";

    public static void Z(String chaine) {
        i = 0;
        err = false;
        errpos = -1;
        errExpected = "";
        ch = chaine + "#";
        S();
        if (ch.charAt(i) == '#' && !err) {
            System.out.println("chaine accepte");
        } else {
            System.out.println("chaine non accepte");
            gesterr(chaine);
        }
    }

    public static void S() {
        char la = ch.charAt(i);
        if (la == 'a') {
            i++;
            A();
        } else if (la == 'd' || la == '(' || la == 'b' || la == 'c') {
            A();
            B();
        } else if (la == 'e' || la == '#') {
            C();
        } else if (!err) {
            err = true;
            errpos = i;
            errExpected = "'a' ou 'd' ou '(' ou 'b' ou 'c' ou 'e'";
        }
    }

    public static void A() {
        if (ch.charAt(i) == 'd') {
            i++;
        }
    }

    public static void B() {
        char la = ch.charAt(i);
        if (la == '(') {
            i++;
            B();
            if (ch.charAt(i) == ')') {
                i++;
            } else if (!err) {
                err = true;
                errpos = i;
                errExpected = "')'";
            }
        } else if (la == 'b') {
            i++;
            if (ch.charAt(i) == '+') {
                i++;
                if (ch.charAt(i) == '(' || ch.charAt(i) == 'b' || ch.charAt(i) == 'c') {
                    B();
                } else if (!err) {
                    err = true;
                    errpos = i;
                    errExpected = "'(' ou 'b' ou 'c'";
                }
            } else if (!err) {
                err = true;
                errpos = i;
                errExpected = "'+'";
            }
        } else if (la == 'c') {
            i++;
        } else if (!err) {
            err = true;
            errpos = i;
            errExpected = "'(' ou 'b' ou 'c'";
        }
    }

    public static void C() {
        if (ch.charAt(i) == 'e') {
            i++;
        }
    }

    public static void gesterr(String chaine) {
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
            System.out.println("Enter une chaine; ");
            Z(sc.nextLine());
        }
    }
}