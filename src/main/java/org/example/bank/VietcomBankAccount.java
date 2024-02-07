package org.example.bank;

public class VietcomBankAccount implements BankAccount{

    private String pin;

    public VietcomBankAccount(String pin) {
        this.pin = pin;
    }

    @Override
    public void setPin(String pin) {
        this.pin = pin;
    }

    static {
        AccountFactory.createBank("ID02", VietcomBankAccount.class);
    }
    @Override
    public String getPin() {
        return pin;
    }
}
