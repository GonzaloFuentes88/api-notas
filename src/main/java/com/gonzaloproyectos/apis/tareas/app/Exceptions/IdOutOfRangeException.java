package com.gonzaloproyectos.apis.tareas.app.Exceptions;

public class IdOutOfRangeException extends IllegalArgumentException{

    public IdOutOfRangeException() {
        super("ID out of range - exception");
    }

    public IdOutOfRangeException(String mensaje) {
        super(mensaje);
    }
}
