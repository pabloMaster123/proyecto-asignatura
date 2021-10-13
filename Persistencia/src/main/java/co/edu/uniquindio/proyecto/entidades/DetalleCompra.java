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
public class DetalleCompra implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private String codigo;

    @JoinColumn(nullable = false)
    @ManyToOne
    private Producto codigo_producto;

    @Column(nullable = false)
    private Integer unidades;

    @Column(nullable = false)
    private Integer precio_producto;

}
