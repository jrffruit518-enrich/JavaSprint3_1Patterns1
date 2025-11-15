package sprint3Tasca_S301Nivel２;

/**
 * ClassName: GlobalContactBookMain
 * Package: sprint3Tasca_S301Nivel２
 * Description:
 * Author: Rong Jiang
 * Create:15/11/2025 - 20:46
 * Version:v1.0
 */
public class GlobalContactBookMain {
    public static void main(String[] args) {
        GlobalContactBook globalContactBook = new GlobalContactBook(new FactorySpain());
        globalContactBook.addContact(new AddressData("pont 15","Barcelona","08155","Barcelona"),"6954321");
        globalContactBook.setContactFactory(new FactoryUSA());
        globalContactBook.addContact(new AddressData("san15","NewYork","231245","NY"),"23514845");
        globalContactBook.showContactBook();
    }
}
