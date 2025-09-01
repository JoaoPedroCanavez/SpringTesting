package com.watchmaniac.watchmaniac;

import com.watchmaniac.service.ConsumoApi;
import com.watchmaniac.service.ConverteDados;
import model.DadosSerie;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WatchmaniacApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(WatchmaniacApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        var consumoapi = new ConsumoApi();
        var json = consumoapi.obterDados("");   
        System.out.println(json);
        var conversor = new ConverteDados();
        DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
        System.out.println(dados);
    }
}
