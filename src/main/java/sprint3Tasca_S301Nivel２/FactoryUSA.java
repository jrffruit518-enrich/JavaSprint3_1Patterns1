package sprint3Tasca_S301Nivel２;

/**
 * ClassName: FactoryUSA
 * Package: sprint3Tasca_S301Nivel２
 * Description:
 * Author: Rong Jiang
 * Create:15/11/2025 - 17:39
 * Version:v1.0
 */
public class FactoryUSA implements Factory {

    @Override
    public Address createAddress(AddressData addressData) {
        return new AddressUSA(addressData);
    }

    @Override
    public PhoneNumber createPhoneNumber(String phoneNumber) {
        return new PhoneNumberUSA(phoneNumber);
    }
}


