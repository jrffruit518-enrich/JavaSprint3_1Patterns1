package sprint3Tasca_S301Nivel２;

/**
 * ClassName: AddressSpain
 * Package: sprint3Tasca_S301Nivel２
 * Description:
 * Author: Rong Jiang
 * Create:14/11/2025 - 13:21
 * Version:v1.0
 */
public class AddressSpain implements  Address{
    private final AddressData addressData;

    public AddressSpain(String streetAndNumber,String city,String postCode,String province ) {
        addressData= new AddressData(streetAndNumber,city,postCode,province);
    }

    @Override
    public String getformatted() {
        String country = "Spain";
        return addressData.getStreetAndNumber()+","+addressData.getPostCode()+","+addressData.getCity()+","+addressData.getProvince()+","+ country;
    }
}
