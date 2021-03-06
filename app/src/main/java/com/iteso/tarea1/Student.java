package com.iteso.tarea1;

public class Student {

    private String Name;
    private String Phone;
    private String FavoriteBook;
    private String SchoolLevel;
    private String Gender;
    private boolean Sports;

    public Student(){

    }

    public String Name(){
        return Name;
    }

    public String Phone(){
        return Phone;
    }

    public String FavoriteBook(){
        return FavoriteBook;
    }

    public String SchoolLevel(){
        return SchoolLevel;
    }

    public String Gender(){
        return Gender;
    }

    public boolean Sports(){
        return  Sports;
    }

    public void Name(String name){
        this.Name=name;
    }

    public void Phone(String phone){
        this.Phone=phone;
    }

    public void FavoriteBook(String favBook){
        this.FavoriteBook=favBook;
    }

    public void SchoolLevek(String schoolLev){
        this.SchoolLevel=schoolLev;
    }

    public void Gender(String gender){
        this.Gender=gender;
    }

    public void Sports(boolean sports){
        this.Sports=sports;
    }
    public String ToString(){
        String deporte = this.Sports ? "Sí":"No";
        return  "Nombre: "+this.Name+System.lineSeparator()+
                "Teléfono: "+this.Phone+System.lineSeparator()+
                "Escolaridad: "+this.SchoolLevel+System.lineSeparator()+
                "Género; "+this.Gender+System.lineSeparator()+
                "Libro Favorito: "+this.FavoriteBook+System.lineSeparator()+
                "Practica deporte: "+deporte ;
    }
}
