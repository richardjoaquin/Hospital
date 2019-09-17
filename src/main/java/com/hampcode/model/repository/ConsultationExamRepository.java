package com.hampcode.model.repository;
import java.io.Serializable;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;



@Named
public class ConsultationExamRepository implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName = "pwPU")
	private EntityManager em;
	
	
	public Integer insert(Integer medicalConsultationId,Integer medicalExamId) throws Exception {
		
		
		return 1;
		
	}



}
