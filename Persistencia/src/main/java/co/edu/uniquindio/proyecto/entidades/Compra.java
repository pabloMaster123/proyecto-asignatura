package co.edu.uniquindio.proyecto.entidades;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Compra implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private String codigo;

    @JoinColumn(nullable = false)
    @ManyToOne
    private Usuario codigo_usuario;

    @Column(nullable = false)
    private LocalDate fecha_compra;

    @OneToMany(mappedBy = "compra")
    private List<DetalleCompra> detalleCompras;

}
