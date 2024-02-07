package org.example.bank;

public class TechcomBankAccount implements  BankAccount{
    private String pin;

    public TechcomBankAccount(String pin) {
        this.pin = pin;
    }

    @Override
    public void setPin(String pin) {
        this.pin = pin;
    }
    static {
        AccountFactory.createBank("Techcombank", TechcomBankAccount.class);
    }
    @Override
    public String getPin() {
        return this.pin;
    }
}
