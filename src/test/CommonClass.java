package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class CommonClass {
    public static Scanner sc = new Scanner(System.in);
    private Integer n;
    private List<Integer> arr;

    abstract public void createArr();

    public void inputNumber() {
        do {
            System.out.println("Nhập số phần tử của mảng:");
            n = sc.nextInt();
        } while (n < 0);
    }

    public CommonClass() {
        this.arr = new ArrayList<>();
    }

    public void setArr(List<Integer> arr) {
        this.arr = arr;
    }

    public List<Integer> getArr() {
        return arr;
    }

    public Integer getN() {
        return n;
    }

    public void show(String message) {
        if (message == null) {
            message = "\nMảng ban đầu là:";
        }
        System.out.println("\n" + message);
        System.out.println(this.arr);
    }
}
