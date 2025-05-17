package io.swagger.petstore.tasks.mascota;

import io.swagger.petstore.interactions.mascota.ServicioMascota;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class CrearMascotaTask implements Task {
    private String mascota;

    public CrearMascotaTask(String mascota){
        this.mascota = mascota;

    }

    public static CrearMascotaTask with(String mascota){
        return Tasks.instrumented(CrearMascotaTask.class, mascota);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ServicioMascota.withPost(mascota));
    }
}
