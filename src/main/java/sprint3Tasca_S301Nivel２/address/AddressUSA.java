package sprint3Tasca_S301Nivel２.address;

/**
 * ClassName: AddressUSA
 * Package: sprint3Tasca_S301Nivel２
 * Description:
 * Author: Rong Jiang
 * Create:14/11/2025 - 13:01
 * Version:v1.0
 */
public class AddressUSA implements Address {
    private final AddressData addressData;
    private static final String COUNTRY = "USA";

    public AddressUSA(AddressData addressData) {
        this.addressData = addressData;
    }

    @Override
    public String getFormatted() {
        return addressData.getStreetAndNumber() + "," + addressData.getCity() + "," + addressData.getProvince() + "," + addressData.getPostCode() + "," + COUNTRY;
    }
}
