# 🚀 Java Spring Boot API

Proyecto básico de una API REST desarrollada con **Spring Boot**.

---

## 🌱 ¿Qué es Spring Boot?

**Spring Boot** es una herramienta dentro del ecosistema **Spring** que nos facilita la configuración y puesta en marcha de aplicaciones Java.

Nos permite:

- Configuración automática
- Servidor embebido (Tomcat)
- Desarrollo rápido de APIs REST
- Menos configuración manual

---

## 🌐 Métodos HTTP

Estos son los métodos principales que usamos en una API REST:

### 🔹 GET
Solicita una representación de un recurso específico.  
Las peticiones `GET` solo deben **recuperar datos**.

### 🔹 POST
Envía una entidad a un recurso específico.  
Suele provocar un **cambio en el estado del servidor**.

### 🔹 PUT
Reemplaza completamente un recurso existente con los datos enviados en la petición.

### 🔹 DELETE
Elimina un recurso específico del servidor.

### 🔹 PATCH
Aplica modificaciones **parciales** a un recurso.

---

## 🛠 Spring Initializr
Spring Initializr es la herramienta que usamos para generar la estructura inicial del proyecto Spring Boot.
<img width="1626" height="976" alt="image" src="https://github.com/user-attachments/assets/8416bbe4-2787-4682-9e85-bda2766dc4e8" />



## 🎯 Creación de un Controller

Para crear una API REST utilizamos la anotación:

```java
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {

# @GetMapping
 // con que metodo y bajo que url queiero que se vea mi holaMundo
 // se usara la anotacion GetMapping
    @GetMapping("/saludo")
    public String holaMundo () {
        return "Hola Mundo!";
    }
```

* Si ejecutamos la aplicación y entramos en:

- http://localhost:8080/saludo

* Obtendremos:

** Hola Mundo!
