package class3;

public class T2TemperatureCheck {
    public static void main(String[] args) {
        double temp=30.5;

        if(temp<32){ //29<32=true
            System.out.println("Water will freeze with temperature " +temp);

        }else {
            System.out.println("Water will NOT freeze with temperature " +temp);

        }
    }
}
