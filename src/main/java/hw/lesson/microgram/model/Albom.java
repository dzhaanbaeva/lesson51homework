package hw.lesson.microgram.model;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.sound.midi.Track;

@Document(collation = "alboms")
@Data
public class Albom {
    @Id
    private String id;
    @Indexed
    private String name;
    @Indexed
    private  String year;

    @DBRef
    private Singer singer;
    @DBRef
    private Track track;

    //Здесь связывающий класс, через этот класс могу  вытащить все необходимые данные - исполнителя, компизицию и альбом

}
