package br.ufrj.coppe.laceo.AppLACEO.service;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import br.ufrj.coppe.laceo.AppLACEO.dto.output.MaterialBaseOutputDto;
import br.ufrj.coppe.laceo.AppLACEO.repository.MaterialBaseRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class MaterialBaseService {
	
	private MaterialBaseRepository materialBaseRepository;
	
//	public Page<MaterialBaseOutputDto> getMateriais()

}
