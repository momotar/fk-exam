/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package momotar.fk.exam.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import momotar.fk.exam.entity.Players;

/**
 *
 * @author Natsuki Hashimoto
 */
@Stateless
public class PlayersFacade extends AbstractFacade<Players> {
    @PersistenceContext(unitName = "momotar_fk-exam_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PlayersFacade() {
        super(Players.class);
    }
    
}
