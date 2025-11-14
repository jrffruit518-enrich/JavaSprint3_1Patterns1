package sprint3Tasca_S301Nivel２;

/**
 * ClassName: AddressData
 * Package: sprint3Tasca_S301Nivel２
 * Description:
 * Author: Rong Jiang
 * Create:13/11/2025 - 22:08
 * Version:v1.0
 */
public class AddressData {
 private String streetAndNumber;
 private String city;
 private String postCode;
 private String province;

    public AddressData(String streetAndNumber,String city, String postCode, String province) {
        this.streetAndNumber = streetAndNumber;
        this.city = city;
        this.postCode = postCode;
        this.province = province;
    }

    public String getStreetAndNumber() {
        return streetAndNumber;
    }

    public void setStreetAndNumber(String streetAndNumber) {
        this.streetAndNumber = streetAndNumber;
    }

    public String getPostCode() {
        return postCode;
    }

    public String getCity() {
        return city;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}
