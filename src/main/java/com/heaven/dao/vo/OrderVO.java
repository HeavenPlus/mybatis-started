package com.heaven.dao.vo;

import com.heaven.dao.pojo.User;
import lombok.Data;

/**
 * @Description
 * @Author Heaven
 * @Date 2022/6/12 下午5:33
 */
@Data
public class OrderVO {

    private Integer id;
    private String title;

    private User user;
}
