package sprint3Tasca_S301Nivel2.phoneNumber;

/**
 * ClassName: SpainPhoneNumber
 * Package: sprint3Tasca_S301Nivel２
 * Description:
 * Author: Rong Jiang
 * Create:13/11/2025 - 22:06
 * Version:v1.0
 */
public class PhoneNumberSpain implements PhoneNumber{
    private final String phoneNumber;
    private static final String COUNTRYCODE = "+34";
    public PhoneNumberSpain(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getFormatted() {
        return COUNTRYCODE +" "+ phoneNumber;
    }
}
