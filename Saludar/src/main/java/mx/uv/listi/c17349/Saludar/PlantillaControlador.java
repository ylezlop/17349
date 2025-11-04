package mx.uv.listi.c17349.Saludar;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class PlantillaControlador {

    @RequestMapping("/plantilla/{parametro}")
    public String plantilla(Model modelo, @PathVariable String parametro){
        // modelo.addAttribute("usuario", parametro);
        return "archivo";
    }
}