package com.reto02.microservicios.condicion.controllers;

import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.reto02.microservicios.commons.controllers.CommonController;
import com.reto02.microservicios.condicion.models.entity.Condicion;
import com.reto02.microservicios.condicion.services.CondicionService;

@RestController
public class CondicionController extends CommonController<Condicion, CondicionService>
{
	
	@PutMapping("/{id}")
	public ResponseEntity<?> editar(@RequestBody Condicion condicion, @PathVariable Long id)
	{
		Optional<Condicion> s = service.findById(id);
		
		if(s.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		
		Condicion condicionDb = s.get();
		condicionDb.setDescCondicion(condicion.getDescCondicion());
		
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(condicionDb));
		
	}
	
}
