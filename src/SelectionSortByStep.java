public class SelectionSortByStep {
    static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            System.out.println("Min value after " + (i+1) + "' scan: " + currentMin);
            if (currentMinIndex != i) {
                System.out.println("Swap " + list[currentMinIndex] + " to index " + i);
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }else System.out.println("Min value already at index: " + i);
        }
    }
    public static void main(String[] args) {
        selectionSort(list);
        for (double v : list) System.out.print(v + " ");
    }
}
