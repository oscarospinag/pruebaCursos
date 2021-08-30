package co.com.itheldigital.demo.dto;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Data
@ToString
public class DescuentoDTO implements Serializable {

    private Long id;

    private String nombre;

    private String modalidad;

    private String pais;

    private Double descuento;

    private String curso;

    private Date fecha;

    private Double valorCurso;

    public DescuentoDTO() {
    }

    public DescuentoDTO(Long id, String nombre, String modalidad, String pais, Double descuento, String curso, Date fecha, Double valorCurso) {
        this.id = id;
        this.nombre = nombre;
        this.modalidad = modalidad;
        this.pais = pais;
        this.descuento = descuento;
        this.curso = curso;
        this.fecha = fecha;
        this.valorCurso = valorCurso;
    }
}
