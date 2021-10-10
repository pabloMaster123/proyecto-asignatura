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
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@ToString
public class Libro implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @Column(length = 10)
    private String sbn;

    @Column(nullable = false, length = 30)
    private  String nombre;

    @Column(nullable = false)
    private Integer unidades;

    @Column(nullable = false)
    private Integer anio;

    @Column(nullable = false)
    private Genero_Libro genero_libro;

    @ManyToMany(mappedBy = "libros")
    private List<Prestamo> prestamos;

    @ManyToMany
    private List<Autor> autores;

    public Libro(String sbn, String nombre, Integer unidades, Integer anio) {
        this.sbn = sbn;
        this.nombre = nombre;
        this.unidades = unidades;
        this.anio = anio;
    }


}