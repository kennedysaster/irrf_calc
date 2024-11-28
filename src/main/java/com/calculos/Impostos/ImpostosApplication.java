package com.calculos.Impostos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller // especifica que esta classe é uma classe controller para andpoint existir
public class ImpostosApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(ImpostosApplication.class, args);
		System.out.println("sucesso conexao");
	}

}
