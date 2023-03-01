package cat.itacademy.barcelonactiva.delahoz.pol.s04.t02.n03.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Fruita")
public class Fruita {
	
	@Id
	private long id;
	
	private String nom;
	
	private int quantitatQuilos;
	
}
