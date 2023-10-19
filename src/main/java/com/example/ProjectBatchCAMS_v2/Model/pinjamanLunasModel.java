package com.example.ProjectBatchCAMS_v2.Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="TDL_PINJ_LUNAS")
public class pinjamanLunasModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long TDL_PINJ_LUNAS_ID;
	@Column(length = 40)
	private String NO_REKENING;
	@Column(length = 11)
	private String NO_PINJAMAN;
	private char IS_SKL_PRINTED;
	private char IS_ROYA_PRINTED;
	private char IS_TTJ_PRINTED;
	private char IS_SPAJ_PRINTED;
	private Date DATE_CR_END;
	private Date DATE_DOWNLOADED;
	private char TDL_DONE;
//	public batchPinjamanLunasModel(Integer tDL_PINJ_LUNAS_ID, String nO_REKENING, String nO_PINJAMAN,
//			Character iS_SKL_PRINTED, Character iS_ROYA_PRINTED, Character iS_TTJ_PRINTED, Character iS_SPAJ_PRINTED,
//			Date dATE_CR_END, Date dATE_DOWNLOADED, Character tDL_DONE) {
//		this.TDL_PINJ_LUNAS_ID = tDL_PINJ_LUNAS_ID;
//		this.NO_REKENING = nO_REKENING;
//		this.NO_PINJAMAN = nO_PINJAMAN;
//		this.IS_SKL_PRINTED = iS_SKL_PRINTED;
//		this.IS_ROYA_PRINTED = iS_ROYA_PRINTED;
//		this.IS_TTJ_PRINTED = iS_TTJ_PRINTED;
//		this.IS_SPAJ_PRINTED = iS_SPAJ_PRINTED;
//		this.DATE_CR_END = dATE_CR_END;
//		this.DATE_DOWNLOADED = dATE_DOWNLOADED;
//		this.TDL_DONE = tDL_DONE;
//	}
//	
//	public batchPinjamanLunasModel() {
//	}
//
//	public Integer getTDL_PINJ_LUNAS_ID() {
//		return TDL_PINJ_LUNAS_ID;
//	}
//
//	public void setTDL_PINJ_LUNAS_ID(Integer tDL_PINJ_LUNAS_ID) {
//		TDL_PINJ_LUNAS_ID = tDL_PINJ_LUNAS_ID;
//	}
//
//	public String getNO_REKENING() {
//		return NO_REKENING;
//	}
//
//	public void setNO_REKENING(String nO_REKENING) {
//		NO_REKENING = nO_REKENING;
//	}
//
//	public String getNO_PINJAMAN() {
//		return NO_PINJAMAN;
//	}
//
//	public void setNO_PINJAMAN(String nO_PINJAMAN) {
//		NO_PINJAMAN = nO_PINJAMAN;
//	}
//
//	public Character getIS_SKL_PRINTED() {
//		return IS_SKL_PRINTED;
//	}
//
//	public void setIS_SKL_PRINTED(Character iS_SKL_PRINTED) {
//		IS_SKL_PRINTED = iS_SKL_PRINTED;
//	}
//
//	public Character getIS_ROYA_PRINTED() {
//		return IS_ROYA_PRINTED;
//	}
//
//	public void setIS_ROYA_PRINTED(Character iS_ROYA_PRINTED) {
//		IS_ROYA_PRINTED = iS_ROYA_PRINTED;
//	}
//
//	public Character getIS_TTJ_PRINTED() {
//		return IS_TTJ_PRINTED;
//	}
//
//	public void setIS_TTJ_PRINTED(Character iS_TTJ_PRINTED) {
//		IS_TTJ_PRINTED = iS_TTJ_PRINTED;
//	}
//
//	public Character getIS_SPAJ_PRINTED() {
//		return IS_SPAJ_PRINTED;
//	}
//
//	public void setIS_SPAJ_PRINTED(Character iS_SPAJ_PRINTED) {
//		IS_SPAJ_PRINTED = iS_SPAJ_PRINTED;
//	}
//
//	public Date getDATE_CR_END() {
//		return DATE_CR_END;
//	}
//
//	public void setDATE_CR_END(Date dATE_CR_END) {
//		DATE_CR_END = dATE_CR_END;
//	}
//
//	public Date getDATE_DOWNLOADED() {
//		return DATE_DOWNLOADED;
//	}
//
//	public void setDATE_DOWNLOADED(Date dATE_DOWNLOADED) {
//		DATE_DOWNLOADED = dATE_DOWNLOADED;
//	}
//	
//	public Character getTDL_DONE() {
//		return TDL_DONE;
//	}
//
//	public void setTDL_DONE(Character tDL_DONE) {
//		TDL_DONE = tDL_DONE;
//	}
	
	
}
