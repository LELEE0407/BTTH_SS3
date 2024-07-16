public class Main {
    public static void main(String[] args) {
        String a = "hello";

        String c = "he";
        String d = "llo";
        String b = c + d;


        System.out.println("Giá trị của là " + a);
        System.out.println("dia chi cua a la " + System.identityHashCode(a));

        System.out.println("Giá trị của là " + b);
        System.out.println("dia chi cua  b la " + System.identityHashCode(b));
        if (a.equals(b)) {
            System.out.println("b co bang a");
        } else {
            System.out.println("b khong bang a");
        }

     // 16 char // 16 * 16 = ... số ô
        StringBuilder helloBuilder = new StringBuilder("hello"); // cú pháp tạo ra 1 object (đối tượng) từ 1 class (lớp)
        System.out.println("size cua helloBuilder " + helloBuilder.capacity());

//        String aa = "he";
//        System.out.println("Dia chi aa lan 1" + System.identityHashCode(aa));
//        aa = "he" + "llo"; // tao ra 1 choi moi co 5 size sau do chep he qua roi ghi them llo
//        System.out.println("Dia chi aa lan 2" + System.identityHashCode(aa));

        StringBuilder aaBuilder = new StringBuilder("he");
        System.out.println("lan 1 " + System.identityHashCode(aaBuilder));
        aaBuilder.append("llo");
        System.out.println(aaBuilder.toString());
        System.out.println("lan 2 " + System.identityHashCode(aaBuilder));

        // gia su ta co 5 o
        // ta co 1 bien co gia tri 3 o
        // sau do ta khai bao 3 + 1 tuc la gia tri moi 4 o
        // chuoi 3
        // chuoi moi 4 o => 3 + 1 = 4
    }
}


// ctr + alt + L