package Adapters;

import Abstract.PersonCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.ws.KPSPublic;
import tr.gov.nvi.tckimlik.ws.KPSPublicSoap;

import java.net.MalformedURLException;
import java.net.URL;

public class MernisServiceAdapter implements PersonCheckService {

    @Override
    public boolean checkCustomer(Customer customer) {
        try {
            URL WS_ENDPOINT = new URL("https://tckimlik.nvi.gov.tr/Service/KPSPublic.asmx?wsdl");
            KPSPublic kpsPublic = new KPSPublic(WS_ENDPOINT);
            KPSPublicSoap kpsPublicSoap = kpsPublic.getKPSPublicSoap12();
            return kpsPublicSoap.tcKimlikNoDogrula(Long.parseLong(customer.getNationalityID()), customer.getFirstName(), customer.getLastName(), customer.getDateOfBirth());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
