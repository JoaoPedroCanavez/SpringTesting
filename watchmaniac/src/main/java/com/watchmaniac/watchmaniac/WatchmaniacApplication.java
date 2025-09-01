package com.watchmaniac.watchmaniac;

import com.watchmaniac.service.ConsumoApi;
import com.watchmaniac.service.ConverteDados;
import model.DadosEpisodeo;
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
        var json = consumoapi.obterDados("https://omdbapi.com/?t=breaking+bad&apikey=");   
        System.out.println(json);
        var conversor = new ConverteDados();
        DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
        System.out.println(dados);
        var json2 = consumoapi.obterDados("https://omdbapi.com/?t=breaking+bad&season=1&episode=2&apikey=");
        DadosEpisodeo dadosepisodeo = conversor.obterDados(json2, DadosEpisodeo.class);
        System.out.println(dadosepisodeo);
    }
}
