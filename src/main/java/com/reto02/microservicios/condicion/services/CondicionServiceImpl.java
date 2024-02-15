package com.reto02.microservicios.condicion.services;
import org.springframework.stereotype.Service;

import com.reto02.microservicios.commons.services.CommonServiceImpl;
import com.reto02.microservicios.condicion.models.entity.Condicion;
import com.reto02.microservicios.condicion.models.repository.CondicionRepository;

@Service
public class CondicionServiceImpl extends CommonServiceImpl<Condicion, CondicionRepository> implements CondicionService 
{
	
}
