package searchArrayTask;

public class ArraySearch {
    public static void main(String[] args) {
        int[] arr = {158,207,392,62,315,434,487,268,405,241};
        int element = 158;
        boolean isPresent = false;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == element) {
                System.out.println("The index of " + element + " is " + i);
                isPresent = true;
            }
        }
        if (!isPresent) {
            System.out.println("There is no " + element + " in array");
        }


}
}
