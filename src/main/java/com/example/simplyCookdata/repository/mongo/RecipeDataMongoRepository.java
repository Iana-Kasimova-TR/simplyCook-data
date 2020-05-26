package com.example.simplyCookdata.repository.mongo;

import com.simply.simplyCookcommon.model.Recipe;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "recipe", path = "recipe")
public interface RecipeDataMongoRepository extends MongoRepository<Recipe, String> {

  Optional<Recipe> getRecipeByName(@Param("name") String name);
}
