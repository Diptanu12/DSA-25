public class FindMinimumNumber {
    public static void main(String[] args) {
        int arr[] = {18,22,-7,2,3,5,6,9};
        System.out.println(min(arr));
    }
    static int min(int arr[]){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
