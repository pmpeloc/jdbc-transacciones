package test;

import datos.PersonaJDBC;
import domain.Persona;
import java.util.List;

public class ManejoPersonas {
    public static void main(String[] args) {
        PersonaJDBC personaJDBC = new PersonaJDBC();
        List<Persona> personas = personaJDBC.select();
        
        for(Persona persona: personas) {
            System.out.println("Persona: " + persona);
        }
        
        /* Prueba INSERT
        Persona persona = new Persona();
        persona.setNombre("Misael");
        persona.setApellido("Peloc");
        persona.setEmail("misael@mail.com");
        persona.setTelefono("15421588");
        
        personaJDBC.insert(persona);
        */        
        /* Prueba UPDATE
        Persona persona = new Persona();
        persona.setId_persona(3);
        persona.setNombre("Pablo");
        persona.setApellido("Pelc");
        persona.setEmail("pmpeloc@mail.com");
        persona.setTelefono("12345552");
        
        personaJDBC.update(persona);
        */
        // Prueba ELIMINAR
        Persona persona = new Persona();
        persona.setId_persona(3);
        
        personaJDBC.delete(persona);
    }
}