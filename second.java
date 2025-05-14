public class second {
    String name;

    public second(String userName) {
        name = userName;
    }
    public void greetUser() {
        System.out.println("Welcome, " + name + "!");
    }

    public static void main(String[] args) {
        second obj = new second("Abhishek");

        obj.greetUser();
    }
}
