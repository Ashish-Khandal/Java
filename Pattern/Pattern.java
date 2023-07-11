package Pattern;

public class Pattern {
    public static void main(String[] args) {
        int num = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if(i%2==0&&j%2==1) {
                    System.out.print("0");
                }else{
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
}
