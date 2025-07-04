package com.fortune.fortune.repository;

import com.fortune.fortune.domain.User;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

//JPA 내부 핵심인 EntityManager를 직접 사용하고, Spring Data JPA의 자동 구현은 안 쓴 방식.
@Repository
public class UserRepository {

    private final EntityManager em;

    public UserRepository(EntityManager em){
        this.em = em;
    }

    public User findOne(UUID id) {
        return em.find(User.class, id);
    }

    public User findByEmail(String email){
        return em.find(User.class, email);
    }

    public List<User> findAll() {
        return em.createQuery("Select u from User u", User.class).getResultList();
    }
}
