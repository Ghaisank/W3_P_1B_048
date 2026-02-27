public abstract class Sortable {

    public abstract int compare(Sortable other);

    public static void shell_sort(Sortable[] arr) {
        int n = arr.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                Sortable temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap].compare(temp) > 0; j -= gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = temp;
            }
        }
    }
}
