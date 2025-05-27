public class BusPassengerCounter {
    public static void main(String[] args) {
        // 初始值为0
        int count = 0;
        
        // 公交车第一站，上来一个乘客
        count = count + 1;
        
        // 公交车第二站，上来两个乘客，下去一个乘客
        count = count + 2 - 1;
        
        // 公交车第三站，下去一个乘客
        count = count - 1;
        
        // 终点站，计算车上剩余乘客数量
        System.out.println("车上剩余乘客数量：" + count);
    }
}