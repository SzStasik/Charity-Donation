package pl.szstasik.charity.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.Set;

@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "To pole nie może być puste")
    private String name;

    @NotBlank(message = "To pole nie może być puste")
    private String surname;

    @Email
    @NotBlank(message = "podaj adres e-mail")
    @Column(nullable = false, unique = true)
    private String email;

    @NotBlank(message = "to pole nie może być puste")
    private String password;

    @Transient
    private String repassword;

    private int enabled;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "user_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;

}
