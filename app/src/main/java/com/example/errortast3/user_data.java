package com.example.errortast3;

public class user_data {
    private int user_image ;
    private String username ;
    private int user_photo ;

    public user_data(int user_image, String username, int user_photo) {
        this.user_image = user_image;
        this.username = username;
        this.user_photo = user_photo;
    }

    public int getUser_image() {
        return user_image;
    }

    public void setUser_image(int user_image) {
        this.user_image = user_image;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getUser_photo() {
        return user_photo;
    }

    public void setUser_photo(int user_photo) {
        this.user_photo = user_photo;
    }
}
