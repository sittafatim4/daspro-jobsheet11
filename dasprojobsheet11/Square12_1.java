import java.util.Scanner;
public class Square12_1 {
    public static void main(String[] args) {
        Scanner sc12 = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int N = sc12.nextInt();
        for(int iOuter=1; iOuter<=N; iOuter++){
            for(int i=0; i<=N; i++){
            System.out.print("*");
        }
        System.out.println();
    }
    }
}