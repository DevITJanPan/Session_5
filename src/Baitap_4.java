import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Baitap_4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str= scanner.nextLine();
        //Sử dụng Regex
        String regex="\\d";//Biểu thức chính quy để khớp với bất kỳ chữ số nào
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        System.out.printf("\n");
        // phương thức isDigit của lớp Character
        boolean strisDigit = false;
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                strisDigit = true;
                break;
            }
        }

        if (strisDigit) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
