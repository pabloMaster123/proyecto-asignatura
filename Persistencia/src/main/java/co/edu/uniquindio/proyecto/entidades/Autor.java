package co.edu.uniquindio.proyecto.entidades;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Positive;
import java.io.Serializable;
import java.util.List;
import  javax.persistence.ManyToMany;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Autor extends Persona implements Serializable {

    @Column(nullable = false, precision = 4)
    @Positive
    private Integer fechaDeNacimiento;

    @ManyToMany(mappedBy = "autores")
    private List<Libro> libros;

}
