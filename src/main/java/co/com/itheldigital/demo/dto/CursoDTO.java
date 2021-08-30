package co.com.itheldigital.demo.dto;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;


@Data
@ToString
public class CursoDTO  implements Serializable {


    private Long id;

    private String nombre;

    private Double costo;

    private String descripcion;

    private Long horas;

    private String dirigido;

    private String modalidad;

    public CursoDTO() {
    }

    public CursoDTO(Long id, String nombre, Double costo, String descripcion, Long horas, String dirigido, String modalidad) {
        this.id = id;
        this.nombre = nombre;
        this.costo = costo;
        this.descripcion = descripcion;
        this.horas = horas;
        this.dirigido = dirigido;
        this.modalidad = modalidad;
    }


}
