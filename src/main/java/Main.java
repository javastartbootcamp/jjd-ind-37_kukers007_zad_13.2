import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.run(new Scanner(System.in));
    }

    public void run(Scanner scanner) {

        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Podaj liczbe calkowitą, wiekszą od zera.");

        int number = scanner.nextInt();
        while (number >= 0) {
            numbers.add(number);
            number = scanner.nextInt();
        }

        Collections.reverse(numbers);
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i));
            if (i != numbers.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        Collections.reverse(numbers);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i));
            if (i != numbers.size() - 1) {
                System.out.print(" + ");
            } else {
                System.out.print(" = ");
            }
        }

        int suma = 0;
        for (Integer integer : numbers) {
            suma += integer;
        }

        System.out.println(suma);

        int max = Collections.max(numbers);
        int min = Collections.min(numbers);
        System.out.println("Największa liczba w liście to " + max);
        System.out.println("Najmniejsza liczba w liście to " + min);

    }
}