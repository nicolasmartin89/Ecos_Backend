package semillero.ecosistema.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "publication")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Publication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "El título no puede ser null.")
    @NotBlank(message = "El título no puede estar en blanco.")
    @Size(max = 255, message = "El título debe tener menos de 255 caracteres.")
    private String title;

    @NotNull(message = "La descripción no puede ser null.")
    @NotBlank(message = "La descripción no puede estar en blanco.")
    @Size(max = 7500, message = "La descripción debe tener menos de 7500 caracteres.")
    @Column(name = "description", nullable = false, columnDefinition = "TEXT")
    private String description;

    @NotEmpty(message = "Images list cannot be empty")
    @OneToMany(mappedBy = "publication", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<PublicationImage> images;

    @NotNull(message = "El usuario no puede ser null.")
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "user_id", nullable = false)
    private User userCreator;

    @NotNull(message = "Deleted flag cannot be null")
    @Column(name = "deleted", nullable = false)
    @Convert(converter = org.hibernate.type.YesNoConverter.class)
    private Boolean deleted;

    private Integer visualizationsAmount;

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDate dateOfCreation;



}