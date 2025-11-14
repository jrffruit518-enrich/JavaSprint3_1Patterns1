package sprint3Tasca_S301Nivel２;

/**
 * ClassName: AddressUSA
 * Package: sprint3Tasca_S301Nivel２
 * Description:
 * Author: Rong Jiang
 * Create:14/11/2025 - 13:01
 * Version:v1.0
 */
public class AddressUSA implements Address{
    private AddressData addressData;
    private final String country = "USA";

    public AddressUSA(String streetAndNumber,String city,String postCode,String province ) {
        addressData= new AddressData(streetAndNumber,city,postCode,province);
    }

    @Override
    public String getformatted() {
        return addressData.getStreetAndNumber()+addressData.getCity()+addressData.getProvince()+addressData.getPostCode();
    }
}
