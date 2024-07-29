package semillero.ecosistema.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name cannot be blank")
    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @NotNull(message = "Image cannot be null")
    @OneToOne(mappedBy = "category", cascade = CascadeType.ALL)
    private CategoryImage image;
}
