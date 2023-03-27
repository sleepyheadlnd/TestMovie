package dev.test.testmovie;

import lombok.AllArgsConstructor;
import org.bson.types.ObjectId;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "reviews")
@Data
public class Review {

    @Id
    private ObjectId id;

    private String body;
}
