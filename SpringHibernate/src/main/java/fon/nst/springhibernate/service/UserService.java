package fon.nst.springhibernate.service;

import fon.nst.springhibernate.domain.User;


public interface UserService {
	User add(User user) throws Exception;
    void delete(Long userId) throws Exception;
    User update(Long userId, String firstName, String lastName, String username, String password)throws Exception;
}
