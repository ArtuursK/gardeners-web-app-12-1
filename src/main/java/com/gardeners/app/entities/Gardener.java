package com.gardeners.app.entities;


public class Gardener {
    int gardener_id;
    String email;
    String username;


    public int getGardener_id() {
        return gardener_id;
    }

    public void setGardener_id(int gardener_id) {
        this.gardener_id = gardener_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Gardener{" +
                "gardener_id=" + gardener_id +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
