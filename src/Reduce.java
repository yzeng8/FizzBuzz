public class Reduce {
    // These
    public static String reduce(int Number){
        int steps = 0;
        String binary = "";

        while (Number > 0){
            int remainder = Number % 2;
            binary = remainder + binary;
            Number /= 2;
        }
        return binary;
    }

    public static void main(String[] args) {
        System.out.println(reduce(1));
    }
}
