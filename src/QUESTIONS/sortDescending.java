package QUESTIONS;

import java.util.Arrays;

public class sortDescending {

    public static void main(String[] args) {

        int [] slm={1,8,3,-6,5,15,0};


        Arrays.sort(slm);

        System.out.println("slm nin itemlari sort un kendi methodu "+ Arrays.toString(slm));

        sortintmethod(slm);}

    public static void sortintmethod(int [] arry){

        for (int i = 0; i <arry.length ; i++) {

        for (int j = 0; j <arry.length ; j++) {

            if (arry[i]>arry[j]){
                int temp=arry[i];
                arry[i]=arry[j];
                arry[j]=temp;
            }
        }
        }
        System.out.println("sort methodsuz for loop ile "+ Arrays.toString(arry));

    }
}
