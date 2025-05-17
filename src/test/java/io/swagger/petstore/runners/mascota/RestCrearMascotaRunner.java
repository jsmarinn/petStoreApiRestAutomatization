package io.swagger.petstore.runners.mascota;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/mascota/crear_mascota.feature"},
        glue = {"io.swagger.petstore.stepdefinitions.mascota"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class RestCrearMascotaRunner {
}
