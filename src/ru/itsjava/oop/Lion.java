package ru.itsjava.oop;

public class Lion extends Cat{
    //поля (final)
    private String name;

    //конструктор (по умолчанию)
    public Lion(){
    }


    public Lion(String paramName){
        this.name = paramName;
    }

//методы
    public void sayR(){
        System.out.println(name + " RRRRR");
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
      this.name = name;
    }

}