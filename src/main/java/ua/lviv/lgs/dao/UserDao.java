package ua.lviv.lgs.dao;

import ua.lviv.lgs.domain.User;
import ua.lviv.lgs.shared.AbstructCRUD;

public interface UserDao extends AbstructCRUD<User> {
    User getUserByEmail(String email);
}
