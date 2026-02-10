import java.util.Scanner;

public class TestAnalyseLexicalAuto {


    static int col(char c){
        if(c == 'a'){
            return 0;
        }
         else if(c == 'b'){
            return 1;
        }
        else if(c == '-'){
            return 2;
        }
        else if(c == '/'){
            return 3;
        }
        else if(c == '+'){
            return 4;
        }
        else if(c == '*'){
            return 5;
        }
        return 6;
    }
    static void lan(String ch){
        int[][] mat = {
//               a  b   -   /   +   *  autre
                {0, 0,  1,  1, -1, -1, -1}, // 0
                {1, 1, -1, -1,  2,  2, -1}, // 1
                {2, 2, -1, -1, -1, -1, -1} // 2
        };

        ch = ch + '#';
        int Ec = 0;
        char tc = ch.charAt(0);
        int i = 0;
        int j = 0;
        int tcol = col(tc);

        while(tc != '#' && Ec != -1){
            if(tc == 'a'){
                j++;
            }

            Ec = mat[Ec][tcol];
            i++;
            tc = ch.charAt(i);
            tcol = col(tc);
        }

        if(i == ch.length() -1  &&   j >= 10){
            System.out.println("Chaine accepte");
        } else {
            System.out.println("Chaine non accepte");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mot;

        while(true){
            System.out.println("Entrez votre mot :");
            mot = sc.nextLine();
            lan(mot);
        }
    }
}
