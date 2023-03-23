package test;

import java.util.ArrayList;
import java.util.List;

public class TestEx1 extends CommonClass {
    private List<Integer> finalArr;

    public void filterAndSortPrime() {
        List<Integer> newArr = new ArrayList<>();
        for (int i = 0; i < super.getArr().size(); i++) {
            boolean isPrime = true;
            int socheck = super.getArr().get(i);
            if (socheck <= 1) {
                isPrime = false;
            }
            // check so nguyen to khi n >= 2
            if (socheck > 3) {
                for (int j = 2; j <= socheck / 2; j++) {
                    if (socheck % j == 0) {
                        isPrime = false;
                    }
                }
            }
            if (isPrime) {
                newArr.add(socheck);
            }
        }

        newArr.sort((o1, o2) -> o1 - o2);
        this.finalArr = newArr;
    }

    @Override
    public void createArr() {
        ArrayList<Integer> newArr = new ArrayList<>();
        for (int i = 0; i < super.getN(); i++) {
            System.out.print("Nhập phần tử thứ " + i + ":");
            newArr.add(sc.nextInt());
        }
        super.setArr(newArr);
    }

    public TestEx1() {
        super();
    }

    public void show(String message) {
        super.show(message);
        System.out.println("Mảng sau khi loại bỏ các số không phải là số nguyên tố, sắp xếp theo thứ tự tăng dần là:");
        System.out.println(this.finalArr);
    }
}
