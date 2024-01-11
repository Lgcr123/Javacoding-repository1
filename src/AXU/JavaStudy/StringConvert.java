package AXU.JavaStudy;

public class StringConvert {
    public static void main(String[] args) {
        //int double float char
        int i=10;
        double d=10.0;
        float f=10.0f;
        String s1=i+"";
        String s2=d+"";
        String s3=f+"";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        String  S1="123";
        int i1= Integer.parseInt(S1);
        double v= Double.parseDouble(S1);
        float v1=Float.parseFloat(S1);
        System.out.println(i1);
        System.out.println(v);
        System.out.println(v1);
        System.out.println(S1.charAt(0));
        System.out.println(S1.charAt(1));
        System.out.println(S1.charAt(2));
        //0  1  2Ë÷ÒýÏÂ±ê
    }
}
