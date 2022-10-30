import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double ucret=0;
        double perKm=2.2;
        System.out.println("Kilometreyi giriniz.");
        double km=scanner.nextDouble();
        ucret=10+km*perKm;
        if(ucret<20){
            ucret=20;
        }
        System.out.println("Ücret:"+ucret);
    }
}


