package sda.messages;

/**
 * Created by RENT on 2017-03-06.
 */
public class CreateUserResponse {

    private String status;
    private String id;

    public void setStatus(String status) {
        this.status = status;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {

        return status;
    }

    public String getId() {
        return id;
    }
}
