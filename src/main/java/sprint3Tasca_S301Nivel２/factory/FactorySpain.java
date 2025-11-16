package sprint3Tasca_S301Nivel２.factory;

import sprint3Tasca_S301Nivel２.phoneNumber.PhoneNumber;
import sprint3Tasca_S301Nivel２.phoneNumber.PhoneNumberSpain;
import sprint3Tasca_S301Nivel２.address.Address;
import sprint3Tasca_S301Nivel２.address.AddressData;
import sprint3Tasca_S301Nivel２.address.AddressSpain;

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
