public class InsertAtIndex {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int index = 2;
        int element = 90, sizeOfArray = 6;
        insertElement(arr, sizeOfArray, index, element);

    }

    public static void insertElement(int arr[], int sizeOfArray, int index, int element) {

        int cparray[] = new int[sizeOfArray];

        for (int i = 0; i < index; i++)
            cparray[i] = arr[i];
        cparray[index] = element;
        for (int i = index + 1; i < sizeOfArray; i++)
            cparray[i] = arr[i - 1];
        for (int i = 0; i < sizeOfArray; i++) {
            System.out.print(cparray[i] + " ");
        }
    }
}

// another approach is to make room / space for element, shift element from one
// place at a time and
// then after making space insert directly to that postion .
