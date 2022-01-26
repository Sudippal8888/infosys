public class MergeSort{
    public static void merge(int[] a,int l,int m,int u){
        int n1=m-l+1,n2=u-m;
        int[] L=new int[n1];
        int[] R=new int[n2];
        for(int i=0;i<n1;i++){
            L[i]=a[i+l];
        }
        for(int i=0;i<n2;i++){
            R[i]=a[i+m+1];
        }
        int i=0,j=0,k=l;
        while(i<n1&&j<n2){
            if(L[i]<R[j]){
                a[k++]=L[i++];
            }
            else{
                a[k++]=R[j++];
            }
        }
        while(i<n1){
            a[k++]=L[i++];
        }
        while(j<n2){
            a[k++]=R[j++];
        }
    }
    public static void MS(int[] a,int l,int u){
        if(l<u){
            int m=l+(u-l)/2;
            MS(a, l, m);
            MS(a, m+1, u);
            merge(a,l,m,u);
        }
    }
    public static void main(String[] args) {
        int[] a={5,4,6,9,7,1};
        MS(a,0,a.length-1);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}