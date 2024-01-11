package AXU.JavaStudy;

public class LogicOperater {
    public static void main(String[] args) {
        // & && | || ! ^
        boolean b1=true;
        boolean b2=true;
        boolean b3=false;
        boolean b4=false;

        int i=20;
        if (i<10 & i++>20){
            System.out.println("对");
        }
        System.out.println(i);
    }
    //短路逻辑符在前条件不成立下，仍然执行后语句
    //长路则否
}
