package sprint3Tasca_S301Nivel2;

import sprint3Tasca_S301Nivel2.address.Address;
import sprint3Tasca_S301Nivel2.address.AddressData;
import sprint3Tasca_S301Nivel2.factory.Factory;
import sprint3Tasca_S301Nivel2.phoneNumber.PhoneNumber;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: GlobalContactBook
 * Package: sprint3Tasca_S301Nivel２
 * Description:
 * Author: Rong Jiang
 * Create:15/11/2025 - 20:25
 * Version:v1.0
 */
public class GlobalContactBook {
    private Factory contactFactory;
    private List<Contact> contactBook;

    public GlobalContactBook(Factory contactFactory) {
        this.contactFactory = contactFactory;
        this.contactBook = new ArrayList<>();
    }

    public Factory getContactFactory() {
        return contactFactory;
    }

    public void setContactFactory(Factory contactFactory) {
        this.contactFactory = contactFactory;
    }

    public List<Contact> getContactBook() {
        return new ArrayList<>(contactBook);
    }

    public void addContact(AddressData addressData, String phoneNumber) {
        Address address = this.contactFactory.createAddress(addressData);
        PhoneNumber internationalPhoneNumber = this.contactFactory.createPhoneNumber(phoneNumber);
        contactBook.add(new Contact(address,internationalPhoneNumber));
    }

    public void showContactBook() {
        this.contactBook.forEach(System.out::println);
    }
}
