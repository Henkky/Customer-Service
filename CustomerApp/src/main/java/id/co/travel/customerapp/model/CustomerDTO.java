package id.co.travel.customerapp.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CustomerDTO {
    private Integer id;
    private String name;
    private String gender;
    private String email;
}
