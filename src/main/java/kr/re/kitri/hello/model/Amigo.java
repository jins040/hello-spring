package kr.re.kitri.hello.model;

/**
 * Created by danawacomputer on 2017-06-13.
 */
public class Amigo {

    private String amigoId;
    private String amigoName;
    private String phoneNum;
    private String email;

    public Amigo() {
    }
    public Amigo(String amigoId, String amigoName, String phoneNum, String email) {
        this.amigoId = amigoId;
        this.amigoName = amigoName;
        this.phoneNum = phoneNum;
        this.email = email;
    }

    public String getAmigoId() {
        return amigoId;
    }

    public void setAmigoId(String amigoId) {
        this.amigoId = amigoId;
    }

    public String getAmigoName() {
        return amigoName;
    }

    public void setAmigoName(String amigoName) {
        this.amigoName = amigoName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Amigo{" +
                "amigoId='" + amigoId + '\'' +
                ", amigoName='" + amigoName + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
