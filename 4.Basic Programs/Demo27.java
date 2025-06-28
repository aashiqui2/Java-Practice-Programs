//! Write a program to find the dupliacte element count in a array?
public class Demo27 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,2,2,3,1};
        boolean[] b=new boolean[a.length];
        int DupliacteCount=0;
        for(int i=0;i<a.length;i++){
            if(!b[i])
            {
                int count=1;
                for(int j=i+1;j<a.length;j++)
                {
                    if(a[i]==a[j])
                    {
                        count++;
                        b[j]=true;
                    }
                }
                if(count>1)
                {
                    DupliacteCount++;
                }
            }
        }
        System.out.println(DupliacteCount);
    }
}
