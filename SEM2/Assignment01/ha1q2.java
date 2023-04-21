import java.util.Scanner;

public class ha1q2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lenght of the sentence : ");int n = sc.nextInt();

        String[] lines = new String[n]; 
        int count = 0;

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            lines[count++] = line;
        }

        for (int i = count - 1; i >= 0; i--) {
            System.out.println(lines[i]);
        }

        sc.close();
    }
}
