package designPatterns.facade.order;

public interface DeliveryService {
    void deliveryProduct(Long productsId, int amount, String recipient);
}
