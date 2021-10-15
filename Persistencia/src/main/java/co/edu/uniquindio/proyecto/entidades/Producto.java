package co.edu.uniquindio.proyecto.entidades;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

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

    @OneToMany(mappedBy = "codigo_producto")
    private List<Comentario> comentarios;

    @OneToMany(mappedBy = "subasta")
    private List<Subasta> subastas;

    @ManyToMany(mappedBy = "productos")
    private List<Categoria> categorias;

}

