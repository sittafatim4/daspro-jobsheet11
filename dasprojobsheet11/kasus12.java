import java.util.Scanner;

public class kasus12 {
    public static void main(String[] args){
        Scanner sc12 = new Scanner(System.in);
        System.out.print("Masukan jumlah baris: ");
        int N = sc12.nextInt();
        for(int i=1; i<=N; i++){
            for(int j=i; j<=N; j++){
                System.out.print(" ");
            }
            for(int k=0; k<=(i*2)-2; k++){
                System.out.print("*");
            }            
            System.out.println(); 
        }
    }
}
