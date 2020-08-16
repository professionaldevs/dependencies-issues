package org.professionaldevs.products;

public class ProductsApplication {
    public static void main(String ... args){
        String barcode = ProductUtils.getBarCode("product-123123");
        SqlDataConnector connector = new SqlDataConnector();
        String connectorMessage = connector.connect();

        System.out.println("No error!");
        System.out.println(barcode);
        System.out.println(connectorMessage);
    }
}
