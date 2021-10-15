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
public class Comentario implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private String codigo;

    @ManyToOne
    @Column(nullable = false)
    private Producto codigo_producto;

    @ManyToOne
    @Column(nullable = false)
    private Usuario codigo_usuario;

    @Column(nullable = false)
    private  String mensaje;

    private String respuesta;

    @Column(nullable = false)
    private LocalDate fecha_comentario;



}
