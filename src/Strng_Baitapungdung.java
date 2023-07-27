import java.util.Scanner;

public class Strng_Baitapungdung {
    public static void main(String[] args) {
        /*
        *Bài tập ứng dụng String
        * 1. Nhập vào chuỗi str1 Literal, str2 String từ bàn phím bănggf 2 cách
        * 2. In ra độ dài của 2 chuỗi str1 và str2
        * 3. So sánh 2 chuỗi str1 và str2 có phân biệt hoa thường và không phân biệt hoa thường
        * 4. Kiểm tra chuỗi str1 có bắt đầu là Rikkei và kết thúc là Academy hay không
        * 5. In ra kết quả của nối 2 chuỗi str1 và str2
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập vào chuỗi str1:");
        String str1= scanner.nextLine();
        System.out.println("Nhập vào chuỗi str2:");
        String str2= new String(scanner.nextLine());

//        String str1="Rikkei Academy";
//        String str2="Rikkei Academy";
//        String str3= new String("Rikkei Academy");
//        String str4= new String("Rikkei Academy");
        System.out.println("Do dai cua chuoi str1"+str1.length());
        System.out.println("Do dai cua chuoi str1"+str2.length());
        System.out.println("So sánh 2 chuỗi str1 và str2 có phân biệt hoa thường"+str1.equals(str2));
        System.out.println("So sánh 2 chuỗi str1 và str2 không phân biệt hoa thường"+str1.equalsIgnoreCase(str2));
        System.out.println("Kiểm tra chuỗi str1 có bắt đầu là Rikkei"+str1.startsWith("Rikkei"));
        System.out.println("kết thúc là Academy hay không"+str1.endsWith("Academy"));
        System.out.println("kết quả của nối 2 chuỗi str1 và str2"+str1.concat(str2));

    }
}
