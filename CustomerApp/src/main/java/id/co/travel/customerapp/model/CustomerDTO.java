package id.co.travel.customerapp.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
//DTO = Data Transfer Object, class non entity bisa digunakan untuk insert/update tanpa ada detil column,join dll terkait entity
public class CustomerDTO {
    private Integer id;
    private String name;
    private String gender;
    private String email;
}
