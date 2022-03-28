/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.resuelva.soportepagofacil.controller;



import com.resuelva.soportepagofacil.dto.SoportePagoFacilDto;
import com.resuelva.soportepagofacil.entity.SoportePagoFacilEntity;
import com.resuelva.soportepagofacil.mapper.soportePagoFacilMapper;
import com.resuelva.soportepagofacil.repository.ISoportePagoFacilRepository;

import javassist.expr.NewArray;

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
    
    
	/*
	 * 
	 * @GetMapping("/list") public String greetingForm(Model model) {
	 * 
	 * String msj = "";
	 * 
	 * 
	 * model = this.cargueData(model);
	 * 
	 * model.addAttribute("soportePagoFacilDto", new SoportePagoFacilDto());
	 * 
	 * model.addAttribute("mensaje", msj);
	 * 
	 * model.addAttribute("list", GetListSoportePagoFacil());
	 * 
	 * return "index"; }
	 */
    
    @GetMapping("/save")
    public String saveGet(Model model) {
    	
      String msj = "";
    	

      model = this.cargueData(model);
    		
      model.addAttribute("soportePagoFacilDto", new SoportePagoFacilDto());

      model.addAttribute("mensaje", msj);
      
      model.addAttribute("list", GetListSoportePagoFacil());
      
      return "save";
    }

     @PostMapping("/save")
    public String addUser( @ModelAttribute SoportePagoFacilDto soportePagoFacil, Model model) {
    	 
    	 if( model == null) {
    		 return "save";
    	 }
    	
        String msj = "";
    	 try {
    		 if( soportePagoFacil.getTelefono()!= null || !soportePagoFacil.getTelefono().isEmpty()) {
     	        iSoportePagoFacilRepository.save(soportePagoFacilMapper.of(soportePagoFacil));   
     	        msj = "Se ha guardado correctamente";
    	 }else {
    		 msj = " ha dejado campos vacios";
    	 }

    	 }catch (Exception e) {
    		    msj = "ha ocurrido un error";
			e.printStackTrace();
		}
    	 
    	 model = this.cargueData(model);
    	 model.addAttribute("soportePagoFacilDto", new SoportePagoFacilDto());
    	 model.addAttribute("list", GetListSoportePagoFacil());
    	 model.addAttribute("mensaje", msj);
        return "save";
    }
     
    private List<SoportePagoFacilDto> GetListSoportePagoFacil() {
    	
    	List<SoportePagoFacilDto> listOut =  new ArrayList<SoportePagoFacilDto>(); 
    	List<SoportePagoFacilEntity> list= iSoportePagoFacilRepository.findAll();
    	for( SoportePagoFacilEntity e : list) {
    		listOut.add(soportePagoFacilMapper.of(e) );
    	}
    	return listOut;
    	
    }
     
     
     private Model cargueData(Model model ) {
    	 
    	   	listCanalIngreso = new ArrayList<String>();
    	   	listCanalIngreso.add(null);
        	listCanalIngreso.add("Llamadas");
        	listCanalIngreso.add("Whatsapp");
        	listCanalIngreso.add("Presencial");
        	
        	listAsesor = new ArrayList<String>();
        	listAsesor.add(null);
        	listAsesor.add("Mirley Parada");
        	listAsesor.add("Kimberly Hoyos");
        	
        	listComunicacionPara  = new ArrayList<String>();
        	listComunicacionPara.add(null);
        	listComunicacionPara.add("Soporte Técnico");
        	listComunicacionPara.add("Cargar Saldo");
        	listComunicacionPara.add("Soprte Plataforma");
        	listComunicacionPara.add("PQRS Servicio");
        	
        	listCierreComunicacion = new ArrayList<String>();
        	listCierreComunicacion.add(null);
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