package spring.app;

import spring.app.dao.PersonaDao;
import spring.app.entity.Persona;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


//Idea: buscar objetos pers. de la tabla MySQL y enlistarlos en la pag.

@Controller
public class ControladorInicio {

	@Autowired
	private PersonaDao personaDao;

	@GetMapping("/")
	public String inicio(Model model) {

		// "var" Es de tipo lista.
		Iterable<Persona> personas = personaDao.findAll(); // Metodo para buscar todos los objetos personas.
		model.addAttribute("personas", personas);
		return "index";
	}
}
