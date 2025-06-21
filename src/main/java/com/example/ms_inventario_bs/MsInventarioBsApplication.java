package com.example.ms_inventario_bs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsInventarioBsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsInventarioBsApplication.class, args);
	}

}
