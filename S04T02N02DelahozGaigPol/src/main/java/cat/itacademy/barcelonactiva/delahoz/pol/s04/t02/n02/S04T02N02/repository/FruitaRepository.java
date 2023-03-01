package cat.itacademy.barcelonactiva.delahoz.pol.s04.t02.n02.S04T02N02.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cat.itacademy.barcelonactiva.delahoz.pol.s04.t02.n02.S04T02N02.domain.Fruita;

@Repository
public interface FruitaRepository  extends JpaRepository<Fruita, Long> {
    
}
