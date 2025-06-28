//! Write a program to check whether the given array is subset of the original array?
import java.util.HashMap;
import java.util.Map;

public class Demo28 {
    public static void main(String[] args) {
        
        int a[]={11,7,1,13,21,3,7,3};
        int b[]={11,3,7,1,7};
        if(isSubset(a,b))
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("Not");
        }
    }
    /* public static boolean isSubset(int[] a,int [] b)
    {
        for(int i=0;i<b.length;i++)
        {
            boolean found=false;
            for(int j=0;j<a.length;j++)
            {
                if(a[j]==b[i])
                {
                    found=true;
                    break;
                }
            }
            if(!found)
            {
                return false;
            }
        }
        return true;
    } */

    //Approach 2:
    public static boolean isSubset(int a[],int b[])
    {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int num:a)
        {
            hm.put(num,hm.getOrDefault(num, 0)+1);
        }
        // System.out.println(hm);
        for(int num:b)
        {
            if(hm.containsKey(num) && hm.get(num)>0)
            {
                hm.put(num,hm.get(num)-1);
            }
            else{
                return false;
            }
        }
        return true;
    }
}
