package io.swagger.petstore.interactions.mascota;

import net.serenitybdd.screenplay.Tasks;

public class ServicioMascota {
    private ServicioMascota(){}

    public static WithPost withPost(String body){
        return Tasks.instrumented(WithPost.class,body);
    }
}
