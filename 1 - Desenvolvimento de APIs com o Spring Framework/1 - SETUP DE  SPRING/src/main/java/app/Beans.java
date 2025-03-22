package app;

import com.google.gson.Gson;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*Para não poluir a classe principal main (classe executavel) é indicado criar uma essa classe especifica para varios
  beans. */
@Configuration /* Serve para garantir o funcionamento da class beans como um container de bean. Evitar a ocorrencia
                  de erros de injeção de dependencias.*/
public class Beans {
    @Bean
    public Gson gson(){
        return new Gson();
    }
}