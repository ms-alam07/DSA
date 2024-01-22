public class SelectionSort {
    public static void main(String[] args) {
        
        int a[]={60,16,36,57,80};

        for(int x:a){
            System.out.print(x+" ");
            System.out.println();
        }

        int min;
        int temp=0;
        for(int i=0;i<a.length;i++){
            min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
        for(int x:a){
            System.out.print(x+" ");
        
        }
    }
}