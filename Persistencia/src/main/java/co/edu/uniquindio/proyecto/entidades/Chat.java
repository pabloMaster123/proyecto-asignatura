package co.edu.uniquindio.proyecto.entidades;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
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

    @JoinColumn(nullable = false)
    @ManyToOne
    private Usuario codigo_usuario;

    @OneToMany(mappedBy = "chats")
    private List<Mensaje> mensajes;

    @ManyToOne
    private Usuario usuario;

}
