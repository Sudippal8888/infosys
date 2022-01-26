public class RotateArray{
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7};
        int index=4,k=0;
        int[] b=new int[a.length];
        for(int i=index;i<a.length;i++){
            b[k++]=a[i];
        }
        for(int i=0;i<index;i++){
            b[k++]=a[i];
        }
        for(int i=0;i<a.length;i++){
            System.out.println(b[i]);
        }
    }
}