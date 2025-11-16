package sprint3Tasca_S301Nivel２.factory;

import sprint3Tasca_S301Nivel２.phoneNumber.PhoneNumber;
import sprint3Tasca_S301Nivel２.address.Address;
import sprint3Tasca_S301Nivel２.address.AddressData;

/**
 * ClassName: ContactFactory
 * Package: sprint3Tasca_S301Nivel２
 * Description:
 * Author: Rong Jiang
 * Create:13/11/2025 - 22:03
 * Version:v1.0
 */
public interface Factory {
    public Address createAddress(AddressData data);
    public PhoneNumber createPhoneNumber(String phoneNumber);

}
