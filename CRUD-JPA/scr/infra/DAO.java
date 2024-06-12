package infra;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class DAO<E> {
	private static EntityManagerFactory emf;
	private EntityManager em;
	private Class<E> classe;

  static{
    try{
      emf = Persistence.createEntityManagerFactory("exercicios-jpa");
    } catch (Exception e){
      
    }
  }

  public DAO(){
    this(null);
  }

  public DAO(Class<E> classe){
    this.classe = classe;
    em = emf.createEntityManager();
  }

  public DAO<E> openTransaction(){
    return em.getTransaction().beggin();
  }

  public DAO<E> closeTransaction(){
    return em.getTransaction().commit();
  }

  public DAO<E> insert(E entity){
    em.persist(entity);
    return this;
  }

  public DAO<E> insertAtomic(E entity){
    return this.openTransaction().insert(entity).closeTransaction();
  }

  public List<E> getAll(){
    return this.getAll(10, 0);
  }

  public List<E> getAll(int limit, int displacement){
    if(classe == null){
      throw new UnsupportedOperationException("Classe nula!");
    }

    String jpql = "SELECT e FROM" + classe.getNome() + " e";

    TypedQuery query = em.createQuery(jpql, classe.getNome());
    query.setMaxResults(limit);
    query.setFirstResult(displacement);

    return query.getResultList();
  }

  public DAO<E> update(E entity){
    em.merge(entity);
    return this;
  }

  public DAO<E> delete(E entity){
    em.remove(em.contains(entity) ? entity : em.merge(entity));
    return this;
  }

  public void close(){
    em.close();
    emf.close();
  }
}
