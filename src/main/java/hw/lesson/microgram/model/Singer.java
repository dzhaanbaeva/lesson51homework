package hw.lesson.microgram.model;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "singers")
@Data
public class Singer {

    @Id
    private String id;

    @Indexed
    private String name;

    public Singer(String name) {
        this.name = name;
    }

}



