import java.awt.geom.CubicCurve2D;
import java.util.Scanner;
public class Quiz2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter mass of the object: ");
        double mass_of_object = input.nextInt();
        double weight = mass_of_object * 9.8;
        if (weight > 1000){
            System.out.println("too heavy");
     
       }
       else if (weight < 10){
        System.out.println("too light");
       }
       else{
        System.out.println("nothing");

       }
       input.close();
       
       }
    }

    

