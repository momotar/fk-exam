/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package momotar.fk.exam.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import momotar.fk.exam.entity.Teams;

/**
 *
 * @author Natsuki Hashimoto
 */
@Stateless
public class TeamsFacade extends AbstractFacade<Teams> {
    @PersistenceContext(unitName = "momotar_fk-exam_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TeamsFacade() {
        super(Teams.class);
    }
    
}
