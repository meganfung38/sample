public class Alpha {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                sum += i;
            } else {
                for (int j = 0; j < 3; j++) {
                    if (j == 2) {
                        sum += j;
                    }
                }
            }
        }
        while (sum < 20) {
            if (sum % 3 == 0) sum++;
            else sum += 2;
        }
        System.out.println(sum);
    }
}



// size: 23
// complexity: 6