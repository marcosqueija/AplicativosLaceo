package br.ufrj.coppe.laceo.AppLACEO.dto.output;

import java.util.List;
import java.util.stream.Collectors;

import br.ufrj.coppe.laceo.AppLACEO.model.CabosAmarras;
import lombok.Data;

@Data
public class CabosAmarrasOutputDto {
	
	private String ownerName;
	
	public CabosAmarrasOutputDto(CabosAmarras caboamarra) {
		this.ownerName=caboamarra.getNome();
	}
	
	public static List< CabosAmarrasOutputDto> listFromCabosAmarras(List<CabosAmarras> cabosamarras){
		return cabosamarras.stream()
				.map(CabosAmarrasOutputDto::new)
				.collect(Collectors.toList());		       
	}


}
