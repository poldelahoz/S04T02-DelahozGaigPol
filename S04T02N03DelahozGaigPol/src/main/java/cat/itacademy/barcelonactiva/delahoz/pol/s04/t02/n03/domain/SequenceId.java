package cat.itacademy.barcelonactiva.delahoz.pol.s04.t02.n03.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "sequence")
public class SequenceId {

	@Id
	private String id;

	private long seq;
	
}
