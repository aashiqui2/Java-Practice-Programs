import java.util.Arrays;
public class Demo32 {
    public static void main(String[] args) {
        int a[] = { 1, 4, 45, 6, 10, 8 };
        int target = 13;
        System.out.println(hasTripletSum(a, target));
    }

    /* public static boolean hasTripletSum(int a[], int target) {
        int n=a.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++)
                {
                    if(a[i]+a[j]+a[k]==target)
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    } */
    //? Time Complexity : O(n^3)

    public static boolean hasTripletSum(int a[], int target) {
        int n=a.length;
        Arrays.sort(a);
        for(int i=0;i<n;i++)
        {
            int j=i+1,k=n-1;
            while(j<k)
            {
                
                if(a[i]+a[j]+a[k]==target)
                {
                    return true;
                }
                else if(a[i]+a[j]+a[k]<target){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        
        return false;
    }
}
