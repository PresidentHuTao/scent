package com.example.scent.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;


import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Table(name = "thanh_phan")
@Entity
public class ThanhPhan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "ten_chat_lieu")
    private String tenChatLieu;
    @Column(name = "ty_le_thanh_phan")
    private String tyLeThanhPhan;
    @JsonIgnore
    @OneToMany(mappedBy = "thanhPhan")
    List<Spct> spct;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenChatLieu() {
        return tenChatLieu;
    }

    public void setTenChatLieu(String tenChatLieu) {
        this.tenChatLieu = tenChatLieu;
    }

    public String getTyLeThanhPhan() {
        return tyLeThanhPhan;
    }

    public void setTyLeThanhPhan(String tyLeThanhPhan) {
        this.tyLeThanhPhan = tyLeThanhPhan;
    }

    public List<Spct> getSpct() {
        return spct;
    }

    public void setSpct(List<Spct> spct) {
        this.spct = spct;
    }
}

