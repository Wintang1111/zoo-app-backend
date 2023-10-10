package net.wintang.zooapp.repository;

import net.wintang.zooapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUsername(String username);
    Boolean existsByUsername(String username);
    @Query(value = "select distinct u.id, u.username, u.password, u.lastname, u.firstname, u.sex, u.date_of_birth, u.address, u.nationality, u.phone, u.email from " +
            "[user] u left join user_role r on u.id=r.user_id " +
            "where r.role_id=:role", nativeQuery = true)
    List<User> findByRole(@Param("role") int roleId);
}
