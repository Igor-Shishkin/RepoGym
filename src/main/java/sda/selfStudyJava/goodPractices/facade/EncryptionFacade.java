package sda.selfStudyJava.goodPractices.facade;

public class EncryptionFacade implements Encryptors{
    private final SCryptEncryptor sCryptEncryptor;
    private final BCryptEncryptor bCryptEncryptor;
    private final NoOpEncryptor noOpEncryptor;

    public EncryptionFacade(final SCryptEncryptor sCryptEncryptor, final BCryptEncryptor bCryptEncryptor, final NoOpEncryptor noOpEncryptor) {
        this.sCryptEncryptor = sCryptEncryptor;
        this.bCryptEncryptor = bCryptEncryptor;
        this.noOpEncryptor = noOpEncryptor;
    }

    @Override
    public String encryptWithoutModification(final String toEncrypt) {
        return noOpEncryptor.encrypt(toEncrypt);
    }

    @Override
    public String encryptWithBCrypt(final String toEncrypt) {
        return bCryptEncryptor.encrypt(toEncrypt);
    }

    @Override
    public String encryptWithSCrypt(final String toEncrypt) {
        return sCryptEncryptor.encrypt(toEncrypt);
    }
}
