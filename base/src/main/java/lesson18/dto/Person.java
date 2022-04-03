package lesson18.dto;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Data //содержит все нижеследующее
@EqualsAndHashCode(exclude = "height")
//@Getter
//@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
//@RequiredArgsConstructor

public class Person implements Serializable {

    @Serial
    private static final long serialVersionUID = 2L;

    private String name;
    private int age;
    private Sex sex;
    private  double height;

    public Person(String name) {
        this.name = name;
    }

    public void beOlder() throws  Exception {
       this.age++;
    }


}
