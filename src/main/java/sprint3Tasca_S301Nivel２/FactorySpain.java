package sprint3Tasca_S301Nivel２;

/**
 * ClassName: FactorySpain
 * Package: sprint3Tasca_S301Nivel２
 * Description:
 * Author: Rong Jiang
 * Create:15/11/2025 - 20:23
 * Version:v1.0
 */
public class FactorySpain implements Factory{
    @Override
    public Address createAddress(AddressData addressData) {
        return new AddressSpain(addressData);
    }

    @Override
    public PhoneNumber createPhoneNumber(String phoneNumber) {
        return new PhoneNumberSpain(phoneNumber);
    }
}
