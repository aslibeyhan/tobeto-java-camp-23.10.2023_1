package org.example;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        // Category Sınıfı Tanımlama
        Category category1=new Category("çantalar","1");
        Category category2=new Category("takılar","2");
        Category category3=new Category("ayakkabılar","3");

        Category[] categories={category1,category2,category3};
        for (Category category:categories) {
            System.out.println(category.getCategoryName());
        }

        // Order Sınıfı Tanımlama

        Order order1=new Order("200","1.1.2020",4);
        Order order2=new Order("201","1.2.2020",42);
        Order order3=new Order("202","1.3.2020",44);

        Order[] orders={order1,order2,order3};

        for (Order order : orders){
            System.out.println(order.getOrderDate() + " tarihli, " + order.getOrderNo()
                    + " numaralı siparişin " + order.getUnitsOrder() + " adet ürünü var.");
        }



        //Product Sınfı Tanımlama

        Product product1 = new Product(2,"Bilgisayar Çantası",1222.3,45);
        System.out.println(product1.getProductName() + " fiyatı : " + product1.getUnitPrice() + " TL" );

        //User Sınıfı Tanımlama

        User user=new User(1,"Aslı","beyhan","asli@gmail.com","12345");
        System.out.println("Kullanıcı bilgileri : \n" + user.getFirsName() + " " + user.getLastName()
                + "\n" + user.geteMail() + "\n" );


    }
}