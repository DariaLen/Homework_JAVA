package homework.java.hw3;

public class TestHome {
    public static void main(String[] args) {
        String newStr = new String("I study Basic Java!");
        str(newStr);

    }
    static void str(String newStr) {
        String myStr = newStr;
        System.out.println(myStr);
        System.out.println(newStr.charAt(newStr.length()-2));
        System.out.println(newStr.contains("Java"));

        System.out.println(newStr.replace("Java", ""));
        System.out.println(newStr.replace('a', 'o'));
        System.out.println(newStr.toUpperCase());
        System.out.println(newStr.toLowerCase());
    }

}
