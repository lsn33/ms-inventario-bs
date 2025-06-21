package com.example.ms_inventario_bs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ms_inventario_bs.clients.InventarioDbFeignClient;
import com.example.ms_inventario_bs.model.dto.ProductoDTO;

@Service
public class ProductoService {

    @Autowired
    InventarioDbFeignClient inventarioDbFeignClient;

    public List<ProductoDTO> selectAllProducto() {
      return inventarioDbFeignClient.selectAllProducto();
    }

    public ProductoDTO getProductoById(Long id) {
        return inventarioDbFeignClient.getProductoById(id);
    }

    public ProductoDTO createProducto(ProductoDTO productoDTO) {
    return inventarioDbFeignClient.createProducto(productoDTO);
    }


}
