package com.argentinaprograma.cdegirolamo.portfolio.exception;

public class NotFoundExeption extends RuntimeException{

    public NotFoundExeption(int id) {
        super(String.format("Not found with id %s", id));
    }
}
