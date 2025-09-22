public class Quic_sort {
    public int partistion(int[]arr,int low,int high){
       int pivot=arr[high];
       int i = low-1;
       for(int j=low;j<high;j++){
        if (arr[j]<=pivot){
            i++;
            int temp= arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
       }
       int temp=arr[i+1];
       arr[i+1]=arr[high];
       arr[high]=temp;

       return i+1;
    }
    void sort (int arr[], int low, int high){
        if(low<high){
            int pi = partistion(arr, low, high);
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }
    void print(int[] arr){
        for(int x:arr){
            System.out.print(x + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={2,4,3,6,5,8,7,9,8,0,2,33};
        Quic_sort sp = new Quic_sort();
        System.out.println("befor sorting");
        sp.print(arr);
        System.out.println("after sorting ");
        sp.sort(arr, 0, arr.length-1);
        sp.print(arr);
    }
}
