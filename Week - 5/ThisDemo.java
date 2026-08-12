class Student {
    int id;
    final String college = "ABC College";

    Student(int id) {
        this.id = id;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("College: " + college);
    }

    public static void main(String[] args) {
        Student s = new Student(101);
        s.display();
    }
}