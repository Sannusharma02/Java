public class A {
    public static void main(String[] args) {
        String s1 = "abc";
        Object o1 = "Java";
        System.out.println(s1.length());
        System.out.println(s1.charAt(2));
        System.out.println(s1.equals("abc"));
        System.out.println(s1.equalsIgnoreCase("abc"));
        System.out.println(o1.toString().equals(s1.toString()));
       // System.out.println(o1.equalsIgnoreCase("java"));
    }
}
