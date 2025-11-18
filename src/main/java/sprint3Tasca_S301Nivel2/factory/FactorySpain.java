package sprint3Tasca_S301Nivel2.factory;

import sprint3Tasca_S301Nivel2.phoneNumber.PhoneNumber;
import sprint3Tasca_S301Nivel2.phoneNumber.PhoneNumberSpain;
import sprint3Tasca_S301Nivel2.address.Address;
import sprint3Tasca_S301Nivel2.address.AddressData;
import sprint3Tasca_S301Nivel2.address.AddressSpain;

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
