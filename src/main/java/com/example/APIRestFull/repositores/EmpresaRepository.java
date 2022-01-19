package com.example.APIRestFull.repositores;

import com.example.APIRestFull.models.EmpresaModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends CrudRepository<EmpresaModel, Integer> {
}
