package sda.messages;

/**
 * Created by RENT on 2017-03-06.
 */
public class GetUserResponse {
    private String name;
    private String login;
    private String mail;
    private String id;

    public void setName(String name) {
        this.name = name;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {

        return name;
    }

    public String getLogin() {
        return login;
    }

    public String getMail() {
        return mail;
    }

    public String getId() {
        return id;
    }
}
