public class EX1 {
    public static boolean L1(String str){
        int i = 0;
        String s = str + "#";
        if (s.charAt(i) == 'c'){
            i++;
            if(s.charAt(i) == 'a'){
                i++;
                if(s.charAt(i) == 'b'){
                    i++;
                } else {
                    return false;
                }
            } else if(s.charAt(i) == 'c'){
                i++;
                if(s.charAt(i) == 'a'){
                    i++;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
        return i == str.length() && s.charAt(i) == '#';
    }


    public static boolean L2(String str){
        int i = 0;
        String s = str + "#";
        if (s.charAt(i) == 'c'){
            i++;
            while (s.charAt(i) == 'c') {
                i++;
            }
            if (s.charAt(i) == 'a') {
                while (s.charAt(i) == 'a') {
                    i++;
                }
                while(s.charAt(i) == 'b'){
                    i++;
                }
                if(s.charAt(i) == 'c'){
                    i++;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }

        return i == str.length() && s.charAt(i) == '#';
    }
}
