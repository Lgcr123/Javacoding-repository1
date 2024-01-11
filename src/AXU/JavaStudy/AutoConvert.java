package AXU.JavaStudy;

public class AutoConvert {
    public static void main(String[] args) {
        // char int long float double
        //byte short int long float double
        //低精度向高精度转换
        double d=100;
        int i='a';
        System.out.println(d);
        System.out.println(i);
        int j=100;
        float f=10.1f;
        System.out.println(d+j+f);//精度取决于d和j之间的最高精度
        //高精度不能向低精度转换
    }
}
