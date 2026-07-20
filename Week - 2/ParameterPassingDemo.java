public class ParameterPassingDemo {
    static class NumberWrapper {
        int value = 10;
    }
    public static void modifyPrimitive(int num) {
        num = 50; 
    }
    public static void modifyObject(NumberWrapper obj) {
        obj.value = 50; 
    }

    public static void main(String[] args) {
        int x = 10;
        System.out.println("Before primitive modification, x = " + x);
        modifyPrimitive(x);
        System.out.println("After primitive modification, x = " + x);
        NumberWrapper myObj = new NumberWrapper();
        System.out.println("Before object modification, myObj.value = " + myObj.value);
        modifyObject(myObj);
        System.out.println("After object modification, myObj.value = " + myObj.value);
    }
}