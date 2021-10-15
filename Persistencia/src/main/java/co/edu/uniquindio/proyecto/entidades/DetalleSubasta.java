package co.edu.uniquindio.proyecto.entidades;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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
    @Column(nullable = false)
    private Subasta codigo_subasta;

    @ManyToOne
    private Usuario codigo_usuario;

    @Column(nullable = false)
    private Integer valor;

    @Column(nullable = false)
    private LocalDate fecha_subasta;

}
