package brian.example.jasypt.bootexamplejasypt;

import brian.example.jasypt.bootexamplejasypt.service.DecryptPropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootExampleJasyptApplication implements CommandLineRunner{

    @Autowired
    private DecryptPropertyService service;

    public static void main(String[] args) {
        SpringApplication.run(BootExampleJasyptApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        service.printProperties();
    }
}
