package advFeatLiveCoding.task05;

import java.util.*;
import java.util.stream.Collectors;

public class Inventory {
    private List<Product> productList;

    public Inventory() {
        this.productList = new ArrayList<>();
    }

    public void addProducts(Product... products) {
        this.productList.addAll(Arrays.asList(products));
    }

    public List<Product> specifiedPrice(double price) {
        return this.productList
                .stream()
                .filter(product -> product.getPrice() < price)
                .collect(Collectors.toList());
    }

    public List<Product> getProductsWithQuan(int unit) {
        return this.productList
                .stream()
                .filter(product -> product.getQuantity() >= unit)
                .collect(Collectors.toList());
    }


    public double totalSum() {
        return this.productList
                .stream().mapToDouble(Product::getPrice).sum();
    }

    public double averagePrice() {
        return this.productList
                .stream().mapToDouble(Product::getPrice)
                .average().orElse(0.0);
    }

    public Product maxPrice() {
        return this.productList
                .stream()
                .max(Comparator.comparingDouble(Product::getPrice))
                .orElse(null);
    }
}
