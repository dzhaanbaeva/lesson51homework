package hw.lesson.microgram.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "tracks")
@Data
public class Track {
    @Id
    private String id;
    @Indexed
    private String name;

    @DBRef
    private Singer singer;

    public Track(String name, Singer singer) {
        this.name = name;
        this.singer = singer;
    }
}
