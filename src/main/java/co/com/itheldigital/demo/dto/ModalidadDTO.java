package co.com.itheldigital.demo.dto;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;


@Data
@ToString
public class ModalidadDTO implements Serializable {

    private Long id;

    private String nombre;

    private String descripcion;

    public ModalidadDTO() {
    }

    public ModalidadDTO(Long id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
}
