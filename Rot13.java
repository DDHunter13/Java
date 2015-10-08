package CD;


public class Rot13 {
    
    private static String ch = "abcdefghigklmnopqrstuvwxyz";
    
    public static String encodeRot13(String str){
        String result = "";
        for (int i = 0; i < str.length(); ++i){
            int num = ch.indexOf(str.charAt(i));
            num += 13;
            if (num > 25){
                num -= 25;
            }
            result += ch.charAt(num);
        }
        return result;
    }
    
    public static String decodeRot13(String str){
        String result = "";
        for (int i = 0; i < str.length(); ++i){
            int num = ch.indexOf(str.charAt(i));
            num -= 13;
            if (num < 0){
                num += 25;
            }
            result += ch.charAt(num);
        }
        return result;
    }
    
}
