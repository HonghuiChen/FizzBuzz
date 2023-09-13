public class Multiples {
    public static void main(String[] args) {

        int i = 1;
        int n = 0;

        while (i < 1000) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            if (divisibleBy3 && divisibleBy5) {
                n++;
            }
            else if (divisibleBy3) {
                n++;
            }
            else if (divisibleBy5) {
                n++;
            }
            i++;
        }

        System.out.println(n);

    }
}
