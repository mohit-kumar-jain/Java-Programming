public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("Original String: " + sb);
        sb.append(" Java");
        System.out.println("After append():  " + sb);
        sb.insert(6, "Beautiful ");
        System.out.println("After insert():  " + sb);
        sb.replace(6, 15, "Awesome");
        System.out.println("After replace(): " + sb);
        sb.delete(5, 13); 
        System.out.println("After delete():  " + sb);
        sb.reverse();
        System.out.println("After reverse(): " + sb);
    }
}
