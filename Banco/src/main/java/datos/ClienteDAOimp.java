package datos;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import models.Cliente;

@Stateless
public class ClienteDAOimp implements ClienteDAO{
    
    @PersistenceContext(unitName = "BANCO-PU")
    EntityManager em;
    
    @Override
    public Cliente getCliente(Cliente cliente) {
        return em.find(Cliente.class, cliente.getRut());
    }

    @Override
    public Cliente getClienteByRut(Cliente cliente) {
        
        try {
            Query query = em.createQuery("from Cliente u where u.rut = :rut");
            query.setParameter("rut", cliente.getRut());
            return (Cliente) query.getSingleResult();
        } catch (NoResultException e) {
            return null;
            
        }
        
    }
}
