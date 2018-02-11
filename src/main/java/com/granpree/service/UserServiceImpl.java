package com.granpree.service;

import com.granpree.dto.UserJoinDTO;
import com.granpree.dto.UserLoginInfoDTO;
import com.granpree.repository.UserRepository;
import com.granpree.utils.ResponseWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

//    @Autowired
//    private UserRepository userRepository;

    @Override
    public ResponseWrapper join(UserJoinDTO userJoinDTO) {
        ResponseWrapper result = new ResponseWrapper();

        return result;
    }

    @Override
    public ResponseWrapper login(UserLoginInfoDTO userLoginInfoDTO) {
        ResponseWrapper result = new ResponseWrapper();

        return result;
    }
}
