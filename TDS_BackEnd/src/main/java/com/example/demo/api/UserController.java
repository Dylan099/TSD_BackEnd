package com.example.demo.api;

import com.example.demo.bl.RegisterBl;
import com.example.demo.dto.PacienteDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private RegisterBl registerBl;

    @Autowired
    public UserController(RegisterBl registerBl) {
        this.registerBl = registerBl;
    }

    @GetMapping("/RegisterPaciente")
    public String log(){
        //TODO: Recuper formulario de registro
        registerBl.setPaciente(new PacienteDto("Cris","Castro","5992709",
                "castro.inofuentes.cristopher@gmail.com","Sano",1,"ClCastro"));
        return "waso";
    };
}
