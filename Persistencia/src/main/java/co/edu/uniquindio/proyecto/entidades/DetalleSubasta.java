package co.edu.uniquindio.proyecto.entidades;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class DetalleSubasta implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private String codigo;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Subasta codigo_subasta;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Usuario codigo_usuario;

    @Column(nullable = false)
    private Integer valor;

    @Column(nullable = false)
    private LocalDate fecha_subasta;

}
