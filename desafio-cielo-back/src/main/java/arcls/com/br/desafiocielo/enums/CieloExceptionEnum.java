package arcls.com.br.desafiocielo.enums;

import javax.servlet.http.HttpServletResponse;

public enum CieloExceptionEnum {

    ERROR_EXTERNAL_SERVICE(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Erro ao executar o serviço externo");

    private int code;
    private String message;

    CieloExceptionEnum(final int code, final String message){
        this.code = code;
        this.message = message;
    }

    public int getCode(){
        return this.code;
    }

    public String getMessage(){
        return this.message;
    }
}
