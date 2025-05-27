package com.zcc;
public class ProductInfoManager {
    public static void main(String[] args) {
        Product products[] = new Product[3];
        Product p1 = new Product("001", "可乐", 5, 10);
        Product p2 = new Product("002", "薯片", 8, 15);
        Product p3 = new Product("003", "薄荷糖", 1, 20);
        products[0] = p1;
        products[1] = p2;
        products[2] = p3;
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            System.out.println(product.getId() + "," + product.getName() + ","
                    + product.getPrice() + "," + product.getNumber());
        }
    }
}