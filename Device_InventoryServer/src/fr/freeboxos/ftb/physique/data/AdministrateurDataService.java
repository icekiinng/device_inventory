/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.freeboxos.ftb.physique.data;

import fr.freeboxos.ftb.metier.entitys.Administrateur;
import java.util.List;
import lml.persistence.CrudService;

/**
 *
 * @author alan
 */
public interface AdministrateurDataService extends CrudService<Administrateur> {

    public Administrateur getByLogin(String login) throws Exception;

}
