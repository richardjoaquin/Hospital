package com.hampcode.model.repository;

import java.io.Serializable;

import java.util.List;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import com.hampcode.model.entity.MedicalConsultation;



@Named
public class MedicalConsultationRepository implements Serializable {

	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "pwPU")
	private EntityManager em;

	public Integer insert(MedicalConsultation medicalConsultation) throws Exception {
		
		return 1;
	}
	
	
	public List<MedicalConsultation> findAll() throws Exception {
		return null;
	}

}
