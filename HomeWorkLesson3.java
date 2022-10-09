package lesson3;

public class HomeWorkLesson3 {
    public static void main(String[] args) {


        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Test1: ");
        Test1(arr1);
        System.out.println("Test2: ");
        Test2(100);
        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Test3: ");
        Test3(arr2);
        System.out.println("Test4: ");
        Test4();
        System.out.println("Test5: ");
        Test5(5, 1);





    }

    private static void Test1(int[] arr1){

        for (int i = 0; i < arr1.length; i++){
            if (arr1[i] == 0){
                arr1[i] = 1;
            } else {
                arr1[i] = 0;
            }
            System.out.print(arr1[i] + " ");

        }
    }





        public static void Test2(int size) {

            int[] arr = new int[size];
            for (int i = 0; i < arr.length; i++) {

                arr[i] = i + 1;
                System.out.print(arr[i] + " ");
            }

        }



    private static void Test3(int[] arr2) {

            for (int i = 0; i < arr2.length; i++) {
                if (arr2[i] < 6) {
                    arr2[i] = arr2[i] * 2;
                }
                System.out.print(arr2[i] + " ");
            }
        }




    private static void Test4() {

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }




    private static void Test5(int len, int initialValue) {

        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }


    }


}












