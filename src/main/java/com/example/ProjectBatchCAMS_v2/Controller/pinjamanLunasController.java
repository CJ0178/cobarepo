package com.example.ProjectBatchCAMS_v2.Controller;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ProjectBatchCAMS_v2.Model.pinjamanLunasModel;
import com.example.ProjectBatchCAMS_v2.Repository.pinjamanLunasRepo;
import com.example.ProjectBatchCAMS_v2.Service.pinjamanLunasService;

@RestController
@RequestMapping()
public class pinjamanLunasController {
//	@Autowired
//	private Repo repo;
//	
//	@PostMapping("/coba")
//	public batchPinjamanLunasModel tes() {
//		batchPinjamanLunasModel coba = new batchPinjamanLunasModel();
//		coba.setTDL_PINJ_LUNAS_ID(1);
//		coba.setNO_REKENING("384729739");
//		coba.setNO_PINJAMAN("283791");
//		coba.setIS_SKL_PRINTED('1');
//		coba.setIS_ROYA_PRINTED('0');
//		coba.setIS_TTJ_PRINTED('1');
//		coba.setIS_SPAJ_PRINTED('0');
//		coba.setDATE_CR_END(Date.valueOf(LocalDate.now()));
//		coba.setDATE_DOWNLOADED(Date.valueOf(LocalDate.now()));
//		coba.setTDL_DONE('1');
//		return repo.save(coba);
//	}
	
	@Autowired
	private pinjamanLunasService srvc;
	
	@PostMapping("/read")
	public String insertPinjamanLunas() throws ParseException{
		srvc.insertPinjamanLunas();
		return "Insert Success!";
	}
}
