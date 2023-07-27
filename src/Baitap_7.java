import java.util.Scanner;

public class Baitap_7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi :");
        String str= scanner.nextLine();
        System.out.println("Chuỗi sau khi bỏ kí tự trùng lặp: ");
        for (int i = 0; i < str.length(); i++) {
            if (i>0) {
                boolean isCheck = false;
                for (int j = i - 1; j >=0; j--) {
                    if (str.charAt(i)==str.charAt(j)){
                        isCheck = true;
                    }
                }
                if (!isCheck){
                    System.out.printf("%c\t",str.charAt(i));
                }
            }else{
                System.out.printf("%c\t",str.charAt(i));
            }
        }
        System.out.printf("\n");
    }
}
