package com.example.ProjectBatchCAMS_v2.Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="PINJAMAN_LUNAS_HOST")
public class pinjamanLunasHostModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long PINJAMAN_LUNAS_HOST_ID;
	@Column(length = 20)
	private String NO_REKENING;
	@Column(length = 11)
	private String NO_PINJAMAN;
	private Date TGL_LUNAS;
	@Column(length = 10)
	private String KODE_PRODUK;
	private Date DATE_CREATED;
	@Column(length = 20)
	private String CREATED_BY;
}

