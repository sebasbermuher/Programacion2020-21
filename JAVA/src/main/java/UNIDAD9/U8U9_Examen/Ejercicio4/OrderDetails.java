package UNIDAD9.U8U9_Examen.Ejercicio4;

import java.net.Inet4Address;

public class OrderDetails {
    private final Integer orderNumber;
    private final String productCode;
    private final Integer quantityOrdered;
    private final Integer priceEach;
    private final Integer orderLineNumber;


    public OrderDetails(Integer orderNumber, String productCode, Integer quantityOrdered, Integer priceEach, Integer orderLineNumber) {
        this.orderNumber=orderNumber;
        this.productCode=productCode;
        this.quantityOrdered=quantityOrdered;
        this.priceEach=priceEach;
        this.orderLineNumber=orderLineNumber;
    }

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public String getProductCode() {
        return productCode;
    }

    public Integer getQuantityOrdered() {
        return quantityOrdered;
    }

    public Integer getPriceEach() {
        return priceEach;
    }

    public Integer getOrderLineNumber() {
        return orderLineNumber;
    }

}

