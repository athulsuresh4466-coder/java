class string {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "hello";
        String s3 = "Java";
        String s4 = "";
          System.out.println("length "+s1.length());
        System.out.println("index value "+s1.charAt(1));
        System.out.println("substring:"+s1.substring(1, 4));
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.concat(" " + s3));
        System.out.println(s1.replace('l', 'x'));
        System.out.println(s1.contains("ell"));
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s4.isEmpty());
    }
}