package com.example.eatverygood.models;
import javax.annotation.*;
import com.fasterxml.jackson.core.SerializableString;
import lombok.*;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
/**
 *
 * @author mac
 */
public class Plats implements Serializable{
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY )
    private Long id;
    private String composition;
    private String name;
    
}
