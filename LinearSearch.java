public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {1, 5, 6, 7, 8, 9,-1};
        int target=-1;
        int ans = Linear(arr, target);
        System.out.println("the target element " +target +" in the index : " +ans);


    }

    static int Linear(int arr[], int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element=arr[i];
            if (element == target) {
                return i;
            }
        }
        return -1; //if there is am search for lelement then istead of -1 i can write Integer.Max_value
    }
}
