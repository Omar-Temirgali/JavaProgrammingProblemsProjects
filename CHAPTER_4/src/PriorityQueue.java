import java.util.Arrays;
import java.util.Scanner;

class PriorityQueue{
    private int[] arr;
    private int size;
    private int count;
    private PriorityQueue(int size) {
        this.size = size;
        arr = new int[size];
        count = 0;
    }
    // Function to insert an element into the priority queue
    private void insert(int value){
        if(count == size){
            System.out.println("Cannot insert the key");
            return;
        }
        arr[count++] = value;
        heapifyUpwards(count);
    }
    // Function to heapify an element upwards
    private void heapifyUpwards(int x){
        if(x<=0)
            return;
        int par = (x - 1) / 2;
        int temp;
        if(arr[x-1] < arr[par]){
            temp = arr[par];
            arr[par] = arr[x - 1];
            arr[x - 1] = temp;
            heapifyUpwards(par + 1);
        }
    }
    // Function to extract the minimum value from the priority queue
    private int extractMin(){
        int rvalue = arr[0];
        arr[0] = Integer.MAX_VALUE;
        heapifyDownwards(0);
        return rvalue;
    }
    // Function to heapify an element downwards
    private void heapifyDownwards(int index){
        if(index >=arr.length)
            return;
        int temp;
        int min = index;
        int left, right;
        left = 2 * index;
        right = left + 1;
        if(left<arr.length && arr[index] > arr[left]){
            min =left;
        }
        if(right <arr.length && arr[min] > arr[right]){
            min = right;
        }
        if(min != index) {
            temp = arr[min];
            arr[min] = arr[index];
            arr[index] = temp;
            heapifyDownwards(min);
        }
    }
    // Function to implement the heapsort using priority queue
    static void heapSort(int[] array){
        PriorityQueue object = new PriorityQueue(array.length);
        int i;
        for(i=0; i<array.length; i++){
            object.insert(array[i]);
        }
        for(i=0; i < array.length; i++){
            array[i] = object.extractMin();
        }
    }
}
class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = in.nextInt();
        System.out.print("Enter array elements: ");
        int[] array = new int[n];
        for(int i=0; i<array.length; i++){
            array[i] = in.nextInt();
        }
        PriorityQueue.heapSort(array);
        System.out.println("The sorted array is");
        System.out.println(Arrays.toString(array));
    }
}