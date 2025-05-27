import java.util.Scanner;

public class ScannerSum {
    public static void main(String[] args) {
        // 创建Scanner对象
        Scanner sc = new Scanner(System.in);
        
        // 提示用户输入第一个数
        System.out.println("请输入第一个数");
        int number1 = sc.nextInt();
        
        // 提示用户输入第二个数
        System.out.println("请输入第二个数");
        int number2 = sc.nextInt();
        
        // 计算并输出和
        System.out.println(number1 + number2);
    }
}