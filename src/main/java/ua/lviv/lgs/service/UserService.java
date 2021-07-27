package ua.lviv.lgs.service;

import ua.lviv.lgs.domain.User;
import ua.lviv.lgs.shared.AbstructCRUD;

public interface UserService extends AbstructCRUD<User> {
    User getUserByEmail(String email);
}
