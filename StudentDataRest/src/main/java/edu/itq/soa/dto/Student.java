package edu.itq.soa.dto;

import com.google.gson.Gson;

import org.springframework.data.annotation.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * DTO para estudiantes. A diferencia de un ORM (Object Relational Mapping) como Hibernate,
 * Spring Data JDBC No mapea explícitamente las clases a las tablas de la base de datos.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student { // usuario_streaming
    @Id
    private Integer id;
    
    private String nombre;

    private String semestre;

    /** Representación en formato JSON del objeto actual. */
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
