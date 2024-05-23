package sda.selfStudyJava.goodPractices.facade;

public class SCryptEncryptor implements Encryptor{
    @Override
    public String encrypt(final String toEncrypt) {
        return "encrypting " + toEncrypt + "with SCrypt";
    }
}
