package avanade2025.web.api.handler;

public class CampoObrigatorioException extends BusinessException {
    public CampoObrigatorioException(String campo) {
        super("O Campo " + campo + " eh obrigatorio.");
    }
}