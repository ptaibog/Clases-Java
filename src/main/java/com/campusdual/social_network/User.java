package com.campusdual.social_network;

import java.util.*;

//Usuario. Contendrá nombre, una lista de los usuarios a los que sigue, lista de posts.
public class User {

    // atributos de la clase user:
    protected String name;
    protected int userNumber;

    // lista de usuarios a los que sigue, el tipo de dato es <User> ya que será un listado de
    // objetos de este tipo
    protected List<User> followerList = new ArrayList<>();

    // lista de post de cada user, el tipo de dato es <Post>
    protected List<Post> userPostList = new ArrayList<>();

    // constructor

    public User(String name) {
        this.name = name;
    }

    // getters y setters
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

// métodos


    public String toString() {
        return this.getName();
    }


// TODO crear método toString para poder ver los datos tipo User en consola

}
