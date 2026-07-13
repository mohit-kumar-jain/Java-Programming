public class DataTypesDemo {
    public static void main(String[] args) {
        // -------- Primitive Data Types --------
        byte b = 100;
        short s = 30000;
        int i = 100000;
        long l = 10000000000L;

        float f = 3.14f;
        double d = 3.14159265359;

        char c = 'A';     
        boolean flag = true;

        // -------- Non-Primitive Data Types --------
        String str = "Hello, Java";
        int[] arr = {1, 2, 3, 4, 5}; 
        Integer wrapperInt = Integer.valueOf(50);
        StringBuilder sb = new StringBuilder("Java");

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + flag);

        System.out.println("String: " + str);
        System.out.print("Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Wrapper Integer: " + wrapperInt);
        System.out.println("StringBuilder: " + sb);
    }
}