# petStoreApiRestAutomatization

Este proyecto se crea con la finalidad de practicar la automatización de servicios REST con el patrón ***Screenplay***, la descripción de los escenarios se realizón con lengiaje ***Gherkin*** y como lenguaje de programación se usó ***Java***.

Se utilizó la *api* https://petstore.swagger.io/ para realizar las pruebas.

## Contenido.
- [Descarga](#descarga)
- [Ejecución](#ejecución)
- [Ejecución por terminal](#2-ejecutar-mediante-la-terminal)
- [Escenarios](#escenarios)

## Prerrequisitos.
- IDE (Para este proyecto se utiliza IntelliJ IDEA Community Edition).
- JDK 1.8 o superior.
- Gradle 4.9 o superior (Gestor de dependencias).
- GIT (Control de versiones).

## Descarga.
Para la descarga del repositorio, basta con ir al destino donde se quiere alojar el proyecto, abrir la terminal de git e incluir el comando
```
git clone https://github.com/jsmarinn/petStoreApiRestAutomatization.git
```
Dado a que es posible que la conexión con gitHub sea mediante llaves, se debe utilizar el siguiente comando:
```
git clone git@github.com:jsmarinn/petStoreApiRestAutomatization.git
```

**Nota:** Dado a que es un proyecto colaborativo, es importante cada día actualizar el proyecto local con respecto al repositorio
```
git fetch
``` 
y luego,
```
git pull origin master
```
o con la rama que se requiera actualizar.

## Ejecución.
Para la ejecución de los escenarios se puede realizar de dos formas:

### 1. Configurar un modo de ejecución.

### 2. Ejecutar mediante la terminal.
- **Ejecutar todos los escenarios de prueba:**
```
gradle clean test --tests *runners* -D properties=serenity.properties -D file.encoding=UTF-8 aggregate
```

- **Ejecutar ruta crítica:**
```
gradle clean test -D properties=serenity.properties -D file.encoding=UTF-8 -D cucumber.options="-t @RutaCritica" aggregate
```

- **Ejecutar un escenario específico:**
```
gradle clean test --tests *runners.mascota* -D properties=serenity.properties -D cucumber.options="-t @CrearMascota" -D file.enconding=UTF-8 aggregate
```

## Escenarios.

### Mascota.
#### Crear mascota.
Para la creación de la mascota, se toman los datos de la misma del archivo ***mascota.json*** ubicado en la carpeta ***dataDriven***