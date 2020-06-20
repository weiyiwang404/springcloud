package com.weiyi.springcloud.dao;

import com.weiyi.springcloud.model.PaymentModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * description:
 *
 * @author weiyi
 * @date 2020/6/20 12:03
 */
@Mapper
public interface PaymentDao {

    PaymentModel getPaymentById(@Param("id") Long id);

}
