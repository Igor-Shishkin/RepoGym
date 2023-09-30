package selfStudyJava.goodPractices.facade;

public class NoOpEncryptor implements Encryptor{
    @Override
    public String encrypt(final String toEncrypt) {
        return toEncrypt;
    }
}
