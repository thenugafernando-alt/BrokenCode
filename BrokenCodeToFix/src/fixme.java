//This should be able to solve J3 as seen in Instructions.pdf.
import java.util.Scanner;

/**
 *
 * @author SPH_SHSM
 */
public class fixme {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Read in a number
        int lines = in.nextInt();
        in.nextLine();

        StringBuilder output = new StringBuilder();

        // Loop through the lines
        for (int i = 0; i < lines; i++) {
            String input = in.nextLine();
            if (input.isEmpty()) {
                output.append("\n");
                continue;
            }

            char previousChar = input.charAt(0);
            int currentCount = 1;
            StringBuilder line = new StringBuilder();

            for (int j = 1; j < input.length(); j++) {
                char currentChar = input.charAt(j);

                if (currentChar == previousChar) {
                    currentCount++;
                } else {
                    if (line.length() > 0) {
                        line.append(" ");
                    }
                    line.append(currentCount).append(" ").append(previousChar);
                    previousChar = currentChar;
                    currentCount = 1;
                }
            }

            if (line.length() > 0) {
                line.append(" ");
            }
            line.append(currentCount).append(" ").append(previousChar);
            output.append(line).append("\n");
        }

        System.out.print(output.toString());
        in.close();
    }
}
