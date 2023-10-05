package edu.otavio.anatomiadasclasses;
public class MyClass {
    public static void main(String[] args) {
        System.out.println("Ola mundo");
        String myName = "otavio";
        String mySurname = "Da Silva pacheco";
        String birthDayDate = "2005";
        int age = 18;
        boolean isAlive = true;
        String nomeCompleto = nomeCompleto(myName,mySurname);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String myName, String mySurname){ 
        return myName.concat(" ").concat(mySurname);
        

    }
}