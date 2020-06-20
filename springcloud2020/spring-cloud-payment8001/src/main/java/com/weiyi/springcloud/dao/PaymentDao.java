package com.weiyi.springcloud.dao;

import com.weiyi.springcloud.model.PaymentModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @ClassName PaymentDao
 * @Description
 * @Author 16278
 * @Date 2020/6/15 10:55
 * @Version 1.0
 */
@Mapper
public interface PaymentDao {

    @Select("select * from payment where id = #{id}")
    PaymentModel getPayment (@Param("id") Long id);

    int create (PaymentModel paymentModel);
}
