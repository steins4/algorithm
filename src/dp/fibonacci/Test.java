package dp.fibonacci;

import java.text.SimpleDateFormat;

public class Test {
    static final int FIBONACCI_NUM = 46;
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(Fibonacci1.fibonacci(FIBONACCI_NUM));
        long fibonacci1Time = System.currentTimeMillis();
        System.out.println( new SimpleDateFormat("HH:mm:ss").format(fibonacci1Time - start) );
        System.out.println(Fibonacci2.fibonacci(FIBONACCI_NUM));
        long fibonacci2Time = System.currentTimeMillis();
        System.out.println(fibonacci2Time - fibonacci1Time);
        System.out.println(Fibonacci3.fibonacci(FIBONACCI_NUM));
        long fibonacci3Time = System.currentTimeMillis();
        System.out.println(fibonacci3Time - fibonacci2Time);


    }
}
