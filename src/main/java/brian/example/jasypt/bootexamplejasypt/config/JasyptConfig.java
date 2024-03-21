package brian.example.jasypt.bootexamplejasypt.config;

import org.jasypt.encryption.StringEncryptor;
import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class JasyptConfig {

    @Value("${JASYPT_ENCRYPTION_PASSWORD}")
    private String encryptionPass;

    @Bean("jasyptStringEncryptor")
    public StringEncryptor stringEncryptor(){

        PooledPBEStringEncryptor encryptor = new PooledPBEStringEncryptor();
        SimpleStringPBEConfig config = new SimpleStringPBEConfig ();

        config.setAlgorithm("PBEWithMD5AndDES");
        config.setPoolSize(1);
        config.setProviderName("SunJCE");
        config.setSaltGeneratorClassName("org.jasypt.salt.RandomSaltGenerator");
        config.setStringOutputType("base64");
        config.setPassword(encryptionPass);

        encryptor.setConfig(config);
        return encryptor;
    }

}
