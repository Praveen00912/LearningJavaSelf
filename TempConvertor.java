import java.util.Scanner;
class TempConvertor{
    public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Temp in Celsius: ");
    double cel=sc.nextDouble();
    double fah=(cel*9.0/5.0) + 32.0;
    //System.out.printf("The cel is %.2f and the fah is %2.f", cel,fah);
    System.out.printf("%.2f°C = %.2f°F%n", cel, fah);
    sc.close();
    }
}
