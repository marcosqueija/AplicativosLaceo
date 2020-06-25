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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
	
	@GetMapping(value = "api/teste", produces = MediaType.APPLICATION_JSON_VALUE)
	public MaterialBase listMateriaisBase() {
		MaterialBase material = new MaterialBase();
		material.setNome("Qualquer");
		return material;
	}

	@GetMapping(value = "api/testedto", produces = MediaType.APPLICATION_JSON_VALUE)
	public MaterialBaseOutputDto listMateriaisBaseDto() {
		MaterialBase material = new MaterialBase();
		material.setNome("Qualquer");
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

	
	/*	@Autowired
	public CatController(TopicRepository topicRepository) {
		this.topicRepository = topicRepository;
	}
//  passando pelo dto para customizar o json    
	@GetMapping(value = "/api/topics", produces = MediaType.APPLICATION_JSON_VALUE)
	public Page<TopicBriefOutputDto> listTopics(TopicSearchDto topicSearch, Pageable pageRequest) {
		Specification<Topic> topicSearchSpecification = topicSearch.toSpecification();
		Page<Topic> topics = this.topicRepository.findAll(topicSearchSpecification, pageRequest);
		return  TopicBriefOutputDto.listFromTopics(topics);
	}

	// json direto 
  	@GetMapping(value = "/api/topicsold", produces = MediaType.APPLICATION_JSON_VALUE) 
	public List<TopicBriefOutputDto> topicList() {
		return listFromTopics(topicRepository.findAll());
	}

  	//  opcao de acessar o servico de procura por categoria - retorna uma lista com paginacao  	
    @GetMapping(value="/api/search")
    @ApiPageable
    public Page<TopicBriefOutputDto> listarPorStatusCategoria(TopicSearchDto topicSearchDto, @ApiIgnore Pageable pageable) {
        Page<Topic> topicos = topicRepository.findAll(topicSearchDto.toSpecification(), pageable);
        return listFromTopics(topicos);
    }
/*
	
	@GetMapping(value = "api/teste_dto", produces = MediaType.APPLICATION_JSON_VALUE)
	public TopicBriefOutputDto listTopicsdto() {
		Category subcategory = new Category("Java", new Category("Programação"));
		Course course = new Course("Java e JSF", subcategory);
		Topic topic = new Topic("Problemas com o JSF", "Erro ao fazer conversão da data x",
				new User("Fulano", "fulano@gmail.com", "123456"), course);
		return new TopicBriefOutputDto(topic);
	}
*/
}