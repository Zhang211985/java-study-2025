// 导入Scanner类包
import java.util.Scanner;

public class NumberInputDemo {
    public static void main(String[] args) {
        // 创建Scanner对象
        Scanner sc = new Scanner(System.in);
        
        // 提示用户输入
        System.out.println("请输入数字：");
        
        // 接收整数输入
        int number = sc.nextInt();
        
        // 输出结果
        System.out.println("您输入的数字是：" + number);

        }
}