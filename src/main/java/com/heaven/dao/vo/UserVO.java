package com.heaven.dao.vo;

import com.heaven.dao.pojo.Order;
import lombok.Data;

import java.util.List;

/**
 * @Description
 * @Author Heaven
 * @Date 2022/6/12 下午6:05
 */
@Data
public class UserVO {
    private Integer id;
    private String name;
    private List<Order> orders;
}
