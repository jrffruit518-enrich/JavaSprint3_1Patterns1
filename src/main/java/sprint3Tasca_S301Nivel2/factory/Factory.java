package sprint3Tasca_S301Nivel2.factory;

import sprint3Tasca_S301Nivel2.phoneNumber.PhoneNumber;
import sprint3Tasca_S301Nivel2.address.Address;
import sprint3Tasca_S301Nivel2.address.AddressData;

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
