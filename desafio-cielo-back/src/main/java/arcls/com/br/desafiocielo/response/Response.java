package arcls.com.br.desafiocielo.response;

import java.io.Serializable;

public class Response<T> implements Serializable {

    /**
     * Serial.
     */
    private static final long serialVersionUID = 1L;

    private T data;
    private String message;

    public Response() {
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
