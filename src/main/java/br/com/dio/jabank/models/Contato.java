package br.com.dio.jabank.models;

public class Contato {

    private String email;
    private String telefone;

    public Contato(){ }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


}
