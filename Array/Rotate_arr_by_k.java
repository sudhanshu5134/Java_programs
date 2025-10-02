public class Rotate_arr_by_k {
    void reverse(int arr[],int start,int end){
       while(start<end){
        int temp = arr[start];
        arr[start]=arr[end];
        arr[end]= temp;
        start++;
        end--;
       }
    }
    void rotate (int arr[],int k){
       int n= arr.length;
        k = k%n;
        reverse(arr, 0, n-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
       for(int x : arr){
        System.out.print(x +" ");
       }
       System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {2,6,3,6,8,0,3,7,8};
        Rotate_arr_by_k sp=new Rotate_arr_by_k();
        // System.out.print (sp.rotate(arr, 3));
    sp.rotate(arr, 3);
    }
}
