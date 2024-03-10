package com.fabio2g.snaporder.repositories;

import com.fabio2g.snaporder.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
