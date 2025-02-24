package app;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //Utilizo Component quando tenho acesso ao código fonte. Serão componente escaneados pela aplicação.
public class ConversorJson {
    @Autowired /* é usada para injetar dependências automaticamente. O Spring encontra o Bean adequado e o injeta no
                  local correto.*/
    private Gson gson;
    /*Converte o documento JSON em um Objeto.*/
    public ViaCepResponse converter(String json ){
        ViaCepResponse response = gson.fromJson(json, ViaCepResponse.class);
        return response;
    }
}
