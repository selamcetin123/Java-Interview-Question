package QUESTIONS;

public class ReverseQuestion {

    public static void main(String[] args){

        System.out.println(reverseNormalyol("selam"));

        System.out.println(StBfReverReturnType("selam"));

        stbfreverVoid("selam");
        strnBuilder("selam");

        String slm = "hos geldiniz";


        //1--> yol foor loop ile
        for (int i = slm.length()-1; i>=0 ; i--) {

            System.out.println("charAT ile  " +slm.charAt(i));}
        System.out.println("\n");
        System.out.println("---------------------------------");

        //2--> yol foor loop ile
        for (int i = slm.length()-1; i>=0 ; i--) {

            System.out.println("subString ile  "+slm.substring(i,i+1)); // 0 (l), 1 (delete from alaala) =
        }
        System.out.println("---------------------------------");

        //3--> yol foor loop ile
        StringBuilder sbr=new StringBuilder(slm);
        System.out.println("builder ile " + sbr.reverse());
        System.out.println("---------------------------------");
    }

    //4--> yol foor loop ile
    public static String reverseNormalyol(String str){
        String rvrs="";

        for (int i = str.length()-1; i >=0 ; i--) {
            rvrs=rvrs+str.charAt(i);  //hiclik var +harf var m,a,l,e,s
        }
        return rvrs; }
    //5--> yol
    public static String StBfReverReturnType(String slm){
        return new StringBuffer(slm).reverse().toString(); }
    //6--> yol
    public static void stbfreverVoid(String cml){
        StringBuffer sb=new StringBuffer(cml);
        System.out.println(sb.reverse());}
    //7--> yol
    public static String StBReverReturnType(String sl){
        return new StringBuilder(sl).reverse().toString(); }
    //8--> yol
    public static void strnBuilder(String a){
        StringBuilder stringBuilder=new StringBuilder(a);
        System.out.println(stringBuilder.reverse());
    }


}
