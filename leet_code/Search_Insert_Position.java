package leet_code;

public class Search_Insert_Position {

    public static void main(String[] args) {

        int nums[] = {1,2,3,4,5,6,7};
        int target = 7;
        System.out.println(searchInsert(nums,target));
        
    }
    public static int searchInsert(int[] nums, int target) {

        for(int i =0; i<nums.length; i++){
            if(nums[i] == target){
                return i;
            }
            if(target > nums[i] && (i == nums.length-1 || target < nums[i+1])){
                return i+1;
            }
        }
        return 0;
    }
}    

    

