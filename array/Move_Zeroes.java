package array;

public class Move_Zeroes {

    public static void main(String[] k){

        int nums[] = {8,1,0,8,1,0,3};
        moveZeroes(nums);
    }
     
    public static void moveZeroes(int[] nums) {

        int j = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]!=0 && nums[j] == 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }

            if(nums[j] != 0){
                j++;
            }
            
        }
        
    }

     public  static void arrPrint(int[] arr) {

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }
}
    

