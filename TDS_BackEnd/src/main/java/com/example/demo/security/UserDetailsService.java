package com.example.demo.security;

import com.example.demo.Domain.Paciente;
import com.example.demo.dao.DoctorRepository;
import com.example.demo.dao.PacienteRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {

    private PacienteRepository pacienteRepository;
    private DoctorRepository doctorRepository;

    public UserDetailsService(PacienteRepository pacienteRepository, DoctorRepository doctorRepository) {
        this.pacienteRepository = pacienteRepository;
        this.doctorRepository = doctorRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Paciente paciente = pacienteRepository.findPacienteByUsername(s);
        return new UserPrincipal(paciente);
    }
}
