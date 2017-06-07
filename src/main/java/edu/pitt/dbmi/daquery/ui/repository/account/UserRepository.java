package edu.pitt.dbmi.daquery.ui.repository.account;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.pitt.dbmi.daquery.ui.model.account.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
