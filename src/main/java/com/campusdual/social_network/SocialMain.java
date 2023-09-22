package com.campusdual.social_network;

import jdk.jshell.execution.Util;

import javax.swing.plaf.PanelUI;
import java.util.*;
import java.util.Date;

// clase con el método main donde se ejecutarán todos los métodos
public class SocialMain {

    private List<User> socialUsers = new ArrayList<>();
    //private List<Post> socialPosts = new ArrayList<>();
    private List<Comments> allMyComments = new ArrayList<>();

    private User activeUser;


    public void mainMenu() {
        int option = 0;
        do {
            System.out.println("**********************************");
            System.out.println("Bienvenido a tu red social");
            System.out.println("***********************************");
            System.out.println("Elige una opción: ");

            System.out.println("1. Registrarse");
            System.out.println("2. Loguearse");
            System.out.println("0. Salir");
            option = Utils.integer("Seleccione la opción: ");
            switch (option) {
                case 1:
                    this.register();
                    break;
                case 2:
                    this.login();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Introduce un número entre 0 y 2");
            }
        } while (option != 0);
        System.out.println("Se ha cerrado la aplicación, que tengas un buen día");
    }

    private void register() {
        String name = Utils.string("Crea tu nombre de usuario: ");
        User user = new User(name);
        this.getSocialUsers().add(user);
        //Utils.showFromList(this.getSocialUsers(), false);
        System.out.println("Te has registrado correctamente con el nombre: " + name);
        this.login();
    }

    // 1er error a coregir
    private void login() {
        String name = Utils.string("Introduce tu nombre de usuario: ");
        // bucle para recorrer la lista socialUser, en la variable u se guarda cada elemento
        // de la lista, en el condicional obtenemos el nombre de cada elemento de la lista (u.getName())
        // y lo comparamos con name, si el nombre esta en la lista lo guardamos en la variable activeUser
        // para saber que usuario esta conectado en este momento

        for (int i = 0; i < this.getSocialUsers().size(); i++) {
            User u = this.getSocialUsers().get(i);
            if (u.getName().equals(name)) {
                this.setActiveUser(u);
                break;
            }
        }
        if (this.getActiveUser() != null) {
            System.out.println("Has iniciado sesión correctamente con el usuario: " + this.getActiveUser());
            this.optionsMenu();
        } else {
            System.out.println("El usuario no existe en la aplicacion");
        }
    }


    public void optionsMenu() {
        int option;
        do {
            System.out.println("*****************");
            System.out.println("Elige una opción: ");
            System.out.println("*****************");
            System.out.println("1. Post");
            System.out.println("2. Amigos");
            System.out.println("0. Cerrar sesión");
            option = Utils.integer("Seleccione la opción: ");
            switch (option) {
                case 1:
                    System.out.println("Menú Post");
                    postMenu();
                    //Utils.showFromList(this.getSocialUsers(), false);
                    // acceso al menú de amigos: ver, eliminar, añadir, volver atrás
                    break;
                case 2:
                    friendsMenu();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("No es una opcion valida");
            }
        } while (option != 0);
        System.out.println("Te has desconectado");
        this.setActiveUser(null);
    }

    public void postMenu() {
        int option;
        do {
            System.out.println("********************");
            System.out.println("Elige una opción: ");
            System.out.println("********************");
            System.out.println("1. Añadir un post de texto");
            System.out.println("2. Añadir un post de imagen");
            System.out.println("3. Añadir un post de video");
            System.out.println("4. Ver mis posts");
            System.out.println("5. Eliminar un post");
            //System.out.println("6. Comentar un post");
            System.out.println("0. Volver al menú de opciones");
            option = Utils.integer("Seleccione la opción: ");
            switch (option) {
                case 1:
                    this.crearPostTexto();
                    break;
                case 2:
                    this.crearPostImagen();
                    break;
                case 3:
                    this.crearPostVideo();
                    break;
                case 4:
                    this.verMisPosts();
                    break;
                case 5:
                    this.deleteMyPost();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("No es una opción válida");
            }
        } while (option != 0);
    }
    public void friendsMenu() {
        int option;
        do {
            System.out.println("********************");
            System.out.println("Elige una opción: ");
            System.out.println("********************");
            System.out.println("1. Añadir un amigo");
            System.out.println("2. Ver amigos");
            System.out.println("3. Eliminar un amigo");
            System.out.println("4. Ver posts de mis amigos");
            System.out.println("5. Eliminar un comentario");
            System.out.println("0. Volver al menú de opciones");
            option = Utils.integer("Seleccione la opción: ");
            switch (option) {
                case 1:
                   this.addFriend();
                    break;
                case 2:
                   this.showFriends();
                    break;
                case 3:
                    this.deleteFriend();
                    break;
                case 4:
                    showFriendsPost();
                    break;
                case 5:
                    System.out.println("Aqui esta el borrador para eliminar un comentario");
                    //deleteComment();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("No es una opción válida");
            }
        } while (option != 0);
    }

