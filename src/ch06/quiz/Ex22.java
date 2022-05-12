package ch6.quiz;

public class Ex22 {

    public static boolean isNumber(String str) {

        if (str==null || str==""){
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(ch < '0' || ch > '9'){
                return false;
            }

        }



        return true;
    }

    public static void main(String[] args) {

    }
}
