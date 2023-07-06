package QUESTIONS;

import java.util.*;

public class DublicateRemove {

    public static void main(String[] args) {

        String slm = "lalalamememe";
        //1--> yol foor loop ile
        String [] a=slm.split("");
        System.out.println(Arrays.toString(a));

        List<String> list=new ArrayList<>();

        for (int i = 0; i <a.length ; i++) {

            if (!list.contains(a[i])){
                list.add(a[i]);
            }
        }

        System.out.println("1'ci yol "+list);

        // 2--> yol ( set lerde duplicate olmaz ordan for loop ile yapabilirsin
        Set<Character> set = new LinkedHashSet<>();

        for (int i = 0; i < slm.length(); i++) {
            set.add(slm.charAt(i));
        }
        System.out.println("ikinci yol = "+set);


        // 3--> yol stringBuffer ile obje yapip sonra forech ile duplicate yapabilirsin.
        StringBuffer sb = new StringBuffer();

        for (Character c : set) {
            sb.append(c);
        }
        System.out.println(sb);
    }


   // 3--> yol
//
//        char [] x=slm.charAt();
//
//        for (int i = 0; i < x.length; i++) {
//
//            for (int j = 0; j <x.length ; j++) {
//
//                if (x[i]==x[j]) {
//
//                }
//            }
//
//        }
//        System.out.println(x);
//    }
//    public static String dup(String D){
//        char [] chars=
//
//        String a="";
//
//        for (int i = 0; i <D.length() ; i++) {
//
//            System.out.println(chars);
//
//        }
//        return a;
//    }
}
