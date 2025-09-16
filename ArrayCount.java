public class ArrayCount {
    public static void main(String[] args) {
        int []numbers={5,-3,0,12,-9,0,7};
        int positive=0;
        int negative=0;
        int zero=0;
        for(int i=0;i<numbers.length;i++) {
            if (numbers[i] < 0)
                negative+=1;
            else if (numbers[i]==0)
                zero+=1;
            else positive+=1;
        }
        System.out.println("positive:"+positive);
        System.out.println("negative:"+negative);
        System.out.println("zero:"+zero);


    }
}
