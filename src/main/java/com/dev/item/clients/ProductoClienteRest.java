package com.dev.item.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.dev.item.models.Producto;

@FeignClient(name = "servicio-productos",url="localhost:8001")
public interface ProductoClienteRest {
	
	@GetMapping("/listar")
	public List<Producto> listar();
	
	@GetMapping("/listar/{id}")
	public Producto detalle(@PathVariable Long id);

}
