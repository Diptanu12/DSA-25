import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int arr[][]={
                {23,4,1},
                {78,12,-3,18,9},
                {78,56,454,65},
                {18,12,7845}
        };
        int target=18;
        int ans[]=search(arr,target);
        System.out.println(Arrays.toString(ans));
        System.out.println(maxElement(arr));
        System.out.println(minElement(arr));
    }

     static int[] search(int[][] arr, int target) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    static int maxElement(int[][] arr) {
        int max=arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];

                }
            }
        }
        return max;
    }

    static int minElement(int[][] arr) {
        int min=arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]<min){
                    min=arr[i][j];

                }
            }
        }
        return min;
    }


}
