import java.util.Scanner;

public class BTTH3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập kích thước của mảng 1: ");
        int size1 = sc.nextInt();
        int[] array1 = new int[size1];
        System.out.println("Nhập các phần tử cho mảng 1:");
        for (int i = 0; i < size1; i++) {
            System.out.print("Phần tử " + (i + 1) + ": ");
            array1[i] = sc.nextInt();
        }

        System.out.print("Nhập kích thước của mảng 2: ");
        int size2 = sc.nextInt();
        int[] array2 = new int[size2];
        System.out.println("Nhập các phần tử cho mảng 2:");
        for (int i = 0; i < size2; i++) {
            System.out.print("Phần tử " + (i + 1) + ": ");
            array2[i] = sc.nextInt();
        }

        int[] mergedArray = new int[size1 + size2];

        for (int i = 0; i < size1; i++) {
            mergedArray[i] = array1[i];
        }

        for (int i = 0; i < size2; i++) {
            mergedArray[size1 + i] = array2[i];
        }

        System.out.println("Mảng sau khi gộp:");
        for (int i : mergedArray) {
            System.out.print(i + " ");
        }
    }
}
