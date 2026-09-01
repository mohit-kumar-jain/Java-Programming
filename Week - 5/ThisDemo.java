class ThisDemo {
    int id;
    final String college = "ABC College";

    ThisDemo(int id) {
        this.id = id;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("College: " + college);
    }

    public static void main(String[] args) {
        ThisDemo s = new ThisDemo(101);
        s.display();
    }
}