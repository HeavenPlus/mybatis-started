package com.heaven.dao.vo;

import com.heaven.dao.pojo.Role;
import com.heaven.dao.pojo.User;
import lombok.Data;

/**
 * @Description
 * @Author Heaven
 * @Date 2022/6/12 下午6:37
 */
@Data
public class UserRoleVO {

    private Integer id;
    private User user;
    private Role role;
}
