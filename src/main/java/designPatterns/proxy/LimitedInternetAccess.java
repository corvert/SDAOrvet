package designPatterns.proxy;

public class LimitedInternetAccess  implements OfficeInternetAccess{

    private String name;

    public LimitedInternetAccess(String name) {
        this.name = name;
    }

    @Override
    public void grantInternetAccess() {
        System.out.println("Limited internet access granted to user");
    }
}
