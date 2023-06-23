package com.SOA.lab6.clientes;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.SOA.lab6.models.Producto;

@FeignClient(name = "servicio-productos")
public interface ProductoClienteRest {
    
    @GetMapping("/listar")
    public List<Producto> listar();

    @GetMapping("/ver/{id}")
    public Producto detalle(@PathVariable Long id);
}
