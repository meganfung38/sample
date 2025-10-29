public class Alpha {
    // testing for in a comment
    /* for, while, switch */
    String test_strings = "for, while, if";

    public static void main(String[] args) {
        int x = 0;
        for (int i = 0; i < 5; i++) {            // 1
            if (i % 2 == 0) {                    // 2
                while (x < 10) {                 // 3
                    x++;
                    if (x % 3 == 0) {            // 4
                        for (int j = 0; j < 2; j++) {   // 5
                            if (j == 1) {        // 6
                                while (x < 15) { // 7
                                    x++;
                                }
                            }
                        }
                    } else if (x % 5 == 0) {     // 8
                        switch (x) {             // 9
                            case 5 -> System.out.println("Five");
                            case 10 -> System.out.println("Ten");
                            default -> System.out.println("Other");
                        }
                    } else if (x % 7 == 0) {     // 10
                        for (int k = 0; k < 3; k++) {   // 11
                            if (k == 2) {        // 12
                                System.out.println("Nested");
                            }
                        }
                    }
                }
            }
        }
    }
}
// size: 38
// complexity: 12 --> red