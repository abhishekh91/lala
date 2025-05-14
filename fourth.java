public class fourth {

    public int addNumbers(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        fourth obj = new fourth();

        int result = obj.addNumbers(10, 20);

        System.out.println("The sum is: " + result);
    }
}
