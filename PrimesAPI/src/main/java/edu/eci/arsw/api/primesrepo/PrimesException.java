package edu.eci.arsw.api.primesrepo;

public class PrimesException extends Exception{

    private static final long serialVersionUID = 1L;

    public PrimesException(String message) {
        super(message);
    }

    public PrimesException(String message, Throwable cause) {
        super(message, cause);
    }

}