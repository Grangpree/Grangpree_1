package com.granpree.service;

import com.granpree.dto.UserJoinDTO;
import com.granpree.dto.UserLoginInfoDTO;
import com.granpree.utils.ResponseWrapper;

public interface UserService {
    ResponseWrapper join(UserJoinDTO userJoinDTO);
    ResponseWrapper login(UserLoginInfoDTO userLoginInfoDTO);
}
