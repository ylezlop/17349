package mx.uv.listi.c17349.Saludar;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin(origins = "*")

@RestController
public class SaludarControlador {
    Saludador persona;

    @RequestMapping("/")
    public String home(){
        return "{\"contenido\":\"xxx\"}";
    }

    //@GetMapping("/saludar")
    //public void saludar(){}

    @GetMapping(value = {"/saludar","/saludar/{nombre}"})
    public String saludar (@PathVariable(required = false) String nombre){
        if (nombre != null)
            return "hola " + nombre;
        return "hola default name";
    }

    @RequestMapping(value = "/saludar2", method = RequestMethod.GET)
    public Saludador mostrar(){
        Saludador s = new Saludador("xxx");
        return s;
    }

    //// mejora en los métodos y sus verbos
    @GetMapping("/saludarget")
    public Saludador saludarGet(){
        return this.persona;
    }

    @PostMapping("/saludarpost")
    public void saludarPost(@RequestBody Saludador s){
        System.out.println(s);
        this.persona = s;
    }

    @RequestMapping("/query")
    public void metodo (@RequestParam String nombre){
        System.out.println("El nombre es: " + nombre);
    }

    @GetMapping("/backend")
    public String backend(@RequestParam String nombre, @RequestParam String password){
        System.out.println(nombre + " -- " + password);
        return "exito";
    }
}