import java.util.Scanner;

public class BTTH2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int a = sc.nextInt();
        int[] array = new int[a + 1];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < a; i++) {
            array[i] = sc.nextInt();
        }
        // Nhập giá trị cần chèn và vị trí chèn
        System.out.print("Nhập giá trị cần chèn: ");
        int value = sc.nextInt();
        System.out.print("Nhập vị trí cần chèn (0-" + a + "): ");
        int position = sc.nextInt();

        if (position < 0 || position > a) {
            System.out.println("Vị trí chèn không hợp lệ.");
        } else {
            for (int i = a; i > position; i--) {
                array[i] = array[i - 1];
            }
            array[position] = value;
            System.out.println("Mảng sau khi chèn:");
            for (int i = 0; i <= a; i++) {
                System.out.print(array[i] + " ");
            }
        }
        sc.next();
    }
}
