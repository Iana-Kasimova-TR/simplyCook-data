package com.example.simplyCookdata;

import com.example.simplyCookdata.repository.mongo.RecipeDataMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories("com.example.simplyCookdata.repository.mongo")
@EnableElasticsearchRepositories("com.example.simplyCookdata.repository.elastic")
@SpringBootApplication
public class SimplyCookDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimplyCookDataApplication.class, args);
	}

}
