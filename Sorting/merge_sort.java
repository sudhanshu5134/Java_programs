
class merge_sort {
    void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
                k++;
            }
        }
    
        void mergeSort(int[] arr, int left, int right) {
            if (left < right) {
                int mid = left + (right - left) / 2;
                mergeSort(arr, left, mid);
                mergeSort(arr, mid + 1, right);
                merge(arr, left, mid, right);
            }
        }
    
        void printArray(int[] arr) {
            for (int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    
        public static void main(String[] args) {
            merge_sort sp = new merge_sort();
            int[] arr = {2,4,3,5,7,6,8,0,9,22,33,21,12,32,44,44,66};
            sp.mergeSort(arr, 0, arr.length - 1);
            sp.printArray(arr);
        }
    }
