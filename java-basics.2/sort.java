public class sort{
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int key = 50; // Number to search

        int low = 0;
        int high = arr.length - 1;
        int found = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                found = mid;
                break;
            } else if (key < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (found != -1)
            System.out.println("Element found at index " + found);
        else
            System.out.println("Element not found");
    }
}