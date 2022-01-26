public class Palindrom{
    public static void main(String[] args) {
        String s="sudip";
        String k="";
        for(int i=0;i<s.length();i++){
            k=s.charAt(i)+k;
        }
        System.out.println(k);
        int[] a={1,2,3,4};
        int l=0,u=a.length-1;
        while(l<u){
            int t=a[l];
            a[l]=a[u];
            a[u]=t;
            l++;
            u--;
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}