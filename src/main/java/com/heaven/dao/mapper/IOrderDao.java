package com.heaven.dao.mapper;

import com.heaven.dao.pojo.Order;
import com.heaven.dao.vo.OrderVO;

import java.util.List;

/**
 * @Description
 * @Author Heaven
 * @Date 2022/6/12 下午5:32
 */
public interface IOrderDao {

    List<OrderVO> findOrderAndUser();

    List<Order> findByUserId(Integer userId);
}
