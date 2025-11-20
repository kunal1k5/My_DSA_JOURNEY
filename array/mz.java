package array;

public class mz {
    
    public static void main(String[] args) {

        int nums[] = {22,3,5,0,5,60,0};

        moveZ(nums);
        printArr(nums);
    }

    public static void moveZ(int nums[]){

        int j =0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0 && nums[j] == 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }

            if(nums[j] != 0){
                j++;
            }
        }
    }

    public static void printArr(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println(" ");
    }
    
}
