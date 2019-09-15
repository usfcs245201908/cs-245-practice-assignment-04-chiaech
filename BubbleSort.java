public class BubbleSort implements SortingAlgorithm {

    @Override
    public void sort(int[] a) {
        boolean swapped = true;
        while(swapped){
            swapped = false;
            for (int i = 0; i< a.length-1; i++){
                if(a[i]>a[i+1]){
                    swap(a, i, i+1);
                    swapped = true;
                }
            }
        }
    }

    void swap(int[] a, int x, int y){
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }
}
