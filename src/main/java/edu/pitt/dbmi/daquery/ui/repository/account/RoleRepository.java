package edu.pitt.dbmi.daquery.ui.repository.account;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.pitt.dbmi.daquery.ui.model.account.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
