import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TrafficLight light = new TrafficLight();

        // Show 6 changes
        for (int i = 0; i < 6; i++) {
            System.out.println(light.getColor() + " -> " + light.getAction());
            light.change();
        }

        // List all colors with their number
        System.out.println();
        for (LightColor c : LightColor.values()) {
            System.out.println(c.ordinal() + ": " + c);
        }

        // Extra: ask the user for a color
        // If the user types "blue", the program stops with an error
        Scanner sc = new Scanner(System.in);

        System.out.print("\nType a colour: ");
        String text = sc.nextLine().toUpperCase();

        LightColor chosen = LightColor.valueOf(text);
        System.out.println("You chose " + chosen);
    }
}
