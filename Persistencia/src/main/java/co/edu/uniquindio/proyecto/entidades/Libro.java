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
public class Libro implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private String sbn;
    private  String nombre;
    private Integer unidades;
    private Integer anio;

    public Libro(String sbn, String nombre, Integer unidades, Integer anio) {
        this.sbn = sbn;
        this.nombre = nombre;
        this.unidades = unidades;
        this.anio = anio;
    }


}