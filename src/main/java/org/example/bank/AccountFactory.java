package org.example.bank;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class AccountFactory {
    private static Map<String,Class> bank_Hashmap = new HashMap<String,Class>();
    private static AccountFactory INSTANCE;

    static {
        if(INSTANCE == null){
            INSTANCE = new AccountFactory();
        }
    }

    private AccountFactory() {}

    public static AccountFactory getInstance(){
        return INSTANCE;
    }

    public static void createBank(String id,Class bank){
        bank_Hashmap.put(id,bank);
    }

    public static BankAccount createAccount(String id,String pin) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class bankClass = bank_Hashmap.get(id);
        Constructor constructor = bankClass.getConstructor(new Class[]{String.class});
        return (BankAccount)constructor.newInstance(pin);
    }
}
