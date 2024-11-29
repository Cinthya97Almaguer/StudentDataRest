/**
 * 
 */
package edu.itq.soa.rest;

import java.util.List;
import java.util.function.Consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.itq.soa.dto.Student;
import edu.itq.soa.service.StudentService;

/**
 * 
 */
@RestController
@RequestMapping("/usuarios")
public class StudentRest {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getStudents() {
        return studentService.getUsuarios();
    }

//    @PostMapping
//    public Student crearUsuario(@RequestBody Student usuario) {
//        studentService.createUsuario(usuario);
//        return usuario;
//    }
//
//    @PutMapping("/{id}")
//    public Student updateUsuario(@PathVariable Integer id, @RequestBody Student usuario) {
//        studentService.readUsuarioById(id).ifPresent(u -> {
//            u.setLogin(usuario.getLogin());
//            u.setPassword(usuario.getPassword());
//            studentService.createUsuario(u);
//        });
//        return usuario;
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteUsuario(@PathVariable Integer id) {
//        studentService.readUsuarioById(id).ifPresent(u -> {
//            studentService.deleteUsuario(u);
//        });
//        return new ResponseEntity<>(HttpStatus.OK);
//    }
}

