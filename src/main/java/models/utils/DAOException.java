package models.utils;

public class DAOException extends RuntimeException {

    private static final long serialVersionUID = 1988944982921938669L;

    public DAOException(String msg, Throwable e) {
        super(msg, e);
    }
}
