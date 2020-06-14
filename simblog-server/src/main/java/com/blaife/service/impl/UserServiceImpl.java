package com.blaife.service.impl;

import com.blaife.entity.User;
import com.blaife.mapper.UserMapper;
import com.blaife.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author blaife
 * @since 2020-06-14
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
