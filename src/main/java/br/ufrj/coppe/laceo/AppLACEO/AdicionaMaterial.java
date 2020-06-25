package br.ufrj.coppe.laceo.AppLACEO;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import br.ufrj.coppe.laceo.AppLACEO.model.MaterialBase;
import br.ufrj.coppe.laceo.AppLACEO.repository.CabosAmarrasRepository;
import br.ufrj.coppe.laceo.AppLACEO.repository.MaterialBaseRepository;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class AdicionaMaterial {

	private static MaterialBaseRepository materialBaseRepository;
	
	public static void main(String[] args) {

/*
Nome    Peso Espec�fico(kgf/m3) Mod. Young(MPa) Coef de Poisson Tens�o de Escoamento(MPa)       Tens�o de Ruptura(MPa)
A�O     7850    205000  0.3     1179    1310
ACO_FI11        7850    205000  0.3     900     1000
ACO_FI41        7850    205000  0.3     1260    1400
AISI304 		1040    193000  0.3     30      30
ANTIWEAR        1041    345     0.3     30      30
DUPLEX2304      7850    194000  0.3     450     670
FITA    1300    350     0.3     900     1000
KEVLAR  1300    14000   0.3     310     310
POLIETILENO     1040    350     0.3     30      30
POLIPROPILENO   1040    630     0.3     30      30
RILSAN400TL     1040    215     0.3     30      30
RILSANP40TL     7850    345     0.3     682     758
*/
		List <MaterialBase> materiais = new ArrayList<MaterialBase>();
		
		MaterialBase[] material  = new MaterialBase[15];

       
		material[0] = new MaterialBase("ACO_FI11");
		material[0].setDescricao("ACO_FI11");
		material[0].setMassaespecifica(7850.0);
		material[0].setMod_elast_long(205000.00);
		material[0].setCoef_poisson(0.3);
		material[0].setTensaodeescoamento(900);
		material[0].setTensaoderuptura(1000);
		materiais.add(material[0]);
		
		material[1] = new MaterialBase("ACO_FI41");
		material[1].setDescricao("ACO_FI41");
		material[1].setMassaespecifica(7850.0);
		material[1].setMod_elast_long(205000.00);
		material[1].setCoef_poisson(0.3);
		material[1].setTensaodeescoamento(1260);
		material[1].setTensaoderuptura(1400);
		materiais.add(material[1]);
		
//		AISI304 		1040    193000  0.3     30      30
		material[2] = new MaterialBase("AISI304");
		material[2].setDescricao("AISI304");
		material[2].setMassaespecifica(7850.0);
		material[2].setMod_elast_long(193000.00);
		material[2].setCoef_poisson(0.3);
		material[2].setTensaodeescoamento(215);
		material[2].setTensaoderuptura(550);
		materiais.add(material[2]);
		
//		ANTIWEAR        1041    345     0.3     30      30
		material[3] = new MaterialBase("ANTIWEAR");
		material[3].setDescricao("ANTIWEAR");
		material[3].setMassaespecifica(1041.0);
		material[3].setMod_elast_long(345.00);
		material[3].setCoef_poisson(0.3);
		material[3].setTensaodeescoamento(30);
		material[3].setTensaoderuptura(30);
		materiais.add(material[3]);

//DUPLEX2304      7850    194000  0.3     450     670
		material[4] = new MaterialBase("DUPLEX2304");
		material[4].setDescricao("DUPLEX2304");
		material[4].setMassaespecifica(7850);
		material[4].setMod_elast_long(193000.0);
		material[4].setCoef_poisson(0.3);
		material[4].setTensaodeescoamento(450);
		material[4].setTensaoderuptura(670);
		materiais.add(material[4]);

//FITA    1300    350     0.3     900     1000
		material[5] = new MaterialBase("FITA");
		material[5].setDescricao("FITA");
		material[5].setMassaespecifica(1300);
		material[5].setMod_elast_long(350.0);
		material[5].setCoef_poisson(0.3);
		material[5].setTensaodeescoamento(900);
		material[5].setTensaoderuptura(1000);
		materiais.add(material[5]);

//KEVLAR  1300    14000   0.3     310     310
		material[6] = new MaterialBase("KEVLAR");
		material[6].setDescricao("KEVLAR");
		material[6].setMassaespecifica(1300);
		material[6].setMod_elast_long(14000.0);
		material[6].setCoef_poisson(0.3);
		material[6].setTensaodeescoamento(310);
		material[6].setTensaoderuptura(310);
		materiais.add(material[6]);

//POLIETILENO     1040    350     0.3     30      30
		material[7] = new MaterialBase("POLIETILENO");
		material[7].setDescricao("POLIETILENO");
		material[7].setMassaespecifica(1040);
		material[7].setMod_elast_long(310.0);
		material[7].setCoef_poisson(0.3);
		material[7].setTensaodeescoamento(30);
		material[7].setTensaoderuptura(30);
		materiais.add(material[7]);

//POLIPROPILENO   1040    630     0.3     30      30
		material[8] = new MaterialBase("POLIPROPILENO");
		material[8].setDescricao("POLIPROPILENO");
		material[8].setMassaespecifica(1040);
		material[8].setMod_elast_long(630.0);
		material[8].setCoef_poisson(0.3);
		material[8].setTensaodeescoamento(30);
		material[8].setTensaoderuptura(30);
		materiais.add(material[8]);

//RILSAN400TL     1040    215     0.3     30      30
		material[9] = new MaterialBase("RILSAN400TL");
		material[9].setDescricao("RILSAN400TL");
		material[9].setMassaespecifica(1040);
		material[9].setMod_elast_long(215.0);
		material[9].setCoef_poisson(0.3);
		material[9].setTensaodeescoamento(30);
		material[9].setTensaoderuptura(30);
		materiais.add(material[9]);

//RILSANP40TL     7850    345     0.3     682     758
		material[10] = new MaterialBase("RILSANP40TL");
		material[10].setDescricao("RILSANP40TL");
		material[10].setMassaespecifica(1156);
		material[10].setMod_elast_long(345.0);
		material[10].setCoef_poisson(0.3);
		material[10].setTensaodeescoamento(682);
		material[10].setTensaoderuptura(758);
		materiais.add(material[10]);
		
//A�O     7850    205000  0.3     1179    1310
		material[11] = new MaterialBase("ACO");
		material[11].setDescricao("ACO");
		material[11].setMassaespecifica(7850);
		material[11].setMod_elast_long(205000.0);
		material[11].setCoef_poisson(0.3);
		material[11].setTensaodeescoamento(1179);
		material[11].setTensaoderuptura(1310);
		materiais.add(material[11]);
		System.out.println("Cataloguei os materiais");
		
//		materialBaseRepository.save(material[0]);


		/*
		 * Session session = new HibernateUtil().getSession();
		 * session.beginTransaction(); for (int i=0; i<12; i++){
		 * session.save(material[i]); } session.getTransaction().commit();
		 * session.close();
		 */
	}
}
