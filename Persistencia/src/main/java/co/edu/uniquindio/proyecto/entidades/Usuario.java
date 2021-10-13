package co.edu.uniquindio.proyecto.entidades;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Usuario extends Persona implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private String codigo;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Cuidad cuidad;
}
