package com.learning.userauthentication.data;

import com.learning.userauthentication.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
