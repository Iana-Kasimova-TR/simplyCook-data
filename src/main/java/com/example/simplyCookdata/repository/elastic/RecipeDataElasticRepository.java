package com.example.simplyCookdata.repository.elastic;

import com.simply.simplyCookcommon.model.Recipe;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface RecipeDataElasticRepository extends ElasticsearchRepository<Recipe, String> {
}
