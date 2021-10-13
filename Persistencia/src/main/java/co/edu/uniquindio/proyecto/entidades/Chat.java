package co.edu.uniquindio.proyecto.entidades;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Chat implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private String codigo;

    @Column(nullable = false)
    @ManyToOne
    private Usuario codigo_usuario;

    @Column(nullable = false)
    @ManyToOne
    private Producto codigo_producto;

    @OneToMany(mappedBy = "chats")
    private List<Mensaje> mensajes;


}
