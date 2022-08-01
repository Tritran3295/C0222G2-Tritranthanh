package com.music.repository.Impl;

import com.music.model.Music;
import com.music.repository.IMusicRepository;
import com.music.repository.connection.ConnectionUtil;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.List;
@Transactional
@Repository
public class MusicRepositoryImpl implements IMusicRepository {
    @Override
    public List<Music> selectAll() {
        TypedQuery<Music> query = ConnectionUtil.entityManager.createQuery("select s from Music s", Music.class);
        return query.getResultList();
    }

    @Override
    public void save(Music music) {
        EntityTransaction entityTransaction = ConnectionUtil.entityManager.getTransaction();
        entityTransaction.begin();
        try{
            ConnectionUtil.entityManager.persist(music);
            entityTransaction.commit();
        }catch (Exception e){
            entityTransaction.rollback();
        }
    }

    @Override
    public Music findById(int id) {
        TypedQuery<Music> query = ConnectionUtil.entityManager.createQuery("select s from Music s where s.id=:id", Music.class);
        query.setParameter("id", id);
        try {
            return query.getSingleResult();
        } catch (NoResultException e){
            return null;
        }

    }

    @Override
    public void update(Music music) {
        EntityTransaction entityTransaction = ConnectionUtil.entityManager.getTransaction();
        entityTransaction.begin();
        try {
            ConnectionUtil.entityManager.merge(music);
            entityTransaction.commit();
        } catch (Exception e) {
            entityTransaction.rollback();
        }
    }

    @Override
    public void remove(int id) {
        EntityTransaction entityTransaction = ConnectionUtil.entityManager.getTransaction();
        entityTransaction.begin();
        try {
            ConnectionUtil.entityManager.remove(ConnectionUtil.entityManager.find(Music.class,id));
            entityTransaction.commit();
        } catch (Exception e) {
            entityTransaction.rollback();
        }
    }

}
