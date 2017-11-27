package com.kvlt.cloud.reposistory;

import com.kvlt.cloud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * com.kvlt.cloud.reposistory.UserRepository
 *
 * @author KVLT
 * @date 2017-11-26.
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
