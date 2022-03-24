

package com.resuelva.soportepagofacil.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.resuelva.soportepagofacil.entity.SoportePagoFacilEntity;

@Repository
public interface ISoportePagoFacilRepository  extends JpaRepository<SoportePagoFacilEntity, Long>{
    
    
    
}
