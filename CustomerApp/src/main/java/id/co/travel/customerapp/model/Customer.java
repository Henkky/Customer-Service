package id.co.travel.customerapp.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "customer")
@Setter
@Getter
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    String name;

    //@JsonIgnore
    @ManyToOne
    @JoinColumn(name = "gender")
    @JsonManagedReference
    GenderData gender;

    @Column(name = "email")
    String email;

}
