package arrayInJavaQs;
import java.util.Scanner;
public class InputFromUser {
    public static void main(String[] args) {
        System.out.print("Number of Element ..");

        Scanner sc = new Scanner(System.in);
        int n;
        n=sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        System.out.println();
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+"\t");
        }
    }
}
