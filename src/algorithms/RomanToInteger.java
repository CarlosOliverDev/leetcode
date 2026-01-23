package algorithms;

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        int conversao = romanToInt(s);
        System.out.println(conversao);
    }

    public static int romanToInt(String s) {
        int convertido = tabela(s.charAt(s.length()-1));
        for(int i = s.length()-2; i >= 0; i--) {
            int novo = tabela(s.charAt(i));
            if(novo >= convertido) {
                convertido += novo;
            } else if(s.charAt(i) == s.charAt(i+1)){
                convertido += novo;
            } else {
                convertido -= novo;
            }
        }
        return convertido;
    }

    public static int tabela(char s) {
        switch(s) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return -1;
        }
    }
}
