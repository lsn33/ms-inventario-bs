package com.example.ms_inventario_bs.clients;


import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.ms_inventario_bs.model.dto.ProductoDTO;

@FeignClient(name = "ms-inventario-db", url = "http://localhost:8280")
public interface InventarioDbFeignClient {


    @GetMapping("/productos/{id}")
    ProductoDTO getProductoById(@PathVariable("id") Long id);

    
    @GetMapping("/productos")
    List<ProductoDTO> selectAllProducto();  


    @PostMapping("/productos")
    ProductoDTO createProducto(@RequestBody ProductoDTO productoDTO);
}
