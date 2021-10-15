package co.edu.uniquindio.proyecto.entidades;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Cuidad implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private String codigo;

    @Column(nullable = false)
    private String nombre;

    @OneToMany(mappedBy = "cuidad")
    private List<Usuario> usuaios;

}
