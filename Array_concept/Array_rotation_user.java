import java.util.Scanner;

public class Array_rotation_user {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp;
        System.out.print("Enter your size:-");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter your array elements:-");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter a value you are N time rotate:-");
        int n = sc.nextInt();
        int x = 1;
        while(x<=n){
            temp = arr[0];
        for(int i=1; i<size; i++){
            arr[i-1]=arr[i];
        }
        x++;
        arr[size-1]=temp;
    }
        System.out.println("Left rotation "+n+" time Output-->");
        for(int i=0; i<size; i++){
        System.out.println(arr[i]);
        }
    }
}
