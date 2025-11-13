package sprint3Tasca_S301Nivel２;

/**
 * ClassName: PhoneNumberUSA
 * Package: sprint3Tasca_S301Nivel２
 * Description:
 * Author: Rong Jiang
 * Create:13/11/2025 - 22:35
 * Version:v1.0
 */
public class PhoneNumberUSA implements PhoneNumber{
    private CountryCode countryCode = CountryCode.USA;
    private String phoneNumber;

    public PhoneNumberUSA(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getformatted() {
        return countryCode+" "+ phoneNumber;
    }
}
