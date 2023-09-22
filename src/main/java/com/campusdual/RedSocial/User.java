package com.campusdual.RedSocial;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String name;

    private List <User> followerList = new ArrayList<>(); // lista de usuarios a los que sigue
    private List <Post> userPostList = new ArrayList<>(); // lista de posts de MI USUARIO

    // GETTERS Y SETTERS

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getFollowerList() {
        return followerList;
    }

    public void setFollowerList(List<User> followerList) {
        this.followerList = followerList;
    }

    public List<Post> getUserPostList() {
        return userPostList;
    }

    public void setUserPostList(List<Post> userPostList) {
        this.userPostList = userPostList;
    }

public User (String name){
        this.name = name;

}
    public void addUser(){}

}





