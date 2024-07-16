import java.util.Scanner;

public class BTTH1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử của mảng: ");
        int a = sc.nextInt();

        int[] array = new int[a];

        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i < a; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Nhập phần tử cần xoá: ");
        int xoa = sc.nextInt();

        int index = -1;
        for (int i = 0; i < a; i++) {
            if (array[i] == xoa) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Phần tử không tồn tại trong mảng.");
        } else {
            for (int i = index; i < a - 1; i++) {
                array[i] = array[i + 1];
            }

            int[] newArray = new int[a - 1];
            for (int i = 0; i < a - 1; i++) {
                newArray[i] = array[i];
            }

            System.out.println("Mảng sau khi xoá phần tử:");
            for (int i = 0; i < newArray.length; i++) {
                System.out.print(newArray[i] + " ");
            }
        }

        sc.next();
    }
}

