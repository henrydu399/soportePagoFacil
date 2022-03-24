/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.resuelva.soportepagofacil.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "soporte_pago_facil")
public class SoportePagoFacilEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "canal_ingreso")
    private String canalIngreso;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "asesor")
    private String asesor;
    @Column(name = "comunicacion_para")
    private String comunicacionPara;
    @Column(name = "cierre_comunicacion")
    private String cierreComunicacion;
    @Lob
    @Column(name = "observacion")
    private String observacion;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;

    public SoportePagoFacilEntity() {
    }

    public SoportePagoFacilEntity(Long id) {
        this.id = id;
    }

    public SoportePagoFacilEntity(Long id, String canalIngreso) {
        this.id = id;
        this.canalIngreso = canalIngreso;
    }

    public String getCanalIngreso() {
        return canalIngreso;
    }

    public void setCanalIngreso(String canalIngreso) {
        this.canalIngreso = canalIngreso;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getAsesor() {
        return asesor;
    }

    public void setAsesor(String asesor) {
        this.asesor = asesor;
    }

    public String getComunicacionPara() {
        return comunicacionPara;
    }

    public void setComunicacionPara(String comunicacionPara) {
        this.comunicacionPara = comunicacionPara;
    }

    public String getCierreComunicacion() {
        return cierreComunicacion;
    }

    public void setCierreComunicacion(String cierreComunicacion) {
        this.cierreComunicacion = cierreComunicacion;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SoportePagoFacilEntity)) {
            return false;
        }
        SoportePagoFacilEntity other = (SoportePagoFacilEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.resuelva.soportepagofacil.entity.SoportePagoFacil[ id=" + id + " ]";
    }
    
}
