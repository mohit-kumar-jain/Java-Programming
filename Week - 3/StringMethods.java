class StringMethods {
    public static void main(String args[]) {

        String s1 = "Java";
        String s2 = "Programming";

        System.out.println("charAt: " + s1.charAt(1));
        System.out.println("compareTo: " + s1.compareTo(s2));
        System.out.println("equals: " + s1.equals("Java"));
        System.out.println("indexOf: " + s2.indexOf("g"));
        System.out.println("join: " + String.join("-", s1, s2));
        System.out.println("replace: " + s2.replace("m", "M"));
        System.out.println("substring: " + s2.substring(3));
        System.out.println("toUpperCase: " + s1.toUpperCase());
        System.out.println("toLowerCase: " + s2.toLowerCase());
    }
}
