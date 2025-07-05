package com.example.ms_inventario_bs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.ms_inventario_bs.model.dto.ProductoDTO;
import com.example.ms_inventario_bs.service.ProductoService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    ProductoService productoService;

    @Operation(summary = "Obtener todos los productos", description = "Devuelve una lista con todos los productos disponibles en el inventario")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Lista de productos obtenida correctamente",
                     content = @Content(mediaType = "application/json",
                     schema = @Schema(implementation = ProductoDTO.class)))
    })
    @GetMapping
    public List<ProductoDTO> selectAllProducto() {
        return productoService.selectAllProducto();
    }

    @Operation(summary = "Obtener un producto por ID", description = "Busca y devuelve un producto específico según su ID")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Producto encontrado",
                     content = @Content(mediaType = "application/json",
                     schema = @Schema(implementation = ProductoDTO.class))),
        @ApiResponse(responseCode = "404", description = "Producto no encontrado", content = @Content)
    })
    @GetMapping("/{id}")
    public ProductoDTO getProductoById(
        @Parameter(description = "ID del producto que se desea consultar", example = "1001")
        @PathVariable("id") Long id) {
        return productoService.getProductoById(id);
    }

    @Operation(summary = "Crear un nuevo producto", description = "Registra un nuevo producto en el inventario")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "201", description = "Producto creado exitosamente",
                     content = @Content(mediaType = "application/json",
                     schema = @Schema(implementation = ProductoDTO.class))),
        @ApiResponse(responseCode = "400", description = "Datos de entrada inválidos", content = @Content)
    })
    @PostMapping
    public ProductoDTO createProducto(
        @Parameter(description = "Datos del producto a crear", required = true)
        @RequestBody ProductoDTO productoDTO) {
        return productoService.createProducto(productoDTO);
    }
}
