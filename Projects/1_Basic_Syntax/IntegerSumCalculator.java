// 导入Scanner类
import java.util.Scanner;

public class IntegerSumCalculator {
    public static void main(String[] args) {
        // 创建Scanner对象用于接收用户输入
        Scanner scanner = new Scanner(System.in);
        
        // 提示用户输入
        System.out.println("请输入两个整数，程序将计算它们的和：");
        
        // 接收第一个整数
        int firstNumber = scanner.nextInt();
        // 接收第二个整数
        int secondNumber = scanner.nextInt();
        
        // 计算并输出结果
        int sum = firstNumber + secondNumber;
        System.out.println("两数之和为：" + sum);
      
   }
}