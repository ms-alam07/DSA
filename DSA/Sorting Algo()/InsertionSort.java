public class InsertionSort {
    public static void main(String[] args) {

        int a[]={60,16,36,57,80};
        
        for(int x:a){
            System.out.print(x+" ");
            System.out.println();
        }

        int temp,j;
        for(int i=1;i<a.length;i++){
            temp=a[i];
            j=i;

            while(j>0 && a[j-1]>temp){
                a[j]=a[j-1];
                j=j-1;
            }
            a[j]=temp;
        }
        for(int x:a){
            System.out.print(x+" ");
        }
    }
}
