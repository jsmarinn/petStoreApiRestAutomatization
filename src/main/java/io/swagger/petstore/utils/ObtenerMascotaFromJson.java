package io.swagger.petstore.utils;

import io.swagger.petstore.tasks.mascota.CrearMascotaTask;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ObtenerMascotaFromJson {
    public static String obtenerMascota() {
        String data = "";
        try {
            data = new String(Files.readAllBytes(Paths.get("src/test/resources/dataDriven/mascota.json")));
            return data;
        } catch (IOException e) {
            e.printStackTrace();

        }
            return data;
    }
}

