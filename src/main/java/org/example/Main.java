package org.example;

import org.example.bank.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        BankAccount vcb = new TechcomBankAccount("22223333");
        BankAccount vcb1 = AccountFactory.createAccount("Techcombank","22222444444");
        System.out.println(vcb1.getPin());
    }
}