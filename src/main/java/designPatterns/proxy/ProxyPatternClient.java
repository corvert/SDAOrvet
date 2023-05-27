package designPatterns.proxy;

public class ProxyPatternClient {
    public static void main(String[] args) {
        OfficeInternetAccess officeInternetAccess = new ProxyInternetAccess("mahdad");
        officeInternetAccess.grantInternetAccess();

        OfficeInternetAccess officeInternetAccess1 = new ProxyInternetAccess("alex");
        officeInternetAccess1.grantInternetAccess();

        OfficeInternetAccess officeInternetAccess2 = new ProxyInternetAccess("attacker");
        officeInternetAccess2.grantInternetAccess();
    }
}
