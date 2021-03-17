/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.eatverygood.utils;

import com.example.eatverygood.models.Menu;
import com.example.eatverygood.models.Partenaire;
import com.example.eatverygood.models.Plats;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import javassist.expr.NewArray;
import org.assertj.core.util.Arrays;

/**
 *
 * @author mac
 */








public class TestHelper {
    
     // For ArrayList 
       public static  List<Plats> LIST_PLATS = new ArrayList<Plats>() {{ 
            add(
                Plats.builder()
                        .id(9L)
                        .name("Mafe")
                        .composition("tiguadeguer,patace,thiep")
                        .build() 
            ); 
            
            add(
                Plats.builder()
                        .id(10L)
                        .name("salade ordinnaire")
                        .composition("salade,tomate,pommedeterre,avocat,frommage,oeuf")
                        .build()
            ); 
        }};
    
       
       public static List<Menu> LIST_MENU = new ArrayList<Menu>() {{ 
            add(      
                Menu.builder()
                        .id(12L)
                        .build()
            );
            
            add(
                Menu.builder()
                        .plats(LIST_PLATS)
                        .build()   
            );
        }}; 
                
       
       public static List<Partenaire> LIST_PARTENAIRE = new ArrayList<Partenaire>() {{ 
            add(
                Partenaire.builder()
                        .id(1L)
                        .name("mouhamed")
                        .adresse("gibraltar")
                        .nameResto("monresto")
                        .phoneNumber(7777777L)
                        .build()
            );
       }};
                
}   



