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
    private final AddressData addressData;

    public AddressUSA(String streetAndNumber,String city,String postCode,String province ) {
        addressData= new AddressData(streetAndNumber,city,postCode,province);
    }

    @Override
    public String getformatted() {
        String country = "USA";
        return addressData.getStreetAndNumber()+","+addressData.getCity()+","+addressData.getProvince()+","+addressData.getPostCode()+","+ country;
    }
}
