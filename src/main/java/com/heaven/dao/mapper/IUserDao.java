package com.heaven.dao.mapper;

import com.heaven.dao.pojo.User;
import com.heaven.dao.vo.UserVO;

import java.util.List;

/**
 * @Description
 * @Author Heaven
 * @Date 2022/6/11 下午10:30
 */
public interface IUserDao {

    List<User> findAll();

    User findById(Integer id);

    List<UserVO> findUserAndOrder();
}
