package org.wxf.springaitoolcalling.tools.fuction;


import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.util.function.Function;

public class ProductFuctionTool implements Function<ProductFuctionReq,ProductFuctionRsp> {
    /**
     * Applies this function to the given argument.
     *
     * @param productFuctionReq the function argument
     * @return the function result
     */
    @Override
    public ProductFuctionRsp apply(ProductFuctionReq productFuctionReq) {
        if (productFuctionReq != null && StringUtils.isNotEmpty(productFuctionReq.getName()) && productFuctionReq.getName().contains("坚果")){
            return ProductFuctionRsp.builder().productName("坚果商品")
                    .productDescription("非常好吃的坚果")
                    .productPrice(new BigDecimal(100)).build();
        }
        return null;
    }
}
