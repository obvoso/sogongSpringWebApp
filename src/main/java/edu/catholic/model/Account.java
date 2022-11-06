package edu.catholic.model;


public class Account {
    private String id1;
    private String password1;

    public String getId() {
        return id1;
    }
    public String getPassword() {
        return password1;
    }
    public void setId(String id) {
        this.id1 = id;
    }
    public void setPassword(String password) {
        this.password1 = password;
    }
    public String toString(){
        return "ID: " + getId() +"\n" + "PASSWORD: " +getPassword();
    }
}
