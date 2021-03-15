package com.example.eatverygood.models;
import javax.annotation.*;
import com.fasterxml.jackson.core.SerializableString;
import lombok.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

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
public class Partenaire implements Serializable{
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY )
    private Long id;
    private String name;
    private String adresse;
    private String nameResto;
    private Long phoneNumber;
    private Date  timeToOpen;
    private Date  timeToClose;
    @OneToMany
    private List <Menu> menu;
    @OneToMany
    private List <Commande> commande;
}
