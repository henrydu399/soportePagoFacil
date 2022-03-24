/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.resuelva.soportepagofacil.controller;


import com.resuelva.soportepagofacil.dto.SoportePagoFacilDto;
import com.resuelva.soportepagofacil.entity.SoportePagoFacilEntity;
import com.resuelva.soportepagofacil.mapper.soportePagoFacilMapper;
import com.resuelva.soportepagofacil.repository.ISoportePagoFacilRepository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SoportePagoFacilController {
    @Value("${spring.application.name}")
    String appName;
    
    
    @Autowired
     ISoportePagoFacilRepository iSoportePagoFacilRepository;
    
    public List<String> listCanalIngreso;
    
    public List<String> listAsesor;
    
    public List<String> listComunicacionPara;
    
    public List<String> listCierreComunicacion;
    
    
    
    
    @GetMapping("/")
    public String greetingForm(Model model) {
    	
      String msj = "";
    	

      model = this.cargueData(model);
    		
      model.addAttribute("soportePagoFacilDto", new SoportePagoFacilDto());

      model.addAttribute("mensaje", msj);
      
      return "index";
    }

     @PostMapping("/")
    public String addUser( @ModelAttribute SoportePagoFacilDto soportePagoFacil, Model model) {
    	
        String msj = "";
    	 try {
    	        iSoportePagoFacilRepository.save(soportePagoFacilMapper.of(soportePagoFacil));
    	        
    	        msj = "Se ha guardado correctamente";
    	 }catch (Exception e) {
    		    msj = "ha ocurrido un error";
			e.printStackTrace();
		}
    	 
    	 model = this.cargueData(model);
    	 model.addAttribute("soportePagoFacilDto", new SoportePagoFacilDto());
    	 model.addAttribute("mensaje", msj);
        return "index";
    }
     
     
     private Model cargueData(Model model ) {
    	 
    	   	listCanalIngreso = new ArrayList<String>();
    	   	listCanalIngreso.add(null);
        	listCanalIngreso.add("Llamadas");
        	listCanalIngreso.add("Whatsapp");
        	listCanalIngreso.add("Presencial");
        	
        	listAsesor = new ArrayList<String>();
        	listAsesor.add("Mirley Parada");
        	listAsesor.add("Kimberly Hoyos");
        	
        	listComunicacionPara  = new ArrayList<String>();
        	listComunicacionPara.add("Soporte Técnico");
        	listComunicacionPara.add("Cargar Saldo");
        	listComunicacionPara.add("Soprte Plataforma");
        	listComunicacionPara.add("PQRS Servicio");
        	
        	listCierreComunicacion = new ArrayList<String>();
        	listCierreComunicacion.add("Soporte Realizado");
        	listCierreComunicacion.add("Escalado con el Aliado");
        	listCierreComunicacion.add("No Solucionado");
        	listCierreComunicacion.add("Volver a Llamar");
        	
         model.addAttribute("listCanalIngreso", listCanalIngreso);
         model.addAttribute("listAsesor", listAsesor);
         model.addAttribute("listComunicacionPara", listComunicacionPara);
         model.addAttribute("listCierreComunicacion", listCierreComunicacion);
    	 return model;
     }
}