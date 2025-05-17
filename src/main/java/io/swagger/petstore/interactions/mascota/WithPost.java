package io.swagger.petstore.interactions.mascota;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.rest.interactions.Post;

import static io.swagger.petstore.utils.RestService.CREAR_MASCOTA;

public class WithPost implements Interaction {
    private String body;
    public WithPost(String body){
        this.body = body;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Post.to(CREAR_MASCOTA.toString())
                .with(requestSpecification -> requestSpecification
                        .headers("Content-Type","application/json")
                        .body(body))
        );
    }
}
