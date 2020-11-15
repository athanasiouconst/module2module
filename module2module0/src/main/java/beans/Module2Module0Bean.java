package beans;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class Module2Module0Bean implements Serializable {

    private String username;

    @PostConstruct
    public void init() {
        username = "costas Module2Module0Bean";

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
