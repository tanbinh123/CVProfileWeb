/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amryramadhanprasetya.cv.model;

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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author amry4
 */
@Entity
@Table(name = "portofolio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Portofolio.findAll", query = "SELECT p FROM Portofolio p")
    , @NamedQuery(name = "Portofolio.findById", query = "SELECT p FROM Portofolio p WHERE p.id = :id")
    , @NamedQuery(name = "Portofolio.findByNama", query = "SELECT p FROM Portofolio p WHERE p.nama = :nama")
    , @NamedQuery(name = "Portofolio.findByDeskripsi", query = "SELECT p FROM Portofolio p WHERE p.deskripsi = :deskripsi")})
public class Portofolio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "nama")
    private String nama;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 120)
    @Column(name = "deskripsi")
    private String deskripsi;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "gambar")
    private byte[] gambar;

    public Portofolio() {
    }

    public Portofolio(Integer id) {
        this.id = id;
    }

    public Portofolio(Integer id, String nama, String deskripsi, byte[] gambar) {
        this.id = id;
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.gambar = gambar;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public byte[] getGambar() {
        return gambar;
    }

    public void setGambar(byte[] gambar) {
        this.gambar = gambar;
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
        if (!(object instanceof Portofolio)) {
            return false;
        }
        Portofolio other = (Portofolio) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.amryramadhanprasetya.cv.model.Portofolio[ id=" + id + " ]";
    }
    
}
