package id.co.travel.customerapp.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "genderdata")
@Setter
@Getter
public class GenderData {
    @Id
    String genderid;

    @Column(name = "description")
    String description;

    @JsonBackReference
    //mapped by harus diisi nama variabel reference di sebelah
    @OneToMany(mappedBy = "gender")
    private List<Customer> customers;

}
