package cat.itacademy.barcelonactiva.delahoz.pol.s04.t02.n01.S04T02N01DelahozGaigPol.model.services;

import java.util.List;

import cat.itacademy.barcelonactiva.delahoz.pol.s04.t02.n01.S04T02N01DelahozGaigPol.model.domain.Fruita;

public interface FruitaService {
	
    Fruita saveFruita(Fruita fruita);
  
    Fruita updateDepartment(Fruita fruita);
  
    void deleteById(Long fruitaId);
  
    Fruita getFruita(Long fruitaId);
  
    List<Fruita> getFruitaList();
    
}
