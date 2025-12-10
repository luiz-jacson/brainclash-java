package brainclash.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {


    @GetMapping(value = "/getAll")
    public String getCategorias(){
        String result = "sucesso!";
        return result;
    }


}
