import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Entities.Customer;

public class Main {

    public static void main(String[] args) {
        StarbucksManager cm = new StarbucksManager(new MernisServiceAdapter());
        cm.saveCustomer(new Customer(1,"Nevzat","Peker","y",1994,1));
        cm.saveCustomer(new Customer(2,"Muhammed","Şengüler","x",1995,2));
    }
}
