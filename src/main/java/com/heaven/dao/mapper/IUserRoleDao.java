package com.heaven.dao.mapper;

import com.heaven.dao.vo.UserRoleVO;

import java.util.List;

/**
 * @Description
 * @Author Heaven
 * @Date 2022/6/12 下午6:37
 */
public interface IUserRoleDao {

    List<UserRoleVO> findAllUserRole();
}
