public class first {
    int year;
    String name;

    public first(int y,String n){
        year=y;
        name=n;
    }
    public static void main(String[] args){
        first mycar= new first(2000,"tesla");
        System.out.println(mycar.year+" "+mycar.name);
    }
}