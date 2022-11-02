public class Z2 {
    public static void main(String[] args) {
        int[] numbers =  new int[10];


        for(int i = 0; i < numbers.length; i++){
            numbers[i] = ((int)(Math.random() * 101) + 1);
        }

        int min = numbers[0];
        int max = numbers[0];

        for (int x: numbers) System.out.println(x);

        for (int i=1; i < numbers.length; i++ ){
            if (min > numbers[i]) min = numbers[i];
            else if(max < numbers[i]) max =  numbers[i];
        }

        System.out.println("Max: "+ max);
        System.out.println("Min: "+ min);
    }
}
