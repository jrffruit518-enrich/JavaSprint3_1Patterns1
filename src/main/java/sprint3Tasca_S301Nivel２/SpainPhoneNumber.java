package sprint3Tasca_S301Nivel２;

/**
 * ClassName: SpainPhoneNumber
 * Package: sprint3Tasca_S301Nivel２
 * Description:
 * Author: Rong Jiang
 * Create:13/11/2025 - 22:06
 * Version:v1.0
 */
public class SpainPhoneNumber implements PhoneNumber{
    private CountryCode countryCode = CountryCode.SPAIN;
    private String phoneNumber;

    public SpainPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getformatted() {
        return countryCode+" "+ phoneNumber;
    }
}
