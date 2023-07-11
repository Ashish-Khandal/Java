public class Array_next_greater {
    public static void main(String[] args) {
        //! Next greater element of an element a is the first greter element present on the right side of element a.
        int[] arr = {3,1,2,5,4};
        for(int i=0; i<arr.length; i++){
            boolean found = false;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]>arr[i]){
                    System.out.println(arr[j]);
                    found = true;
                    break;
                }
            }
            if(found==false){
                System.out.println("-1");
        }
        }
    }
}
