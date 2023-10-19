package com.example.ProjectBatchCAMS_v2.Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ProjectBatchCAMS_v2.Model.pinjamanLunasHostModel;
import com.example.ProjectBatchCAMS_v2.Repository.pinjamanLunasHostRepo;

@Service
public class pinjamanLunasHostService {
	@Autowired
	private pinjamanLunasHostRepo repo;
	
	public  void insertPinjamanLunasHostPinjaman() throws ParseException {
		String fileName = "CAMSLUNAS.TXT";
		String pathFile = System.getProperty("user.dir") + "/src/main/resources/data" + File.separator + fileName;
		Path src = Paths.get(pathFile);
		
		try(BufferedReader reader = new BufferedReader(new FileReader(pathFile))) {
			String line;
			List<pinjamanLunasHostModel> dataLunasHost = new ArrayList<>();
			
			while ((line = reader.readLine()) != null) {
			
				String ubah = line.replaceAll("_", ";");
	//			System.out.println(ubah);
				String[] data = ubah.split(";");
				
				if(data.length!=0) {
					String norekening = data[0];
					if(norekening.length() == 10){
						norekening = "0"+norekening;
					}
					
					String nopinj = data[1];
					String tglLunas = data[2];
					String kodeProduk = data[3];
					
					SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy"); 
					Date dateLunas = df.parse(tglLunas);
					
					SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					Date dateNow = new Date();
					
					pinjamanLunasHostModel lunasHostBaru = new pinjamanLunasHostModel();
					lunasHostBaru.setNO_REKENING(norekening);
					lunasHostBaru.setNO_PINJAMAN(nopinj);
					lunasHostBaru.setTGL_LUNAS(dateLunas);
					lunasHostBaru.setKODE_PRODUK(kodeProduk);
					lunasHostBaru.setDATE_CREATED(dateNow);
					lunasHostBaru.setCREATED_BY("SYSTEM");
					
					dataLunasHost.add(lunasHostBaru);
				}
			}
			System.out.println(dataLunasHost);
			repo.saveAll(dataLunasHost);
			reader.close();
	
			String fileExtension = "";
	        if (fileName.lastIndexOf(".") != -1) {
	            fileExtension = fileName.substring(fileName.lastIndexOf("."));
	        }
	
			String namaBaru = fileName.split("\\.")[0]+"_"+LocalDate.now()+fileExtension;
			String target = System.getProperty("user.dir") + "/src/main/resources/data" + File.separator + namaBaru;
			Path pathBaru = Paths.get(target);
			
			Files.move(src, pathBaru, StandardCopyOption.REPLACE_EXISTING);				
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public  void insertPinjamanLunasHostKomitmen() throws ParseException {
		String fileName = "CAMCOMMLUNAS.TXT";
		String pathFile = System.getProperty("user.dir") + "/src/main/resources/data" + File.separator + fileName;
		Path src = Paths.get(pathFile);
		
		try(BufferedReader reader = new BufferedReader(new FileReader(pathFile))) {
			String line;
			List<pinjamanLunasHostModel> dataLunasHost = new ArrayList<>();
			
			while ((line = reader.readLine()) != null) {
			
				String ubah = line.replaceAll("_", ";");
	//			System.out.println(ubah);
				String[] data = ubah.split(";");
				
				if(data.length!=0) {
					String norekening = data[0];
					if(norekening.length() == 10){
						norekening = "0"+norekening;
					}
					
					String nopinj = data[1];
					String tglLunas = data[2];
					String kodeProduk = data[3];
					
					SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy"); 
					Date dateLunas = df.parse(tglLunas);
					
					SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					Date dateNow = new Date();
					
					pinjamanLunasHostModel lunasHostBaru = new pinjamanLunasHostModel();
					lunasHostBaru.setNO_REKENING(norekening);
					lunasHostBaru.setNO_PINJAMAN(nopinj);
					lunasHostBaru.setTGL_LUNAS(dateLunas);
					lunasHostBaru.setKODE_PRODUK(kodeProduk);
					lunasHostBaru.setDATE_CREATED(dateNow);
					lunasHostBaru.setCREATED_BY("SYSTEM");
					
					dataLunasHost.add(lunasHostBaru);
				}
			}
			System.out.println(dataLunasHost);
			repo.saveAll(dataLunasHost);
			reader.close();
	
			String fileExtension = "";
	        if (fileName.lastIndexOf(".") != -1) {
	            fileExtension = fileName.substring(fileName.lastIndexOf("."));
	        }
	
			String namaBaru = fileName.split("\\.")[0]+"_"+LocalDate.now()+fileExtension;
			String target = System.getProperty("user.dir") + "/src/main/resources/data" + File.separator + namaBaru;
			Path pathBaru = Paths.get(target);
			
			Files.move(src, pathBaru, StandardCopyOption.REPLACE_EXISTING);				
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
