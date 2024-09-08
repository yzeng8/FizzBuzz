public class Mutiple {
    public static int findMultiple(int Number){
        int count = 0;

        for (int i = 0; i < Number; i++){
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            // Print our appropriate result.
            if (divisibleBy3 && divisibleBy5) {
                count ++;

            } else if (divisibleBy3) {

                count++;

            } else if (divisibleBy5) {

                count++;

            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("The number of multiples of 3 or 5 under 100 is "+findMultiple(1000));
    }
}
