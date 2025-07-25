import java.util.Scanner;
public class Assignment2a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter score 1: ");
        double score_I = input.nextInt();
        System.out.print("Enter score 2: ");
        double score_II = input.nextInt();
        System.out.print("Enter score 3: ");
        double score_III = input.nextInt();
        double total = (score_I + score_II + score_III) / 3;
        System.out.println("Total of three test scores: "+total);
        if (total >=90 && total <=100){
            System.out.println("Grade: A");
        }
        else if(total >= 80 && total <=89){
            System.out.println("Grade: B");
        }
        else if(total >= 70 && total <=79){
            System.out.println("Grade: C");
        }
        else if (total >= 60 && total <=69){
            System.out.println("Grade: D");
        }
        else {
            System.out.println("Grade: F");
        }
        input.close();
    }   
}
