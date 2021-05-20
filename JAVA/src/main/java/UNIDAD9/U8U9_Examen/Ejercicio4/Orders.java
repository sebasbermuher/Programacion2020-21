package UNIDAD9.U8U9_Examen.Ejercicio4;

public class Orders {
    private final Integer orderNumber;
    private final String orderDate;
    private final String requiredDate;
    private final String shippedDate;
    private final String status;
    private final String comments;
    private final Integer customerNumber;

    public Orders(Integer orderNumber, String orderDate, String requiredDate, String shippedDate, String status, String comments, Integer customerNumber) {
        this.orderNumber=orderNumber;
        this.orderDate=orderDate;
        this.requiredDate=requiredDate;
        this.shippedDate=shippedDate;
        this.status=status;
        this.comments=comments;
        this.customerNumber=customerNumber;

    }

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public String getRequiredDate() {
        return requiredDate;
    }

    public String getShippedDate() {
        return shippedDate;
    }

    public String getStatus() {
        return status;
    }

    public String getComments() {
        return comments;
    }

    public Integer getCustomerNumber() {
        return customerNumber;
    }

}

