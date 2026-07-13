class Student{
    String name = "Mohit";
    int rollnum  = 26;
    void displayDetails(){
        System.out.println("Name : "+name+".\nRoll Number : "+rollnum+".");
    }
}
public class classDemo {
    public static void main(String[] args){
        Student s = new Student();
        s.displayDetails();
    }
}
