package sprint3Tasca_S301Nivel2.address;

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
    private static final String COUNTRY = "Spain";

    public AddressSpain(AddressData addressData ) {
        this.addressData= addressData;
    }

    @Override
    public String getFormatted() {
        return addressData.getStreetAndNumber()+","+addressData.getPostCode()+","+addressData.getCity()+","+addressData.getProvince()+","+ COUNTRY;
    }
}
