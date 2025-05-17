package io.swagger.petstore.stepdefinitions.mascota;

import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.swagger.petstore.questions.mascota.RespuestaServicioCrearMascota;
import io.swagger.petstore.tasks.mascota.CrearMascotaTask;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static io.swagger.petstore.utils.Constant.VALOR_CREACION_EXITOSA;
import static io.swagger.petstore.utils.ObtenerMascotaFromJson.obtenerMascota;
import static io.swagger.petstore.utils.RestService.BASE_URL;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RestCrearMascotaStepDefinition {
    @Before
    public void prepararStage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Actor");
        theActorCalled("Actor").whoCan(CallAnApi.at(BASE_URL.toString()));
    }
     @Cuando("Se crea la mascota")
    public void seCreaLaMascota(){
        theActorInTheSpotlight().attemptsTo(CrearMascotaTask.with(obtenerMascota().trim()));
    }

    @Entonces("Deberia ver la mascota creada")
    public void deberiaVerLaMascotaCreada() {
        theActorInTheSpotlight().should(seeThat(RespuestaServicioCrearMascota.es(VALOR_CREACION_EXITOSA)));
    }
}