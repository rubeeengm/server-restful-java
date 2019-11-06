/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itver.edu;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author server
 */
@Entity
@Table(name = "Alumnos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Alumnos.findAll", query = "SELECT a FROM Alumnos a")
    , @NamedQuery(name = "Alumnos.findByIdAlumnos", query = "SELECT a FROM Alumnos a WHERE a.idAlumnos = :idAlumnos")
    , @NamedQuery(name = "Alumnos.findByNombre", query = "SELECT a FROM Alumnos a WHERE a.nombre = :nombre")
    , @NamedQuery(name = "Alumnos.findByApellidoPaterno", query = "SELECT a FROM Alumnos a WHERE a.apellidoPaterno = :apellidoPaterno")
    , @NamedQuery(name = "Alumnos.findByApellidoMaterno", query = "SELECT a FROM Alumnos a WHERE a.apellidoMaterno = :apellidoMaterno")
    , @NamedQuery(name = "Alumnos.findByCarrera", query = "SELECT a FROM Alumnos a WHERE a.carrera = :carrera")
    , @NamedQuery(name = "Alumnos.findBySemestre", query = "SELECT a FROM Alumnos a WHERE a.semestre = :semestre")})
public class Alumnos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idAlumnos")
    private Integer idAlumnos;
    @Size(max = 45)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 45)
    @Column(name = "apellidoPaterno")
    private String apellidoPaterno;
    @Size(max = 45)
    @Column(name = "apellidoMaterno")
    private String apellidoMaterno;
    @Size(max = 45)
    @Column(name = "carrera")
    private String carrera;
    @Size(max = 45)
    @Column(name = "semestre")
    private String semestre;

    public Alumnos() {
    }

    public Alumnos(Integer idAlumnos) {
        this.idAlumnos = idAlumnos;
    }

    public Integer getIdAlumnos() {
        return idAlumnos;
    }

    public void setIdAlumnos(Integer idAlumnos) {
        this.idAlumnos = idAlumnos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAlumnos != null ? idAlumnos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Alumnos)) {
            return false;
        }
        Alumnos other = (Alumnos) object;
        if ((this.idAlumnos == null && other.idAlumnos != null) || (this.idAlumnos != null && !this.idAlumnos.equals(other.idAlumnos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "itver.edu.Alumnos[ idAlumnos=" + idAlumnos + " ]";
    }
    
}
