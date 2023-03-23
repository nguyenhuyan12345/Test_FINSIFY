package test;

import java.util.ArrayList;
import java.util.List;

public class TestEx2 extends CommonClass {
    private Integer pos;

    public void inputPos() {
        int n = -1;
        do {
            System.out.println("Nhập vị trí phần tử cần tìm trong dãy số:");
            n = sc.nextInt();
        } while (n < 0 || n > super.getN() - 1);
        this.pos = n;
    }

    @Override
    public void createArr() {
        List<Integer> newArr = new ArrayList<>();
        for (int i = 0; i < super.getN(); i++) {
            newArr.add(fibonacci(i));
        }
        super.setArr(newArr);
    }

    private int fibonacci(int n) {
        int f0 = 0;
        int f1 = 1;
        int fn = 1;

        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            for (int i = 2; i < n; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
        }
        return fn;
    }

    public TestEx2() {
        super();
    }

    public void show(String message) {
        super.show(message);
        System.out.println("Phần tử thứ" + this.pos + "là:");
        System.out.println(super.getArr().get(this.pos));
    }
}
