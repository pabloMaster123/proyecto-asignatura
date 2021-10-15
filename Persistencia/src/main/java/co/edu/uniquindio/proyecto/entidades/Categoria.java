package co.edu.uniquindio.proyecto.entidades;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Categoria implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @Column(length = 10)
    private String codigo;

    @Column(nullable = false,length = 50)
    private String nombre;

    @ManyToMany
    private List<Producto> productos;

}
