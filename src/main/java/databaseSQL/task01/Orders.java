package databaseSQL.task01;

public class Orders {
    private static int orderId;
    private String orderDate;
    private boolean status;
    private String paymentMethod;

    public Orders(int orderId, String orderDate, boolean status, String paymentMethod) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.status = status;
        this.paymentMethod = paymentMethod;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
