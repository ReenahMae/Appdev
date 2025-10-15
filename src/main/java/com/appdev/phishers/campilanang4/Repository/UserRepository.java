package com.appdev.phishers.campilanang4.Repository;

import com.appdev.phishers.campilanang4.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
