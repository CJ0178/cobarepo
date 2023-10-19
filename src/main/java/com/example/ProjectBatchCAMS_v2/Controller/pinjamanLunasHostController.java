package com.example.ProjectBatchCAMS_v2.Controller;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ProjectBatchCAMS_v2.Service.pinjamanLunasHostService;

@RestController
@RequestMapping()
public class pinjamanLunasHostController {
	
	@Autowired
	private pinjamanLunasHostService srvc;
	
	@PostMapping("/insertPinjamanLunasHostPinjaman")
	public String insertPinjamanLunasHostPinjaman() throws ParseException{
		srvc.insertPinjamanLunasHostPinjaman();
		return "Insert Success!";
	}
	
	@PostMapping("/insertPinjamanLunasHostKomitmen")
	public String insertPinjamanLunasHostKomitmen() throws ParseException{
		srvc.insertPinjamanLunasHostKomitmen();
		return "Insert Success!";
	}
}
