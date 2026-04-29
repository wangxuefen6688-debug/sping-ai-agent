package org.wxf.springaitoolcalling.tools.fuction;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class ProductFuctionRsp {
    private String productName;
    private String productDescription;
    private BigDecimal productPrice;
}
