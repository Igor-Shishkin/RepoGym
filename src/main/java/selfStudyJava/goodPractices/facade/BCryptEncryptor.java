package selfStudyJava.goodPractices.facade;

public class BCryptEncryptor implements Encryptor{
    @Override
    public String encrypt(final String toEncrypt) {
        return "encrypting " + toEncrypt + "with BCrypt";
    }
}
