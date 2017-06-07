package edu.pitt.dbmi.daquery.ui.service.user;

import edu.pitt.dbmi.daquery.ui.model.account.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
