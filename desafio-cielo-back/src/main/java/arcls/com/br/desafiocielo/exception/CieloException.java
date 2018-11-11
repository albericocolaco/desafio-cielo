package arcls.com.br.desafiocielo.exception;

import arcls.com.br.desafiocielo.dto.CieloExceptionDTO;
import arcls.com.br.desafiocielo.enums.CieloExceptionEnum;

public class CieloException extends Exception {

    /**
     * Serial.
     */
    private static final long serialVersionUID = 1L;

    private CieloExceptionDTO cieloException;

    /**
     * Cielo Exception.
     * @param message
     */
    public CieloException(final String message){
        super(message);
    }

    /**
     * Cielo Exception.
     * @param message
     * @param cause
     */
    public CieloException(final String message, final Throwable cause){
        super(message, cause);
    }

    /**
     * Cielo Exception.
     * @param cieloExceptionEnum
     */
    public CieloException(final CieloExceptionEnum cieloExceptionEnum){
        super(cieloExceptionEnum.getMessage());
        this.cieloException = new CieloExceptionDTO(cieloExceptionEnum.getCode(), cieloExceptionEnum.getMessage());
    }

    /**
     * Cielo Exception.
     * @param cieloExceptionEnum
     * @param cause
     */
    public CieloException(final CieloExceptionEnum cieloExceptionEnum, final Throwable cause){
        super(cieloExceptionEnum.getMessage(), cause);
        this.cieloException = new CieloExceptionDTO(cieloExceptionEnum.getCode(), cieloExceptionEnum.getMessage());
    }

    public CieloExceptionDTO getCieloException(){
        return this.cieloException;
    }
}
