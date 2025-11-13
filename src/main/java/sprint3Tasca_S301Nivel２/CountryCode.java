package sprint3Tasca_S301Nivel２;

/**
 * ClassName: CountCode
 * Package: sprint3Tasca_S301Nivel２
 * Description:
 * Author: Rong Jiang
 * Create:13/11/2025 - 22:14
 * Version:v1.0
 */
public enum CountryCode {
    USA("+1"),
    SPAIN("+34");
    private final String countryCode;
    private CountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryCode() {
        return countryCode;
    }
}
