package lesson30.hw.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Data
@NoArgsConstructor
@Entity
@Table(name = "CITY")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotEmpty
    @Column(name = "name_rus")
    private String nameRus;

    @Column(name = "name_eng")
    private String nameEng;

    @Column(name = "population")
    private long population;

    public City(String nameRus) {
        this.nameRus = nameRus;
    }

   public City(String nameRus, String nameEng, long population) {
        this.nameRus = nameRus;
        this.nameEng = nameEng;
        this.population = population;
    }


}
