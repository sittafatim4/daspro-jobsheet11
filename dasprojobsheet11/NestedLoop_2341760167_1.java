import java.util.Scanner;
public class NestedLoop_2341760167_1 {
    public static void main(String[] args) {
        Scanner sc12 = new Scanner(System.in);
        Double[][] temps = new Double[5][7];

        for (int i = 0; i < temps.length; i++) { 
            System.out.println("Kota ke-" + i); 
            for (int j = 0; j < temps[0].length; j++) { 
            System.out.print("Hari ke-" + (j + 1) + ": "); 
            temps[i][j] = sc12.nextDouble(); 
            } 
            System.out.println(); 
        } 
        for (int i = 0; i < temps.length; i++) { 
            System.out.print("Kota ke-" + (i + 1) + ": "); 
            for (Double temp : temps[i]) {
                System.out.print(temp + " "); 
            } 
            System.out.println(); 
        }    
    }
}