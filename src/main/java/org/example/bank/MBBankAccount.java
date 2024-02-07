package org.example.bank;

public class MBBankAccount implements BankAccount{

    private String pin;

    public MBBankAccount(String pin) {
        this.pin = pin;
    }

    static {
        AccountFactory.createBank("MBBank", MBBankAccount.class);
    }
    @Override
    public void setPin(String pin) {
        this.pin = pin;
    }

    @Override
    public String getPin() {
        return pin;
    }


}
