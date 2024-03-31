package org.humber.project.repositories;

import org.humber.project.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByName(String name);

}
