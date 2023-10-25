package org.example;

public class Main {
    public static void main(String[] args) {
        String mesaj = "Vade oranı";
        //get value
        Product product1=new Product();
        product1.setName("bilgisayar");
        product1.setUnitPrice(234);
        product1.setDiscount(456);
        product1.setUnitInStock(43);
        product1.setImageUrl("bilfUrl");


        Product product2=new Product();
        product2.setName("mouse");
        product2.setUnitPrice(3);
        product2.setDiscount(5);
        product2.setUnitInStock(4);
        product2.setImageUrl("mousefUrl");

        Product product3=new Product();
        product3.setName("klavye");
        product3.setUnitPrice(34);
        product3.setDiscount(46);
        product3.setUnitInStock(23);
        product3.setImageUrl("klavyefUrl");

        Product[] products = {product1,product2,product3};
        System.out.println("<ul>");
        for(Product product:products) {
            System.out.println("<li>"+product.getName()+"</li>");
        }
        System.out.println("</ul>");

        IndividualCustomer individualCustomer=new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("2344");
        individualCustomer.setCustomerNumber("23454");
        individualCustomer.setFirstName("Aslı");
        individualCustomer.setLastName("Beyhan");

        CorporateCustomer corporateCustomer= new CorporateCustomer();
        corporateCustomer.setId(2);
        //corporateCustomer.setPhone("2334");
        corporateCustomer.setCustomerNumber("23");
        corporateCustomer.setCompanyName("kurumsal müşteri");
        corporateCustomer.setTaxNumber("240973509");

        Customer[] customers= {individualCustomer,corporateCustomer};

    }
    }
