public class ArrayElementFrequency {
    public static void main(String[] args) {
            int []arr = {2, 4, 2, 6, 2, 9, 6};
            int n = arr.length;

            for (int i = 0; i < n; i++) {
                int j;
                for (j = 0; j < i; j++) {
                    if (arr[i] == arr[j]) {
                        break;
                    }
                }
                if (i == j) {
                    int count = 1;
                    for (int k = i + 1; k < n; k++) {
                        if (arr[i] == arr[k]) {
                            count++;
                        }
                    }
                    System.out.println(arr[i] + " appears " + count + " times");
                }
            }
        }
    }