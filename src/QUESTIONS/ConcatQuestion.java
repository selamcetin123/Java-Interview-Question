package QUESTIONS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConcatQuestion {

    public static void main(String[] args) {


        int [] n1={1,2,3,4};
        int [] n2={6,7,8,9};

        System.out.println(concat2Array(n1, n2));
        System.out.println(Arrays.toString(concat2Array(n1, n2)));




//        List<Integer> Cont= (List<Integer>) Arrays.stream(n1);
//        List<Integer> Cont2= (List<Integer>) Arrays.stream(n2);
//
//       Integer [] eee=Stream.concat(Cont,Cont2).toArray(size -> new Integer[size]);

    }


    public static int[] concat2Array(int [] a,int [] b){

        int[] result=new int[a.length+b.length];
        int i=0;

        for (int each: a ) {
            result[i]=each;
            i++; }

        for (int each: b ) {
            result[i]=each;
            i++; }

        return result;


    }
}
