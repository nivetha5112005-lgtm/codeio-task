public class SecondLargest {
    public static void main(String[] args) {
        int []numbers={14,28,19,33,45,12};
        int firstLargest=0;
        int secondLargest=0;
        for(int i=0;i<numbers.length;i++) {
                if (firstLargest<numbers[i])
                    firstLargest = numbers[i];
        }
        for(int j=0;j< numbers.length;j++) {
            if(numbers[j]<firstLargest&&secondLargest<numbers[j])
                secondLargest=numbers[j];

        }
        System.out.println("second largest number:"+secondLargest);
    }
}
