package co.edu.uniquindio.proyecto.entidades;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Comentario implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private String codigo;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Producto codigo_producto;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Usuario codigo_usuario;

    @Column(nullable = false)
    private  String mensaje;

    private String respuesta;

    @Column(nullable = false)
    private LocalDate fecha_comentario;



}
