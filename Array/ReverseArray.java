public class ReverseArray {
    void reverse(int arr[],int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--; 
        }
    }
    void print(int arr[]){
        for(int x : arr){
            System.out.print(x + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr={2,3,4,5,6,7,8,9};
        ReverseArray sp=new ReverseArray();
        System.out.println("before reverse ");
        sp.print(arr);
        
        sp.reverse(arr, 0, arr.length-1);
        System.out.println("after reverse");
        sp.print(arr);
    }
}

