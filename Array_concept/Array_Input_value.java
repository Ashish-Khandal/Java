import java.util.Scanner;

public class Array_Input_value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size:- ");
        int size = sc.nextInt();
        int arr [] = new int[size];
        System.out.println("Enter your array number :- ");
        for(int i=0; i<size; i++){
          arr[i] = sc.nextInt();  
        }
        System.out.println("Your array data are:- ");
        for(int i=0; i<size; i++){
            System.out.println(arr[i]);
        }
    }
}