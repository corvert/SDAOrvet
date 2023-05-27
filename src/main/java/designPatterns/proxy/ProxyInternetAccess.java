package designPatterns.proxy;

public class ProxyInternetAccess implements OfficeInternetAccess{
    private String employeeName;

    public ProxyInternetAccess(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public void grantInternetAccess() {
        if (getRole(employeeName).equalsIgnoreCase("Manager")){
            OfficeInternetAccess realAccess = new RealInternetAccess(employeeName);
            realAccess.grantInternetAccess();
        } else if (getRole(employeeName).equalsIgnoreCase("normal_user")) {
            OfficeInternetAccess proxyAccess = new RealInternetAccess(employeeName);
            proxyAccess.grantInternetAccess();
        }else {
            System.out.println("No Internet access granted");
        }
    }
    private String getRole(String empName){
        if (empName.equalsIgnoreCase("mahdad")){
            return "manager";
        } else if (empName.equalsIgnoreCase("alex")) {
            return "normal_user";
        }else {
            return "non_employee";
        }
    }
}
