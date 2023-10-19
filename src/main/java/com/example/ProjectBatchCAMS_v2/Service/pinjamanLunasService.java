package com.example.ProjectBatchCAMS_v2.Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.PreparedStatement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ProjectBatchCAMS_v2.Model.pinjamanLunasModel;
import com.example.ProjectBatchCAMS_v2.Repository.pinjamanLunasRepo;

@Service
public class pinjamanLunasService {
	@Autowired
	private pinjamanLunasRepo repo;
	
	public  void insertPinjamanLunas() throws ParseException {
	String fileName = "LUNASUBK.TXT";
	String pathFile = System.getProperty("user.dir") + "/src/main/resources/data" + File.separator + fileName;
	Path src = Paths.get(pathFile);
	
	try(BufferedReader reader = new BufferedReader(new FileReader(pathFile))) {
		String line;
		List<pinjamanLunasModel> dataLunas = new ArrayList<>();
		
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
				String tgllunas = data[2];
				
				SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy"); 
				Date dateLunas = df.parse(tgllunas);
				
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				Date dateNow = new Date();
				
				pinjamanLunasModel lunasBaru = new pinjamanLunasModel();
				lunasBaru.setNO_REKENING(norekening);
				lunasBaru.setNO_PINJAMAN(nopinj);
				lunasBaru.setIS_SKL_PRINTED('0');
				lunasBaru.setIS_ROYA_PRINTED('0');
				lunasBaru.setIS_TTJ_PRINTED('0');
				lunasBaru.setIS_SPAJ_PRINTED('0');
				lunasBaru.setDATE_CR_END(dateLunas);
				lunasBaru.setDATE_DOWNLOADED(dateNow);
				lunasBaru.setTDL_DONE('0');
				
				
				dataLunas.add(lunasBaru);
			}
		}
		System.out.println(dataLunas);
		repo.saveAll(dataLunas);
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
