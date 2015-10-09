class Main {

    //все хорошо

    static String arr[] = {"f", "s", "a", "d", "g", "l",

            "o", "e", "t", "n", "m", "h",

            "i", "z", "r", "y" };

    public static void main(String args[]) {

        for (int j = 0; j < arr.length; j++) {

            for (int i = j + 1; i < arr.length; i++) {

                if (arr[i].compareTo(arr[j]) < 0) {

                    String t = arr[j];

                    arr[j] = arr[i];

                    arr[i] = t;

                }

            }

            System.out.println(arr[j]);

        }

    } }