package designPatterns.facade.order;

public interface PaymentService {
    void pay (Long productId, int amount);
}
