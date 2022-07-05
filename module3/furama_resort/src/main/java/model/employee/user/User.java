package model.employee.user;

public class User {
    private String userName;
    private String passWord;
    private int status;

    public User() {
    }

    public User(String userName, String passWord, int status) {
        this.userName = userName;
        this.passWord = passWord;
        this.status = status;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
