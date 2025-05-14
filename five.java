public class five {

    public void checkEvenOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }

    public static void main(String[] args) {
        five obj = new five();

        obj.checkEvenOdd(7);
    }
}
