package pl.sda.requests;

/**
 * Created by RENT on 2017-03-06.
 */
public class CreateUserRequest {
    private String login;
    private String name;
    private String mail;

    public void setLogin(String login) {
        this.login = login;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getLogin() {

        return login;
    }

    public String getName() {
        return name;
    }

    public String getMail() {
        return mail;
    }
}
