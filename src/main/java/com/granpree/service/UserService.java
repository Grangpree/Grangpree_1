package com.granpree.service;

import com.granpree.dto.UserJoinDTO;
import com.granpree.dto.UserLoginInfoDTO;
import com.granpree.utils.ResponseWrapper;
import org.springframework.stereotype.Service;

public interface UserService {
    ResponseWrapper join(UserJoinDTO userJoinDTO);
    ResponseWrapper login(UserLoginInfoDTO userLoginInfoDTO);
}
