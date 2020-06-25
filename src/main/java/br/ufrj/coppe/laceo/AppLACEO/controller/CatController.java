package br.ufrj.coppe.laceo.AppLACEO.controller;

/*
import br.com.alura.forum.annotation.ApiPageable;
import br.com.alura.forum.dto.input.TopicSearchDto;
import br.com.alura.forum.dto.output.TopicBriefOutputDto;
import br.com.alura.forum.service.TopicService;
*/
import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.ufrj.coppe.laceo.AppLACEO.dto.input.MaterialBaseInputDto;
import br.ufrj.coppe.laceo.AppLACEO.dto.output.CabosAmarrasOutputDto;
import br.ufrj.coppe.laceo.AppLACEO.dto.output.MaterialBaseOutputDto;
import br.ufrj.coppe.laceo.AppLACEO.model.MaterialBase;
import br.ufrj.coppe.laceo.AppLACEO.repository.CabosAmarrasRepository;
import br.ufrj.coppe.laceo.AppLACEO.repository.MaterialBaseRepository;

import java.util.ArrayList;
/*
import br.com.alura.forum.annotation.ApiPageable;
import br.com.alura.forum.dto.input.TopicSearchDto;
import br.com.alura.forum.dto.output.TopicBriefOutputDto;
import br.com.alura.forum.model.Category;
import br.com.alura.forum.model.Course;
import br.com.alura.forum.model.User;
import br.com.alura.forum.model.topic.domain.Topic;
import br.com.alura.forum.repository.TopicRepository;
import springfox.documentation.annotations.ApiIgnore;
*/
import java.util.Arrays;
import java.util.List;

import static br.ufrj.coppe.laceo.AppLACEO.dto.output.MaterialBaseOutputDto.listFromMateriais;
import static br.ufrj.coppe.laceo.AppLACEO.dto.output.CabosAmarrasOutputDto.listFromCabosAmarras;


@AllArgsConstructor
@RestController
public class CatController {


	private MaterialBaseRepository materialBaseRepository;
	private CabosAmarrasRepository cabosamarrasRepository;
	
	// json direto 
	@GetMapping(value = "api/teste", produces = MediaType.APPLICATION_JSON_VALUE)
	public MaterialBase listMateriaisBase() {
		MaterialBase material = new MaterialBase();
		material.setName("Qualquer");
		return material;
	}

//  passando pelo dto para customizar o json    
	@GetMapping(value = "api/testedto", produces = MediaType.APPLICATION_JSON_VALUE)
	public MaterialBaseOutputDto listMateriaisBaseDto() {
		MaterialBase material = new MaterialBase();
		material.setName("Qualquer");
		return new MaterialBaseOutputDto(material);
	}

	@GetMapping(value = "api/listamateriais", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<MaterialBaseOutputDto> materialBaseList(){
		return listFromMateriais( materialBaseRepository.findAll());		
	}

	@GetMapping(value = "api/listacabosamarras", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<CabosAmarrasOutputDto> cabosamarrasList(){
		return listFromCabosAmarras(cabosamarrasRepository.findAll());		
	}
	
	@PostMapping(value = "api/admaterial",consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity <?> createMaterialBase(@RequestBody MaterialBaseInputDto materialBaseInputDto) {
		MaterialBase material = new MaterialBase();
		material.setName(materialBaseInputDto.getName());
		this.materialBaseRepository.save(material);
		return ResponseEntity.ok(new MaterialBaseOutputDto(material));		
	}

	

}