    // puedes añadir el mismo usuario dos veces
    // showAndSelectFromList
    // lista de post de toda la aplicacion

        public void addFriend (){
            //Utils.showFromList(this.getSocialUsers(), false);
            List<User> friendsAndMyself = new ArrayList<>(this.getActiveUser().getFollowerList());
            friendsAndMyself.add(this.getActiveUser());
            List<User> addFriendsList = Utils.showAndSelectFromList(this.getSocialUsers(), true, false, friendsAndMyself);
            //int userNumber = Utils.integer(" Introduce el número del usuario que quieras añadir como amigo: ");
            if (!addFriendsList.isEmpty()){
                this.getActiveUser().getFollowerList().addAll(addFriendsList);
                System.out.println("Has añadido a " + addFriendsList.get(0).getName() + " como amigo");
            }
        }

    public void showFriends() {

        if(getActiveUser().getFollowerList().size() == 0){
            System.out.println("No tienes amigos pringao");

        }else {
            Utils.showFromList(this.getActiveUser().getFollowerList(), false);
        }

    }

    public void deleteFriend(){
        this.showFriends();
        int friendNumber = Utils.integer("Indica el amigo que quieres eliminar: ");
        String message = Utils.string("¿Estás segura de que quieres borrar a " + getActiveUser().getFollowerList().get(friendNumber - 1) + " de tus amigos? (Si/No)");
        if (message.equals("Si")){
            System.out.println("El usuario " + getActiveUser().getFollowerList().get(friendNumber - 1) + " ha sido eliminado de tus amigos");
            this.getActiveUser().getFollowerList().remove(friendNumber - 1);
        }else if (message.equals("No")) {
            System.out.println("Accion cancelada, volvemos al menú de amigos");
            this.friendsMenu(); // por que siempre estamos poniendo this.menu()
        }else {
            System.out.println("Not found, espabila por favor, ahora introduce una de las siguientes opciones: Si o No");
        }
    }

    public void showFriendsPost () {
        this.showFriends();

        int friendNumber = Utils.integer("Selecciona una opcion para ver sus posts: ");
        User selectedFriend = this.getActiveUser().getFollowerList().get(friendNumber - 1);
        List<Post> friendPosts = new ArrayList<>(selectedFriend.getUserPostList());
        Utils.showFromList(friendPosts, false);

        if (!friendPosts.isEmpty()){
            String message = Utils.string("¿Quieres comentar algun post? (Si/No): ");
            addComment(selectedFriend, message);
        } else {
            System.out.println(selectedFriend.getName() + " todavia no ha posteado nada.");
        }
    }

    private void addComment(User selectedFriend, String message) {
        if(message.equals("Si")){
            int selectPost = Utils.integer("¿Que post quieres comentar?: ");
            Post selectedPost = selectedFriend.getUserPostList().get(selectPost - 1);
            String comment = Utils.string("Escribe tu comentario: ");
            Comments myComment = new Comments(comment, new Date(), getActiveUser());
            selectedPost.getCommentPostList().add(myComment);
            //this.getActiveUser().getAllMyComments().add(myComment);
            Utils.showFromList(selectedPost.getCommentPostList(), false);
        } else if (message.equals("No")) {

        } else {
            System.out.println("Opcion no valida");
        }
    }

