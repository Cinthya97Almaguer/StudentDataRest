/**
 * 
 */
package edu.itq.soa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.itq.soa.dto.Student;
import edu.itq.soa.repository.UsuarioRepository;

/**
 * Capa de negocio para los usuarios.
 */
@Service
public class StudentService {
    @Autowired
    UsuarioRepository usuarioRepository;

    /**
     * Consulta todos los usuarios registrados.
     * @return Lista de usuarios.
     */
    public List<Student> getStudents() {
        return usuarioRepository.findAll();
    }

    /**
     * Consulta todos los usuarios registrados.
     * @return Lista de usuarios.
     */
    public Optional<Student> readUsuarioById(Integer id) {
        return usuarioRepository.findById(id);
    }

    /**
     * Crea un nuevo usuario.
     * @param usuario Datos del usuario a crear.
     * @return Usuario creado.
     */
    public Student createUsuario(Student usuario) {
        return usuarioRepository.save(usuario);
    }

    /**
     * Borra un usuario.
     * @param usuario Usuario a borrar.
     */
    public void deleteUsuario(Student usuario) {
        usuarioRepository.delete(usuario);
    }
}
