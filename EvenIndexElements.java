public class EvenIndexElements {
    public static void main(String[] args) {
        int []arr = {10, 20, 30, 40, 50, 60};

        System.out.println("Elements at even index positions:");
        for (int i = 0; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }
    }
}