public class BugSolution {
    public static void main(String[] args) {
        int[] arr = new int[5];
        if (0 <= 4 && 4 < arr.length) {
            System.out.println(arr[4]); //This is safe
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}