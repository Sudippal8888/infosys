public class BinarySearch{
    public static int BS(int[] a,int l,int u,int val){
        if(l<=u){
            int m=l+(u-l)/2;
            if(a[m]==val)
                return m;
            else if(a[m]<val){
                return BS(a,m+1,u,val);
            }
            else{
                return BS(a, l, m-1, val);
            }
        }
        else{
            return -1;
        }
    }
    public static void main(String args[]){
        int[] a={5,6,7,8,9,10,15,22,31};
        //int k=BS(a,0,a.length-1,11);
        int l=0,u=a.length-1,val=22;
        int m=-1;
        while(l<=u){
            m=l+(u-l)/2;
            if(a[m]==val){
                //System.out.print(m);
                break;
            }
            else if(a[m]<val){
                l=m+1;
            }
            else if(a[m]>val){
                u=m-1;
            }
        }
        System.out.print(m);
    }
}