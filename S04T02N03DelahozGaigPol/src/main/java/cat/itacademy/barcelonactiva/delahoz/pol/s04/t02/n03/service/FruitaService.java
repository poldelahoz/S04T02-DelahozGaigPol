package cat.itacademy.barcelonactiva.delahoz.pol.s04.t02.n03.service;

import java.util.List;

import cat.itacademy.barcelonactiva.delahoz.pol.s04.t02.n03.domain.Fruita;
import cat.itacademy.barcelonactiva.delahoz.pol.s04.t02.n03.exception.SequenceException;

public interface FruitaService {
	
	Fruita saveFruita(Fruita fruita) throws SequenceException;
	  
    Fruita updateDepartment(Fruita fruita);
  
    void deleteById(long fruitaId);
  
    Fruita getFruita(long fruitaId);
  
    List<Fruita> getFruitaList();
    
}
