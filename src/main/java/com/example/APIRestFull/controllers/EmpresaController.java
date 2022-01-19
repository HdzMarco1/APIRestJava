package com.example.APIRestFull.controllers;

import com.example.APIRestFull.models.EmpresaModel;
import com.example.APIRestFull.services.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/empresa")
public class EmpresaController {
    final
    EmpresaService empresaService;

    @Autowired
    public EmpresaController(EmpresaService empresaService) {
        this.empresaService = empresaService;
    }

    @GetMapping("/")
    public ArrayList<EmpresaModel> obtenerEmpresas(){
        return empresaService.obtenerEmpresas();
    }

    @GetMapping("/{id}")
    public Optional<EmpresaModel> obtenerEmpresaPorId(@PathVariable("id") Integer id){
        return empresaService.obtenerPorId(id);
    }

    @PostMapping("/")
    public EmpresaModel guardarEmpresa(@RequestBody EmpresaModel empresa){
        return  empresaService.gurardarEmpresa(empresa);
    }

    @PutMapping("/")
    public EmpresaModel editarEmpresa(@RequestBody EmpresaModel empresa){
        return  empresaService.editarEmpresa(empresa);
    }

    @DeleteMapping("/{id}")
    public String eliminarPorId(@PathVariable("id") Integer id){
        boolean ok = empresaService.eliminarEmpresa(id);
        if (ok){
            return "se elimino la empresa con id " + id;
        }else {
            return  "No se pudo eliminar la empresa con id " + id;
        }
    }


}
