package 홀수짝수나눠담기스트림;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OddEvenStream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] arr = new Integer[7];
        List<Integer> list = new ArrayList<>();
      //  for(int i = 0; i < 7; i++) arr[i] = sc.nextInt();
        for(int i = 0; i < 7; i++) list.add(sc.nextInt());

     //   Stream<Integer> stream1 = Arrays.stream(arr);
     //   Stream<Integer> stream2 = Arrays.stream(arr);

        System.out.print("홀수 : ");
      //  stream1.filter(n -> n % 2 == 1).forEach(e->System.out.print(e + " "));
        list.stream().filter(n -> n % 2 == 1).forEach(e->System.out.print(e + " "));
        System.out.println();
        System.out.print("짝수 : ");
      //  stream2.filter(n -> n %2 == 0).forEach(e->System.out.print(e + " "));
        list.stream().filter(n -> n % 2 == 0).forEach(e->System.out.print(e + " "));

    }
}
