package com.product.repository.Impl;
import com.product.model.Product;
import com.product.repository.IProductRepository;
import com.product.repository.connection.ConnectionUtil;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;
@Transactional
@Repository
public class ProductRepositoryImpl implements IProductRepository {
    @Override
    public List<Product> selectAll() {
        TypedQuery<Product> query = ConnectionUtil.entityManager.createQuery("select p from Product p",Product.class);
        return query.getResultList();
    }

    @Override
    public void save(Product product) {
        EntityTransaction entityTransaction = ConnectionUtil.entityManager.getTransaction();
        entityTransaction.begin();
        try {
            ConnectionUtil.entityManager.persist(product);
            entityTransaction.commit();
        }catch (Exception e){
            entityTransaction.rollback();
        }
    }

    @Override
    public Product findById(int id) {
        return ConnectionUtil.entityManager.find(Product.class,id);
    }

    @Override
    public void edit(Product product) {
        EntityTransaction entityTransaction = ConnectionUtil.entityManager.getTransaction();
        entityTransaction.begin();
        try{
            ConnectionUtil.entityManager.merge(product);
            entityTransaction.commit();
        }catch (Exception e){
            entityTransaction.rollback();
        }
    }

    @Override
    public void delete(int id) {
        EntityTransaction entityTransaction = ConnectionUtil.entityManager.getTransaction();
        entityTransaction.begin();
        try {
            ConnectionUtil.entityManager.remove(ConnectionUtil.entityManager.find(Product.class,id));
            entityTransaction.commit();
        }catch (Exception e){
            entityTransaction.rollback();
        }
    }

    @Override
    public List<Product> findByName(String search) {
        TypedQuery<Product> query = ConnectionUtil.entityManager.createQuery("select p from Product p where nameProduct like:searchValue",Product.class);
        query.setParameter("searchValue","%" + search + "%");
        return query.getResultList();
    }


}
