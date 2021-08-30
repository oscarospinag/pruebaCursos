package co.com.itheldigital.demo.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Entity
@Table(name = "DESCUENTO")
public class Descuento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "MODALIDAD")
    private String modalidad;

    @Column(name = "PAIS")
    private String pais;

    @Column(name = "DESCUENTO")
    private Double descuento;

    @Column(name = "CURSO")
    private String curso;

    @Column(name = "FECHA")
    private Date fecha;

    @Column(name = "VALOR")
    private Double valorCurso;

    public Descuento() {
    }

    public Descuento(Long id, String nombre, String modalidad, String pais, Double descuento, String curso, Date fecha, Double valorCurso) {
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
