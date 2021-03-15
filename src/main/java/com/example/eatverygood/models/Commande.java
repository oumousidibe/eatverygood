package com.example.eatverygood.models;
import javax.annotation.*;
import com.fasterxml.jackson.core.SerializableString;
import lombok.*;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 
 * @author mac oumou
 */

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Commande implements Serializable{
    
        @Id
        @GeneratedValue ( strategy = GenerationType.IDENTITY )
    private Long id;
    private String name;
    private String description;
    private Long montant;
    private Date dateCommande;
    private Long etatCommande;
}