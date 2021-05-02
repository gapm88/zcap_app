package cl.inacap.zCapModel.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import cl.inacap.zCapModel.dto.Juego;

/**
 * Session Bean implementation class JuegosDAO
 */
@Stateless
@LocalBean
public class JuegosDAO implements JuegosDAOLocal {

  
    private static List<Juego> juegos = new ArrayList<>();

	@Override
	public void save(Juego juego) {
		juegos.add(juego);
		
	}

	@Override
	public List<Juego> getAll() {
		// TODO Auto-generated method stub
		return juegos;
	}

	@Override
	public void delete(Juego juego) {
		// TODO Auto-generated method stub
		juegos.remove(juego);
	}

	@Override
	public List<Juego> filterByName(String nombre) {
		// TODO Auto-generated method stub
		return juegos.stream().filter(j->j.getNombre().contains(nombre)).collect(Collectors.toList());
	}

}
