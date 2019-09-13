public class SelectionSort implements SortingAlgorithm {

    @Override
    public void sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            swap(a, i, find_min(a, i));

        }
    }

    void swap(int[] a, int x, int y){
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

    int find_min(int[] a, int start){
        int min = start;

        for (int i = start + 1; i < a.length; i++) {
            if(a[i] < a[min])
                min = i;
        }
        return min;
    }
}
