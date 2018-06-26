package com.fengdu.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fengdu.common.Sid;
import com.fengdu.dao.FlowMapper;
import com.fengdu.dao.OrdersMapper;
import com.fengdu.entity.Flow;
import com.fengdu.entity.Orders;
import com.fengdu.service.OrdersService;
import com.fengdu.utils.OrderStatusEnum;

@Service
public class OrdersServiceImpl implements OrdersService {

	@Autowired
	private OrdersMapper ordersMapper;
	
	@Autowired
	private FlowMapper flowMapper;
	
	@Autowired
	private Sid sid;
	
	@Override
	public void saveOrder(Orders order) {
		ordersMapper.insert(order);
	}

	@Override
	public Orders getOrderById(String orderId) {
		return ordersMapper.selectByPrimaryKey(orderId);
	}

	@Override
	public void updateOrderStatus(String orderId, String alpayFlowNum, String paidAmount) {
		
		Orders order = getOrderById(orderId);
		if (order.getOrderStatus().equals(OrderStatusEnum.WAIT_PAY.key)) {
			order = new Orders();
			order.setId(orderId);
			order.setOrderStatus(OrderStatusEnum.PAID.key);
			order.setPaidTime(new Date());
			order.setPaidAmount(paidAmount);
			
			ordersMapper.updateByPrimaryKeySelective(order);
			
			order = getOrderById(orderId);
			
			String flowId = sid.nextShort();
			Flow flow = new Flow();
			flow.setId(flowId);
			flow.setFlowNum(alpayFlowNum);
			flow.setBuyCounts(order.getBuyCounts());
			flow.setCreateTime(new Date());
			flow.setOrderNum(orderId);
			flow.setPaidAmount(paidAmount);
			flow.setPaidMethod(1);
			flow.setProductId(order.getProductId());
			
			flowMapper.insertSelective(flow);
		}
		
	}

}
