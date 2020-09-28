package com.sqw.service.impl;

import com.sqw.dao.IUserDao;
import com.sqw.model.User;
import com.sqw.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

//括号里面就是给实例化后的UserServiceImpl对象取个名字
//这是当IUserService接口有多个实现类的情况下区分实现类的方式，接口只有一个实现类,括号里的内容没有意义
@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource  //与 @Autowired 功能相似
    private IUserDao userDao;

//    public User selectUser(long userId) {
public User selectUser(int userId) {
        return userDao.selectUser(userId);
    }
}
