package br.com.farmaciaideal.FarmaciaIdeal.services.exceptions;

public class ResourceNotFooundExceptions extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public ResourceNotFooundExceptions(Object id){
        super("Id não encontrado: " + id);
    }

}
