public class QuickSort{
    public static int partition(int[] a,int l,int u){
        int pivot=a[u];
        int i=-1;
        for(int j=0;j<=u;j++){
            if(pivot>a[j]){
                i++;
                int t=a[i];
                a[i]=a[j];
                a[j]=t;
            }
        }
        int t=a[u];
        a[u]=a[i+1];
        a[i+1]=t;
        return i+1;
    }
    public static void QS(int[] a,int l,int u){
        if(l<u){
            int p=partition(a,l,u);
            QS(a, l, p-1);
            QS(a, p+1, u);
        }
    }
    public static void main(String[] args) {
        int[] a={5,4,6,9,7,1};
        QS(a,0,a.length-1);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}