public class SwitchOnOff {

    public static void main(String[] args) {

        int state = 0; // Initially OFF

        // Turn ON using OR
        state = state | 1;

        if ((state & 1) == 1) {
            System.out.println("Switch is ON");
        }

        // Turn OFF using AND
        state = state & 0;

        if ((state & 1) == 0) {
            System.out.println("Switch is OFF");
        }
    }
}
