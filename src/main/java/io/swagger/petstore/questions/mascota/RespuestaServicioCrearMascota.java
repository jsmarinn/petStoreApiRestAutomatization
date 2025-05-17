package io.swagger.petstore.questions.mascota;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static net.serenitybdd.rest.SerenityRest.lastResponse;

public class RespuestaServicioCrearMascota implements Question {
    private int codigo;
    public RespuestaServicioCrearMascota (int codigo){
        this.codigo = codigo;
    }
    public static RespuestaServicioCrearMascota es(int codigo){
        return new RespuestaServicioCrearMascota(codigo);
    }

    @Override
    public Object answeredBy(Actor actor) {
        int respuesta = lastResponse().statusCode();
        return respuesta == codigo;
    }
}
