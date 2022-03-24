package com.resuelva.soportepagofacil.dto;



public class SoportePagoFacilDto {

	
	
	    private String canalIngreso;

	    private String telefono;
	 
	    private String asesor;
	
	    private String comunicacionPara;
	  
	    private String cierreComunicacion;
	 
	    private String observacion;
	
	    private Long id;
	    
	    
	    public SoportePagoFacilDto() {
	
		}
	    

		public SoportePagoFacilDto(String canalIngreso, String telefono, String asesor, String comunicacionPara,
				String cierreComunicacion, String observacion, Long id) {
			super();
			this.canalIngreso = canalIngreso;
			this.telefono = telefono;
			this.asesor = asesor;
			this.comunicacionPara = comunicacionPara;
			this.cierreComunicacion = cierreComunicacion;
			this.observacion = observacion;
			this.id = id;
		}

		public String getCanalIngreso() {
			return canalIngreso;
		}

		public void setCanalIngreso(String canalIngreso) {
			this.canalIngreso = canalIngreso;
		}

		public String getTelefono() {
			return telefono;
		}

		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}

		public String getAsesor() {
			return asesor;
		}

		public void setAsesor(String asesor) {
			this.asesor = asesor;
		}

		public String getComunicacionPara() {
			return comunicacionPara;
		}

		public void setComunicacionPara(String comunicacionPara) {
			this.comunicacionPara = comunicacionPara;
		}

		public String getCierreComunicacion() {
			return cierreComunicacion;
		}

		public void setCierreComunicacion(String cierreComunicacion) {
			this.cierreComunicacion = cierreComunicacion;
		}

		public String getObservacion() {
			return observacion;
		}

		public void setObservacion(String observacion) {
			this.observacion = observacion;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}
	    
	    
	    
	
}
