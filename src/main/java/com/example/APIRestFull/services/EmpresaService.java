package com.example.APIRestFull.services;

import com.example.APIRestFull.models.EmpresaModel;
import com.example.APIRestFull.repositores.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class EmpresaService {
    final
    EmpresaRepository empresaRepository;

    @Autowired
    public EmpresaService(EmpresaRepository empresaRepository) {
        this.empresaRepository = empresaRepository;
    }

    public ArrayList<EmpresaModel> obtenerEmpresas(){
       return (ArrayList<EmpresaModel>) empresaRepository.findAll();
    }

    public EmpresaModel gurardarEmpresa(EmpresaModel empresa){
        return empresaRepository.save(empresa);
    }

    public EmpresaModel editarEmpresa(EmpresaModel empresa){
        return empresaRepository.save(empresa);
    }

    public Optional<EmpresaModel> obtenerPorId(Integer id){
        return empresaRepository.findById(id);
    }

    public boolean eliminarEmpresa(Integer id){
        try {
            empresaRepository.deleteById(id);
            return true;
        }catch (Exception error){
            return false;
        }
    }


}
