package brian.example.jasypt.bootexamplejasypt.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class DecryptPropertyService {

    @Value("${encrypted.prop}")
    private String encryptedProp;

    @Value("${none-encrypted.prop}")
    private String noneEncryptedProp;
    public void printProperties(){
        System.out.println("Encrypted Prop(decrypted by system):"+encryptedProp);
        System.out.println("None-Encrypted Prop:"+noneEncryptedProp);
    }
}
