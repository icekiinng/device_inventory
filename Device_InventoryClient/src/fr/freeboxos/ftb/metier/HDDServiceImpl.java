/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.freeboxos.ftb.metier;

import fr.freeboxos.ftb.metier.entitys.HDD;
import java.util.List;
import lml.rest.client.ClientRest;

/**
 *
 * @author alan
 */
public class HDDServiceImpl extends ClientRest<HDD> implements HDDService {

    public HDDServiceImpl() {
        super.init("HDDService", new RestServerLocalConfiguration());
    }

    @Override
    public HDD add(HDD t) throws Exception {
        super.setPath("");
        return super.addEntity(t);
    }

    @Override
    public void remove(HDD t) throws Exception {
        super.setPath("");
        super.removeEntity(t);
    }

    @Override
    public void update(HDD t) throws Exception {
        super.setPath("");
        super.updateEntity(t);
    }

    @Override
    public HDD getById(Long l) throws Exception {
        super.setPath("" + l);
        return super.getEntity();
    }

    @Override
    public long getCount() throws Exception {
        super.setPath("Count");
        return super.getCountEntity();
    }

    @Override
    public List<HDD> getAll() throws Exception {
        super.setPath("");
        return super.getEntitys();
    }

    @Override
    public List<HDD> getAll(int i, int i1) throws Exception {
        super.setPath("" + i + "/" + i1);
        return super.getEntitys();
    }

}
