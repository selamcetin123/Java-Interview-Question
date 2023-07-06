package QUESTIONS;

public class Frequencyofchars {

    public static void main(String[] args) {

        String slm="ssseelaamm";
// 1 ci yol
        for (int i = 0; i <slm.length() ; i++) {
            int count=0;

            for (int j =i+1; j <slm.length() ; j++) {

                if (slm.charAt(i)==slm.charAt(j)){
                    count++;
                }
            }
            i=i+count;
            count++;
            System.out.println(slm.charAt(i)+" "+count+"");
        }
  // 2 ci yol
        String slm1="ssseelaamm";
        int count1=0;
        String [] spl=slm1.split("");

        for (int k =0; k<slm1.length() ; k++) {


            if (slm1.charAt(k)!=spl.toString().charAt(k)) {

                count1++;
                System.out.println("frequency = " + slm1.charAt(k)+ " " +count1);
            }
            }





    }





}
