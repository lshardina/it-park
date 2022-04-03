package lesson33.hw.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultDtoExchange {


    private String value;
    private String valute1;
    private String valute2;
    private String dateCourse;
}
