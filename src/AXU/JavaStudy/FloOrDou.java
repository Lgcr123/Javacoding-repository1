package AXU.JavaStudy;

public class FloOrDou {
    public static void main(String[] args) {
        double n1=3.1415926535;
        float n2=3.1415926535f;
        System.out.println(n1+"\n"+n2);
        double num1=2.7;
        double num2=8.1/3;//8.10000000011
        System.out.println(num1==num2);
        System.out.println(num1+"\n"+num2);
        if (Math.abs(num1-num2)<0.00001){//相减绝对值小于0.00001
            System.out.println("他们两是相等的");
        }else {
            System.out.println("他们两不是相等的");
        }
    }
}
