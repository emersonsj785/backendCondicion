package com.reto02.microservicios.condicion.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.reto02.microservicios.condicion.models.entity.Condicion;

public interface CondicionRepository extends CrudRepository<Condicion, Long>
{
	
}
