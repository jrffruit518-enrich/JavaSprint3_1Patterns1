package sprint3Tasca_S301Nivel2.phoneNumber;

/**
 * ClassName: PhoneNumberUSA
 * Package: sprint3Tasca_S301Nivel２
 * Description:
 * Author: Rong Jiang
 * Create:13/11/2025 - 22:35
 * Version:v1.0
 */
public class PhoneNumberUSA implements PhoneNumber{
    private final String phoneNumber;
    private static final String COUNTRYCODE = "+1";
    public PhoneNumberUSA(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getFormatted() {
        return COUNTRYCODE +" "+ phoneNumber;
    }
}
