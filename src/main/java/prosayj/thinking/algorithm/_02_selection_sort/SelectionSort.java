package prosayj.thinking.algorithm._02_selection_sort;

/**
 * SelectionSort
 *
 * @author ProSayJ
 * @version V1.0.0
 */
public class SelectionSort {

    public static int[] selectSort(int[] srcList) {
        int index = 0;
        for (int i = 0; i < srcList.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < srcList.length; j++) {
                if (srcList[j] > srcList[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = srcList[i];
            srcList[i] = srcList[maxIndex];
            srcList[maxIndex] = temp;
        }
        return srcList;
    }

    public static void main(String[] args) {
        int[] srcList = {5, 3, 6, 2, 10};
        int[] sort = selectSort(srcList);
    }

}
