package com.genoma.springboot.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.genoma.springboot.backend.apirest.models.entity.Cliente;

public interface IclienteDao extends CrudRepository<Cliente, Long>{

}
