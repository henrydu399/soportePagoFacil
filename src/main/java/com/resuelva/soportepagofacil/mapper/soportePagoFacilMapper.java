package com.resuelva.soportepagofacil.mapper;


import com.resuelva.soportepagofacil.dto.SoportePagoFacilDto;
import com.resuelva.soportepagofacil.entity.SoportePagoFacilEntity;

public class soportePagoFacilMapper {
	
	public static SoportePagoFacilEntity  of(SoportePagoFacilDto d) {
		SoportePagoFacilEntity e =  new SoportePagoFacilEntity();
		if( d.getAsesor() != null && !d.getAsesor().isEmpty()) 
			e.setAsesor(d.getAsesor());
		
		if( d.getTelefono() != null && !d.getTelefono().isEmpty()) 
		  e.setTelefono(d.getTelefono());
		
		if( d.getCanalIngreso() != null && !d.getCanalIngreso().isEmpty()) 
			e.setCanalIngreso(d.getCanalIngreso());
		
		if( d.getCierreComunicacion() != null && !d.getCierreComunicacion().isEmpty()) 
			e.setCierreComunicacion(d.getCierreComunicacion());
		
		if( d.getComunicacionPara() != null && !d.getComunicacionPara().isEmpty()) 
			e.setComunicacionPara(d.getComunicacionPara());
		
		if( d.getObservacion() != null && !d.getObservacion().isEmpty()) 
			e.setObservacion(d.getObservacion());
		
		return e;
	}
	
	
	public static SoportePagoFacilDto   of( SoportePagoFacilEntity e) {
		SoportePagoFacilDto d =  new SoportePagoFacilDto();
		
		if( e.getId() != null) 
			d.setId(  e.getId() );
		
		if( e.getAsesor() != null && !e.getAsesor().isEmpty()) 
			d.setAsesor(e.getAsesor());
		
		if( e.getCanalIngreso() != null && !e.getCanalIngreso().isEmpty()) 
			d.setCanalIngreso(e.getCanalIngreso());
		
		if( e.getCierreComunicacion() != null && !e.getCierreComunicacion().isEmpty()) 
			d.setCierreComunicacion(e.getCierreComunicacion());
		
		if( e.getComunicacionPara() != null && !e.getComunicacionPara().isEmpty()) 
			d.setComunicacionPara(e.getComunicacionPara());
		
		if( e.getObservacion() != null && !e.getObservacion().isEmpty()) 
			d.setObservacion(e.getObservacion());
		
		return d;
	}

}
