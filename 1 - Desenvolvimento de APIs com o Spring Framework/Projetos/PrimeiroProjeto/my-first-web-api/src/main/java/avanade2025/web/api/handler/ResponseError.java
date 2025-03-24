package avanade2025.web.api.handler;

import java.util.Date;

public class ResponseError {
    private Date timestamp = new Date();    // momento exato da geração da exceção.
    private String status = "error";        // campo customizado de acordo com seu dominio de negocio
    private int statusCode = 400;           // pode ser um dicionario de erro da sua aplicação
    private String error;                   // mensagem apresentada ao usuario da aplicação

    public Date getTimestamp() {return timestamp;}
    public void setTimestamp(Date timestamp) {this.timestamp = timestamp;}

    public String getStatus() {return status;}
    public void setStatus(String status) {this.status = status;}

    public int getStatusCode() {return statusCode;}
    public void setStatusCode(int statusCode) {this.statusCode = statusCode;}

    public String getError() {return error;}
    public void setError(String error) {this.error = error;}
}
