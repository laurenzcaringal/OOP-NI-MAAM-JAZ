public class ArrayActivity {
    public static void main(String[] args) {

        int[] scores = {65, 88, 93, 70, 82, 91, 76, 84, 95, 68};

        System.out.println("First: " + scores[0]);
        System.out.println("Last: " + scores[scores.length - 1]);

        int min = scores[0];
        int max = scores[0];

        for (int value : scores) {
            if (value < min) min = value;
            if (value > max) max = value;
        }

        System.out.println("Lowest: " + min);
        System.out.println("Highest: " + max + "\n");

        for (int index = 0; index < scores.length; index++) {
            System.out.println("Score[" + index + "] = " + scores[index]);
        }

        System.out.println();

        for (int val : scores) {
            System.out.println("Score: " + val);
        }

        int total = 0;
        for (int v : scores) {
            total += v;
        }

        double avg = total / (double) scores.length;
        System.out.println("\nAverage score: " + avg);
    }
}
