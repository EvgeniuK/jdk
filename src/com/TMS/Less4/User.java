package com.TMS.Less4;

public class User {
    private String name;
    private String Lastname;
    private int age;
    private Sex sex;

public void nameLastname (){
    System.out.println( "name: " + name );
    System.out.println( "Lastname: " + Lastname );

}
@Deprecated
public void age1(){
    age++;
}
    public void Dan (){
        System.out.println( "name: " + name );
        System.out.println( "Lastname: " + Lastname );
        System.out.println( "Sex: " + sex );
        System.out.println( "Age: " + age);



}

    public void Dan (String S) {
        System.out.println(S);

    }

    public User(String name, String lastname, int age) {
        this.name = name;
        Lastname = lastname;
        this.age = age;
    }

    public User(String name, String lastname, int age, Sex sex) {
    this(name, lastname, age);
        this.sex = sex;
    }

    public void getadres(String sity, String town){

    class Adres {
    public String sity;
        public String town;

        public Adres(String sity, String town) {
            this.sity = sity;
            this.town = town;
        }

        public void Print (){
            System.out.println(town + sity);
        }
    }
    Adres adres = new Adres(sity, town);
    adres.Print();
    }
}


