package com.example.ms_inventario_bs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.ms_inventario_bs.model.dto.ProductoDTO;
import com.example.ms_inventario_bs.service.ProductoService;

@RestController
public class ProductoController {

    @Autowired
    ProductoService productoService;

    @GetMapping("/productos")
    public List<ProductoDTO> selectAllProducto() {
        return productoService.selectAllProducto();
    }

    @GetMapping("/productos/{id}")
        public ProductoDTO getProductoById(@PathVariable("id") Long id) {
        return productoService.getProductoById(id);
    }

    @PostMapping("/productos")
    public ProductoDTO createProducto(@RequestBody ProductoDTO productoDTO) {
        return productoService.createProducto(productoDTO);
    }



}
