import Abstract.PersonCheckService;
import Entities.Customer;

public class CustomerCheckManager implements PersonCheckService {
    @Override
    public boolean checkCustomer(Customer customer) {
        return true;
    }
}
