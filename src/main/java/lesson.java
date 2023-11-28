import java.util.*;
import java.lang.*;

public class lesson {
    public static void main(String[] args) {
        System.out.println("---------- start1 ----------");
        // 乱数(一桁の非負整数)から素数だけを抽出
        new Random().ints(10, 0, 10)
                .filter(i -> Arrays.asList(2, 3, 5, 7).contains(i)) // ラムダ式
                .forEach(System.out::println);

        System.out.println();
        System.out.println("---------- start2 ----------");
        // 上はこうも書ける
        new Random().ints(10, 0, 10)
                .filter(Arrays.asList(2, 3, 5, 7)::contains)    // メソッド参照
                .forEach(System.out::println);
    }
}