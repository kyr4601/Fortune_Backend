package com.fortune.fortune.repository;

import com.fortune.fortune.domain.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class UserRepository {

    private final EntityManager em;

    public UserRepository(EntityManager em){
        this.em = em;
    }

    public void save(User user) {
        em.persist(user);
    }

    public User findOne(UUID id) {
        return em.find(User.class, id);
    }

    public List<User> findAll() {
        return em.createQuery("Select u from User u", User.class).getResultList();
    }
}
