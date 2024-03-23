package oop.day7.inheritance;

import javax.security.auth.login.AccountNotFoundException;

public class Dog extends Animal {
    @Override
    public String eat(){
        return "It eats Meat only";
    }
}
