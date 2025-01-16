public class StringTransformer {
    public String transform(String message){
        if (message.length() < 2) return replaceLetters(message);
        message = new StringBuilder(message).reverse().toString();
        message = replaceLetters(message);
        return message;
    }

    public String replaceLetters(String str){
        str = str.replaceAll("[aA]", "1");
        str = str.replaceAll("[eE]", "5");
        str = str.replaceAll("[iI]", "9");
        str = str.replaceAll("[oO]", "15");
        str = str.replaceAll("[uU]", "21");
        str = str.replaceAll("[yY]", "25");
        return str;
    }

    public static void main(String[] args) {
        System.out.println(new StringTransformer().transform("True"));
    }
}
