package co.edu.uniquindio.proyecto.entidades;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@ToString
public class Genero_Libro implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private String codigo;
    private String nombre;

    public Genero_Libro(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

}