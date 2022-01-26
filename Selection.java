public class Selection{
    public static void main(String[] args) {
        int[] a={5,8,7,1,3,4};
        for(int i=0;i<a.length-1;i++){
            int min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[min]>a[j]){
                    min=j;
                }
            }
            int t=a[i];
            a[i]=a[min];
            a[min]=t;
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}