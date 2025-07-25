import java.util.Scanner;
public class Assignment2b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of checks: ");
        int checks = input.nextInt();
        final double base_fee = 10.00;
        System.out.println("Base fee: $"+base_fee);
        double per_checkfee = 0.00;
    
        if (checks < 20){
            per_checkfee = 0.10;
        }
        else if ( checks >=20 && checks <=39){
            per_checkfee = 0.08;
        }
        else if ( checks >=40 && checks <=59) {
            per_checkfee = 0.06;
        }
        else{
            per_checkfee = 0.04;
        }
        System.out.println("Fee per check: $"+per_checkfee);
        double Total_service_fee = base_fee + ( checks * per_checkfee);
        String Totalservice = String.format("$%.2f",Total_service_fee);
        System.out.println("Total service charge: "+Totalservice);
        input.close();

    }   
}
