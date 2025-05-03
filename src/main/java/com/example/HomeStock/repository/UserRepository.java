package com.example.HomeStock.repository;

import com.example.HomeStock.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.Optional;

/**
 * @AUTHOR : Dinusha Ariyarathna
 * @DATE : 5/1/2025
 * @PROJECT : HomeStock
 */
@Repository
public interface UserRepository extends CrudRepository<User, Integer>
{
    Optional<User> findByEmail(String email);
}
