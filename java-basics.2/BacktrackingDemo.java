public class BacktrackingDemo {

    public static void generate(String current, int n) {

        // Base case
        if (current.length() == n) {
            System.out.println(current);
            return;
        }

        // Choose 0
        generate(current + "0", n);

        // Choose 1
        generate(current + "1", n);
    }

    public static void main(String[] args) {
        int n = 3;
        generate("", n);
    }
}