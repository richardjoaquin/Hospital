package com.hampcode.business;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import com.hampcode.dto.MedicalConsultationExamDto;
import com.hampcode.model.entity.MedicalConsultation;
import com.hampcode.model.repository.ConsultationExamRepository;
import com.hampcode.model.repository.MedicalConsultationRepository;


@Named
public class MedicalConsultationBusiness  implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private MedicalConsultationRepository medicalConsultationRepository;
	
	@Inject
	private ConsultationExamRepository consultationExamenRepository;
	
	@Transactional
	public MedicalConsultation insertMedicalConsultation(MedicalConsultationExamDto medicalConsultationDto) throws Exception {
		
		
		return null;
		
	}
	
	
	
	public List<MedicalConsultation> getAllMedicalConsultation()throws Exception{
		
		return null;
	}
	

}
