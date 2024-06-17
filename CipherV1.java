package gr.aueb.cf.Finalized_Projects;

public class CipherV1 {
    public static void main(String[] args) {

        String s1 = "Helol";
        String s2 = "Hello";

        System.out.println(s1.compareTo(s2));


        for (int i = 0; i < s1.length(); i++) {
            System.out.println(s1.charAt(i));
        }
        for (char x : s1.toCharArray()) {
            System.out.println(x);
        }
        for (int i = 0; i < s1.length()-4; i++) {
            System.out.println(s1.substring(i, i + 5));
        }
            System.out.println(s1.contains("F"));
            System.out.println(s1.indexOf("llo"));


    }
}
