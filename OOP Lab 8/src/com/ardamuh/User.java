package com.ardamuh;

public class User {
    private String user_id;
    private String password;
    private Boolean login_status = false;

    User(String user_id){
        this.user_id = user_id;
    }

    //setter method
    public void setUser_id(String user_id){
        this.user_id = user_id;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public void setLogin_status(boolean login_status){
        this.login_status = true;
    }

    //getter method
    public String getUser_id(){
        return user_id;
    }

    public String getPassword(){
        return password;
    }

    public String verify_login(){
        if(login_status){
            return "berhasil login";
        }
        return "gagal login";
    }
}