    /*public void deleteComment(){
        Utils.showFromList(this.getAllMyComments(), false);
        // cuidado, que esta bien que aparezcan todos los comentarios pero
        // que solo me deje borrar los MIOS,
        // SI no es mio, mensaje de error

    }

     */


    public void crearPostTexto() {

        String postTextTitle = Utils.string("Introduce el titulo de tu post: ");
        String postTextContent = Utils.string("Escribe tu post: ");
        TextPost post = new TextPost(new Date(), postTextTitle, postTextContent);
        this.getActiveUser().getUserPostList().add(post);
        System.out.println("Tu post " + postTextTitle + " se ha creado correctamente");
    }

    public void crearPostImagen() {

        String postImageTitle = Utils.string("Introduce el titulo de tu post: ");
        String imageDimensionPost = Utils.string("Escribe las dimensiones de tu imagen (Ej: 150 x 50): ");
        ImagePost post = new ImagePost(new Date(), postImageTitle, imageDimensionPost);
        this.getActiveUser().getUserPostList().add(post);
        System.out.println("Tu post " + postImageTitle + " se ha creado correctamente");
    }

    public void crearPostVideo() {

        String postVideoTitle = Utils.string("Introduce el titulo de tu post: ");
        int videoQualityPost = Utils.integer("Escribe la calidad de tu video (Ej: 1080): ");
        int videoDurationPost = Utils.integer("Escribe la duracion del video en minutos: ");
        VideoPost post = new VideoPost(new Date(), postVideoTitle, videoQualityPost, videoDurationPost);
        this.getActiveUser().getUserPostList().add(post);
        System.out.println("Tu post " + postVideoTitle + " se ha creado correctamente");
    }

    public void verMisPosts() {

        if(getActiveUser().getUserPostList().size() == 0){
            System.out.println("No tienes posts pringao");

        }else {
            Utils.showFromList(this.getActiveUser().getUserPostList(), false);
        }
    }

    public void deleteMyPost(){

        this.verMisPosts();
        int postNumber = Utils.integer("Indica el numero del post que quieres borrar: ");
        String message = Utils.string("¿Estás segura de que quieres borrar el post " + postNumber + "? (Si/No)");
        if (message.equals("Si")){
            this.getActiveUser().getUserPostList().remove(postNumber - 1);
            System.out.println("Post " + postNumber + " ha sido eliminado");
        }else if (message.equals("No")) {
            System.out.println("Accion cancelada, volvemos al menú de posts");
            this.postMenu(); // por que siempre estamos poniendo this.menu()
        }else {
            System.out.println("Not found, espabila por favor, ahora introduce una de las siguientes opciones: Si o No");
        }
    }


    private void populateSocialNetwork() {
        User u1 = new User("Marcos");
        User u2 = new User("Paula");
        User u3 = new User("Manuela");
        this.getSocialUsers().add(u1);
        this.getSocialUsers().add(u2);
        this.getSocialUsers().add(u3);
        Post p1 = new ImagePost(new Date(), "Mi fotito", "1080x1080");
        u1.getUserPostList().add(p1);
        u1.getFollowerList().add(u2);
        u2.getFollowerList().add(u1);
        u2.getFollowerList().add(u3);
        u3.getFollowerList().add(u2);
        u3.getFollowerList().add(u1);

    }

    public List<User> getSocialUsers() {

        return socialUsers;
    }

    /*public List<Post> getSocialPosts() {

        return socialPosts;
    }

     */

    //public List<TextPost> getSocialTextPosts() {
    //return socialTextPosts;
    //}


    public User getActiveUser() {
        return activeUser;
    }

    public void setActiveUser(User activeUser) {
        this.activeUser = activeUser;
    }

    public List<Comments> getAllMyComments() {
        return allMyComments;
    }

    public void setAllMyComments(List<Comments> allMyComments) {
        this.allMyComments = allMyComments;
    }

    public static void main(String[] args) {
        SocialMain sm = new SocialMain();
        sm.populateSocialNetwork();
        sm.mainMenu();

    }

}
