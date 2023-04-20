public class TestStatistics {
    public static void main(String[] args) {
        int[] scores = {57, 82, 95, 43, 32, 89, 85, 85, 45, 79};
        int sum = 0;
        int min = scores[0];
        int max = scores[0];

        for (int i = 0; i < scores.length; i++) {
            int score = scores[i];
            sum += score;
            if (score < min) {
                min = score;
            } if (score > max) {
                max = score;
            }
        }
       double average = (double) sum / scores.length;
        System.out.println("Average score: " + average);
        System.out.println("Lowest score: " + min);
        System.out.println("Highest score: " + max);
    }
}
