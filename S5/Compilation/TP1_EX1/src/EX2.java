public class EX2 {
    EX2(){
        String[] str = {"java", "c", "pascal", "c++", "python"};
        triLexicographique(str);
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }

    static void triLexicographique(String[] str){
        for (int i = 0; i < str.length - 1; i++) {
            for (int j = i+1; j < str.length; j++) {
                if(str[i].compareToIgnoreCase(str[j]) > 0){
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
    }
}
