package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {

    @Override
    public void addCustomer(Customer customer) {
        System.out.println("Veritabanına: "+ customer.getFirstName() + " "
                + customer.getLastName() +" " + customer.getNationalityID() +" "+customer.getDateOfBirth() + " Kayıt Edildi.");
    }
}
