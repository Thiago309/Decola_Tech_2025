package Decola_Tech_2025;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

// Sem é importante revisar as anotações.
@Component
public class MyApp implements CommandLineRunner {
    // O Autowired serve para injetar uma depedencia de um objeto para outro.
    @Autowired
    private Calculadora calculadora;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("O resultado é " + calculadora.somar(2,7));
    }
}
