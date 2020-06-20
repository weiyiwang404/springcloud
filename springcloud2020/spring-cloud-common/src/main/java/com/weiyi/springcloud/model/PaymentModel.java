package com.weiyi.springcloud.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * description:
 *
 * @author weiyi
 * @date 2020/6/20 10:58
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentModel {
    private Long id;
    private String serial;
}
