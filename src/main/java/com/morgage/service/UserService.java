package com.morgage.service;


import com.morgage.common.Const;
import com.morgage.model.User;
import com.morgage.model.UserDetail;
import com.morgage.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
public class UserService implements UserDetailsService {

    @PersistenceContext
    private final EntityManager em;
    @Autowired
    private final UserRepository userRepository;

    public UserService(EntityManager em, UserRepository userRepository) {
        this.em = em;
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        String encryptedPassword = new BCryptPasswordEncoder().encode("1");
//        Role role= new Role();
//        role.setId(1);
//        role.setRoleName("ROLE_USER");
//User user1 = new User();
//user1.setPassword(encryptedPassword);
//user1.setRole(role);
//user1.setUserName("1");
//user1.setStatus(null);
//userRepository.saveAndFlush(user1);
        User user = userRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found!");
        }
        UserDetail userDetail = getUserDetailFromUser(user);
        return userDetail;
    }

    private UserDetail getUserDetailFromUser(User user) {
        UserDetail userDetail = new UserDetail();
//        userDetail.setId(user.get());
//        userDetail.setRole(user.getRoleId());
        userDetail.setStatus(user.getStatus());
        userDetail.setPassword(user.getPassword());
        userDetail.setUsername(user.getUsername());
        return userDetail;
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User inituser(String name, String password) {
        User user = new User();
        user.setStatus(Const.USER_STATUS.ACTIVE);
        user.setUsername(name);
        user.setRoleId(1);
        user.setPassword(password);
        return userRepository.saveAndFlush(user);
    }

}
