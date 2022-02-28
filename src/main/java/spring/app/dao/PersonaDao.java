package spring.app.dao;

import org.springframework.data.repository.CrudRepository;

import spring.app.entity.Persona;

//Importa todas las conexiones DAO de un repositorio, como Modificar,
//Crear y Eliminar en la base de datos.

//Se especifica el objeto a buscar, y su ID (en este caso es de Long).
public interface PersonaDao extends CrudRepository<Persona, Long> {

}
