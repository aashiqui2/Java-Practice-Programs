import java.util.HashSet;

public class Demo40 {
     public static void main(String[] args) {
        int a[]={1,2,3,1};
        if(containsDuplicate(a))
        {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        } 
    }
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(set.contains(nums[i]))
            {
                return true;
            }
            else{
                set.add(nums[i]);
            }
        }
        return false;
    }
}
