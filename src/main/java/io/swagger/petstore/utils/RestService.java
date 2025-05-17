package io.swagger.petstore.utils;

public enum RestService {
    BASE_URL("https://petstore.swagger.io/v2"),
    CREAR_MASCOTA("/pet");

    private String uri;

    RestService(String uri){
        this.uri = uri;
    }

    @Override
    public String toString(){
        return uri;
    }
}
