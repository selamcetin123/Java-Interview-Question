package QUESTIONS;

public class OddEvenQuestion {

    public static void main(String[] args) {

        odd(5);
    }

    public static void odd(int a){

        if (a%2==0){
            System.out.println("this is even number " +a);
        }else {
            System.out.println("this is odd number "+a);
        }

    }
}
