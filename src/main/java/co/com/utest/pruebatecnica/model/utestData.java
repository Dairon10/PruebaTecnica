package co.com.utest.pruebatecnica.model;

public class utestData {
    public utestData(String strName, String strLastName, String strEmail, String strPassword, String strConfirmPassword){
        this.strName = strName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strPassword = strPassword;
        this.strConfirmPassword = strConfirmPassword;
    }


    private String strName;
    private String strLastName;
    private String strEmail;
    private String strPassword;
    private String strConfirmPassword;

    public String getStrPassword() {
        return strPassword;
    }

    public void setStrPassword(String strPassword) {
        this.strPassword = strPassword;
    }

    public String getStrConfirmPassword() {
        return strConfirmPassword;
    }

    public void setStrConfirmPassword(String strConfirmPassword) {
        this.strConfirmPassword = strConfirmPassword;
    }



    public String getStrEmail() {
        return strEmail;
    }

    public void setStrEmail(String strEmail) {
        this.strEmail = strEmail;
    }



    public String getStrLastName() {
        return strLastName;
    }

    public void setStrLastName(String strLastName) {
        this.strLastName = strLastName;
    }



    public String getStrName() {
        return strName;
    }

    public void setStrName(String strName) {
        this.strName = strName;
    }



}
