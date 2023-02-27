package cat.itacademy.barcelonactiva.delahoz.pol.s04.t02.n03.service;

import java.util.List;

import cat.itacademy.barcelonactiva.delahoz.pol.s04.t02.n03.domain.Fruita;

public interface FruitaService {
	
    Fruita saveFruita(Fruita fruita);
  
    Fruita updateFruita(Fruita fruita);
  
    void deleteById(Long fruitaId);
  
    Fruita getFruita(Long fruitaId);
  
    List<Fruita> getFruitaList();
    
}
