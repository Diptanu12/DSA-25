public class EvenDigits {
    public static void main(String[] args) {
int nums[]={12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }

        return count;
    }

    //function to che ck that a number has even digit or not
    static boolean even(int num) {
        int noOfDigit = digits(num);
        if (noOfDigit % 2 == 0) {
            return true;
        }
        return false;
    }

    //count no digit
    static int digits(int num) {
        if(num<0){
            num=num*-1;
        }
        if(num==0){
            return 1;
        }

        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }
}
