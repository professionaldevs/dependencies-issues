package org.professionaldevs.products;

public class SqlDataConnector {
    public String connect(){
        String barCode = ProductUtils.getBarCode("product-12345");

        return "Connected for product: " + barCode;
    }
}
