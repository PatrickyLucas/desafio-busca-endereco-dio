package br.com.dio.enderecopessoas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class EnderecopessoasApplication {
	public static void main(String[] args) {
		SpringApplication.run(EnderecopessoasApplication.class, args);
	}
}