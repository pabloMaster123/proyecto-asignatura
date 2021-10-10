package co.edu.uniquindio.proyecto.entidades;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import javax.persistence.OneToMany;

@Entity
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@ToString
public class Cuidad implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer codigo;

    @Column(nullable = false, length = 80)
    private String nombre;

    @OneToMany(mappedBy = "cuidad")
    private List<Usuario> usuarios;

    public Cuidad(String nombre) {
        this.nombre = nombre;
    }

}