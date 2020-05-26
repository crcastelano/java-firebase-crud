package model;

public class UsuarioModel {
    private String id;
    public String nome;
    public String email;

    public UsuarioModel() {
        //Default constructor
    }

    public UsuarioModel(String nome, String email) {
        this.nome = nome;
        this.email = email;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }   
}
