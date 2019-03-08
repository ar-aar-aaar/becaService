package mx.com.axity.commons.to;

import java.io.Serializable;

public class UserTO implements Serializable {

    private int id;
    private String name;
    private String lastName;
    private int age;
    private String username;
    private String password;
    private LoginTO loginTO;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LoginTO getLoginTO() {
        return loginTO;
    }

    public void setLoginTO(LoginTO loginTO) {
        this.loginTO = loginTO;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
