package com.ex.api.dto.future;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FuturePostOrderRequest {

    private String symbol;
    private String orderSide;
    private String orderType;
    private String origQty;
    private String price;
    private String reduceOnly;

    private String timeInForce;
    private String triggerProfitPrice;
    private String triggerStopPrice;
    private String positionSide;
    private String clientOrderId;
}
