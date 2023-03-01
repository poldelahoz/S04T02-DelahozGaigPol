package cat.itacademy.barcelonactiva.delahoz.pol.s04.t02.n02.S04T02N02.service;

import java.util.List;

import cat.itacademy.barcelonactiva.delahoz.pol.s04.t02.n02.S04T02N02.domain.Fruita;

public interface FruitaService {
	
    Fruita saveFruita(Fruita fruita);
  
    Fruita updateDepartment(Fruita fruita);
  
    void deleteById(Long fruitaId);
  
    Fruita getFruita(Long fruitaId);
  
    List<Fruita> getFruitaList();
    
}
