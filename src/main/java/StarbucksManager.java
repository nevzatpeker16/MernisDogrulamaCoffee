import Abstract.BaseCustomerManager;
import Abstract.PersonCheckService;
import Entities.Customer;

public class StarbucksManager extends BaseCustomerManager {
    private PersonCheckService _personCheckService;

    public StarbucksManager() {
    }

    public StarbucksManager(PersonCheckService _personCheckService) {
        this._personCheckService = _personCheckService;
    }

    public void saveCustomer(Customer customer){
        if(_personCheckService.checkCustomer(customer)){
            addCustomer(customer);
        }
    else{
    System.out.println("Kullanıcı doğrulama başarısız..");
        }
    }
}
