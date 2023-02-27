package cat.itacademy.barcelonactiva.delahoz.pol.s04.t02.n03.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import cat.itacademy.barcelonactiva.delahoz.pol.s04.t02.n03.domain.Fruita;

public interface FruitaRepository extends MongoRepository<Fruita, Long> {
	
}
