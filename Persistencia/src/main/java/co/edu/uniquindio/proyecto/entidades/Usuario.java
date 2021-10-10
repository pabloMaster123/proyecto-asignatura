package co.edu.uniquindio.proyecto.entidades;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Usuario extends Persona implements Serializable  {

    @Column(nullable = false, unique = true,length = 120)
    private String email;

    @ElementCollection
    @Column(nullable = false)
    private Map<String,String> numeroTelefono;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Cuidad cuidad;

    @OneToMany(mappedBy = "usuario")
    private List<Prestamo> prestamos;

}
