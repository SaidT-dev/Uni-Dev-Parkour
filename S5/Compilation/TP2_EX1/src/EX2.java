public class EX2 {
    public static boolean L1(String str) {
        String s = str + "#";
        int i = 0;

        if (s.charAt(i) == 'b') {
            i++;
            if (s.charAt(i) == 'b') {
                i++;
                while (s.charAt(i) == 'a' || s.charAt(i) == 'b') {
                    i++;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
        return s.charAt(i) == '#' &&
                str.charAt(i - 1) != 'a';
    }

    public static boolean L1_2(String str) {
        String s = str + "#";
        int[][] transition = {
//               a   b   autre
                {-1, 1, -1 }, //q0
                {-1, 2, -1 }, //q1
                { 3, 2, -1 }, //q2
                { 3, 2, -1 } //q3
        };

        char tc = s.charAt(0) ;
        int ec = 0;
        int qf = 2;
        int i = 0;

        int col = getCol(tc);
        while(tc != '#' && transition[ec][col] != -1) {
            ec = transition[ec][col];
            i++;
            tc = s.charAt(i);
            col = getCol(tc);
        }
        if(tc == '#' && ec == qf && transition[ec][col] != -1) {
            return true;
        } else  {
            return false;
        }
    }

    private static int getCol(char c) {
        if (c == 'a') return 0;
        if (c == 'b') return 1;
        return 2;

    }


    public static boolean L2(String str){
        int i = 0;
        int nbr = 0;
        String s = str + "#";
            if (str.charAt(i) == 'a') {
                i++;
                nbr++;
                while (s.charAt(i) == 'a' || s.charAt(i) == 'b') {
                    if (s.charAt(i) == 'a') {
                        nbr++;
                    }
                    i++;
                }
            } else {
                return false;
            }

        return s.charAt(i) == '#' &&
                str.charAt(i -1) == 'b' &&
                nbr % 2 != 0;
    }

    public static boolean L2_2(String str){
        String s = str + "#";
        int[][] transition = {
//               a   b   autre
                { 1, -1, -1 }, //q0
                { 2, 3, -1 }, //q1
                { 1, 4, -1 }, //q2
                { 1, 3, -1 }, //q3
                { 1, 4, -1 } //q4
        };

        char tc = s.charAt(0);
        int ec = 0;
        int qf = 3;
        int i = 0;
        int col = getCol(tc);

        while(ec != -1 && tc != '#') {
            ec = transition[ec][col];
            i++;
            tc = s.charAt(i);
            col = getCol(tc);
        }
        if(tc == '#' && ec == qf && transition[ec][col] != -1) {
            return true;
        } else  {
            return false;
        }
    }

    public static boolean Lid(String str){
        String s = str + "#";
        int[][] transition = {
//            L   C   _   autre
            { 1, -1, -1, -1 }, // q0
            { 1,  1,  2, -1 }, // q1
            { 3,  3, -1, -1 }, // q2
            { 3,  3,  2, -1 }  // q3
        };

        int ec = 0;
        int i = 0;
        int col = getColId(s.charAt(i));

        while(s.charAt(i) != '#' && transition[ec][col] != -1) {
            ec = transition[ec][col];
            i++;
            col = getColId(s.charAt(i));
        }
        return s.charAt(i) == '#' && (ec == 3 || ec == 1);
    }


    private static int getColId(char c) {
        if (c >= 'A' && c <= 'Z') return 0;
        if (c >= 'a' && c <= 'z') return 0;
        if (c >= '0' && c <= '9') return 1;
        if (c == '_') return 2;
        return 3;
    }
}