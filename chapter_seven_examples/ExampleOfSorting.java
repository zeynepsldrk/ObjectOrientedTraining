//{3, 3, 87, 56, 1, 87, 3, 2} -> {3, 87, 56, 1, 2}

public class ExampleOfSorting {

    public static void main(String[] args) {

        int[] array = {3, 3, 87, 56, 1, 87, 3, 2};
        int[] newArray = new int[array.length]; // newArray inside {0, 0, 0, 0, 0, 0, 0}
        int newArraySize = 0;

        for (int i = 0; i < array.length; i++) {
            int j;
            for (j = 0; j < newArraySize; j++) {
                if (array[i] == newArray[j])
                    break;
            }
            if (j == newArraySize) {
                newArray[newArraySize] = array[i];
                newArraySize++;
            }
        }

        for (int i = 0; i < newArraySize; i++) {
            System.out.print(newArray[i] + " ");
        }
    }

}