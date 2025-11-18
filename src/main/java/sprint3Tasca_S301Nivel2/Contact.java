package sprint3Tasca_S301Nivel2;

import sprint3Tasca_S301Nivel2.address.Address;
import sprint3Tasca_S301Nivel2.phoneNumber.PhoneNumber;

import java.util.Objects;

/**
 * ClassName: Contact
 * Package: sprint3Tasca_S301Nivel２
 * Description:
 * Author: Rong Jiang
 * Create:15/11/2025 - 20:37
 * Version:v1.0
 */
public class Contact {
    private Address address;
    private PhoneNumber phoneNumber;

    public Contact(Address address, PhoneNumber phoneNumber) {
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(address, contact.address) && Objects.equals(phoneNumber, contact.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, phoneNumber);
    }

    @Override
    public String toString() {
        return "Contact{" +
                "address: " + address.getFormatted() +
                ", phoneNumber: " + phoneNumber.getFormatted() +
                '}';
    }
}
