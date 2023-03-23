import test.TestEx1;
import test.TestEx2;

public class main {

    public static void main(String[] args) {

// Bài 1
        System.out.println("Bài test 1: Cho dãy số tự nhiên A. Cài đặt chương trình sắp xếp dãy số A từ nhỏ đến lớn và loại bỏ số không phải là số nguyên tố");
        TestEx1 testEx1 = new TestEx1();
        testEx1.inputNumber();
        testEx1.createArr();
        testEx1.filterAndSortPrime();
        testEx1.show("Mảng chứa số tự nhiên ban đầu là:"); // In ra kết quả

// Bài 2
        System.out.println("\nBài test 2: Cài đặt chương trình tìm số thứ N trong dãy Fibonacci.");
        TestEx2 testEx2 = new TestEx2();
        testEx2.inputNumber();
        testEx2.inputPos();
        testEx2.createArr();
        testEx2.show("Mang chứa dãy số Fibonacci là:");
    }
}
