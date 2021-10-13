package co.edu.uniquindio.proyecto.entidades;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Producto implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private String codigo_producto;

    @Column(nullable = false,length = 30)
    private String nombre_producto;

    @Column(nullable = false)
    private Integer unidades_producto;

    @Column(nullable = false)
    private String descripsion_producto;

    @Column(nullable = false)
    private Integer precio_producto;

    @Column(nullable = false)
    private LocalDate fecha_limite;

    @Column(nullable = false)
    private Integer descuento;

    private Usuario codigo_vendedor;

    private Cuidad codigo_cuidad;

}

