public class SearchAndReplace {
    static void replaceElements(int arr[], int index, int ele, int replace) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == ele) {
            arr[index] = replace;
        }
        replaceElements(arr, index + 1, ele, replace);
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 10, 10, 30, 10 };
        int replace = 100;
        int ele = 10;
        replaceElements(arr, 0, ele, replace);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}
