package com.darkcode.spring.app.Controllers;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.darkcode.spring.app.Models.User;
import com.darkcode.spring.app.Services.UserService;

@RestController
public class HolaController {

    @Autowired
    private UserService userService;

    @GetMapping("/saludo")
    public String saludar(@RequestParam(defaultValue = "Invitado") String nombre) {
        return "Hola " + nombre + " bienvenido a mi app de spring";
    }

    @GetMapping("/despedida/{nombre}")
    public String despedir(@PathVariable String nombre) {
        return "Adios " + nombre + ", vuelve pronto!";
    }

    @GetMapping("/detalles")
    public User detalles() {
        // Como tu constructor ahora pide 5 parámetros, hay que pasarlos todos:
        // nombre, apellido, id, email, fecha
        return new User("Javi", "Code", 1L, "javi@darkcode.com", LocalDateTime.now());
    }

    @GetMapping("/lista-usuarios")
    public List<User> listar() {
        // Asegúrate de que en UserService el método se llame listarTodos
        return userService.listarTodos();
    }

    @PostMapping("/crear")
    public String crearUsuario(@RequestBody User nuevoUsuario) {
        userService.guardar(nuevoUsuario);
        return "Usuario " + nuevoUsuario.getNombre() + " creado con éxito";
    }
}