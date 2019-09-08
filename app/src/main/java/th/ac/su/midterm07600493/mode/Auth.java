package th.ac.su.midterm07600493.mode;

public class Auth {
    private String mEmail;
    private String mPassword;
    private static final String EMAIL = "aaa";
    private static final String PASSWORD = "111";
    private static final String EMAIL2 = "bbb";
    private static final String PASSWORD2 = "222";

    public String getmEmail() {
        return mEmail;
    }

    public void setmEmail(String Email) {
        this.mEmail = Email;
    }

    public String getmPassword() {
        return mPassword;
    }

    public void setmPassword(String Password) {
        this.mPassword = Password;
    }
    public int check(){

        if(mEmail.equals(EMAIL)&&mPassword.equals(PASSWORD)){
            return 1;
        }
        else {
            if(mEmail.equals(EMAIL2)&&mPassword.equals(PASSWORD2)){
                return 2;
            }
        }
        return 0;
    }
    public String checkname(String name){

        if(name.equals(EMAIL)){
            return "Promlert Lovichit";
        }
        else {
            if(name.equals(EMAIL2)){
                return "Passakorn Baokaew";
            }
        }
        return "";
    }

}
