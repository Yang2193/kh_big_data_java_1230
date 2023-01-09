package 중첩array;
// 2차원 배열에 대해서
public class DoubleArray {
    public static void main(String[] args) {
        int[][] arr = new int[2][3]; // 2행 3열
        int k = 10;
        for (int i = 0; i < arr.length; i++) { // 행의 갯수를 알 수 있음.
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = k;
                k += 10;
            }

        }
        for (int i = 0; i < arr.length; i++) { // 행의 갯수를 알 수 있음.

            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j] + " ");
            }




        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) { // 행의 갯수를 알 수 있음.

            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j] + " ");
            }

            System.out.println();


        }

        for(int[] row : arr) { //향상된 for 문 이중배열 나타내기. for(int[] 라는 파일의 이름이 나와야한다.
            for(int e : row) System.out.print(e + " ");
            System.out.println();
        }

    }

}
