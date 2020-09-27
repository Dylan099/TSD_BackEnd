package com.example.demo.bl;

import com.example.demo.dao.PacienteRepository;
import com.example.demo.dto.PacienteDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterBl {
    private PacienteDto pacienteDto;
    private PacienteRepository pacienteRepository;

    @Autowired
    public RegisterBl(PacienteRepository pacienteRepository) {
        this.pacienteRepository = pacienteRepository;
    }

    public void setPaciente(PacienteDto pacienteDto){
        this.pacienteDto = pacienteDto;
    }
}
