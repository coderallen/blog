package com.ca.blog.repository;

import com.ca.blog.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Created by Allen on 03/04/2017.
 * coder.allen@hotmail.com
 */

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    Page<User> findAllByUsernameIsNotNull(Pageable pageable);

    Page<User> findUserByUsernameIsNotNullAndDeptIsNotNull(Pageable pageable);

    @Query("select u from User u")
    Page<User> findUser(Pageable pageable);

}
