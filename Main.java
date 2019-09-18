package packagetwo;

public class Main {
//    public static void main(String[] args) {
//        int n = 20;
//        for (int i = 1; i <= n; i++) {
//            if (i % 2 != 0) {
//                System.out.println(i + " ");
//            }
//        }
//    }
//}

  /*  public static void main(String[] args) {
        System.out.println("Numbers: Squares:");
        for(int i = 1; i <= 10; i++) {
            System.out.printf("%d \t %d\n", i, (int) Math.pow(i, 2));
        }
    }
}


  /*  public static void main(String[] args) {
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        for (int x = 1; x < breakfast.length; x++) {
            System.out.println(breakfast[x]);
        }
    }
}*/

  /*  public static void main(String[] args) {

        System.out.println(squares() );
    }
    public static String squares () {
        String response = "";
        for (int y = 1; y < 11; y++)
            response += y * y + "\n";
        return response;
    }
} */


//        //Type your code here
//        public static void main(String[] args){
//            System.out.println(printGivenStringTimesNumberGiven("Ha", 3));
//        }
//        public static String printGivenStringTimesNumberGiven(String str, int n) {
//        String answer = "";
//        for (int i = 0; i < n; i++) {
//            answer += str;
//        }
//        return answer;
//        }
//    }

//    public static String printOddNumbersInRange(int start, int end) {
//        String result = "";
//        //Type your code here
//
//        for (int i = start; i >= end; i--) {
//            if (i % 2 != 0) {
//                result  += i;
//            }
//        }
//            return result;
//        }


    //public static void main(String[]args){
//            int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//            int total = 0;
//
//            for (int i = 0; i < arr.length; i++) {              get average
//                total = total + arr[i];
//            }
//            int average = total / arr.length;
//            System.out.format(average);
//        }
//    }


//    public String oneToTen() {
//        public static void main (String[]args){
//            printOneToTen();        }
//
//        public static void oneToTen
//        for {int x = 10;x > 0;x--} ;
//
//        System.out.println(x);

//    public static void getSum() {
//        int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int total = 0;
//        //ADD ARRAYS TOGETHER FOR SUM
//        for (int num : x) {
//            total += num;
//        }
//        System.out.println(total);
//    }
//}

//    public static String extractAllEvenNumbers(int[] numbers) {
//        //Type your code here
//        String even= "";
//        Arrays.sort(numbers);
//        for(int z = 0; z < numbers.length; z++){
//            if(numbers[z])%2==0){
//                even = even + numbers[z] + ",";
//            }
//        }
//        return even.substring(0, 10);
//    }
//    public static void main(String[] args) {
//        int[]input = {2, 5, 6, 7, 23, 4, 8, 12, 9};
//        extractAllEvenNumbers(input);
//    }


        public static String[] swap(String[] stringArray) {
            String temp = stringArray[0];
            stringArray[0] = stringArray[2];
            stringArray[2] = temp;
            return stringArray;
        }
        public static void main(String[] args) {
            String[] arr = {"A1", "B2", "C3"};
            swap(arr);
        }
    }
