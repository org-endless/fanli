package org.endless.fanli.component.game.eve.domain.market.order;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import org.endless.fanli.component.game.eve.domain.common.type.TradeType;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * GameEveMarketOrder
 * <p>
 * <p>
 * <p>
 * <p>create 2024/2/3 20:01
 * <p>update 2024/2/3 20:01
 *
 * @author Deng Haozhi
 * @since 0.0.6
 */

@Getter
@Builder
@AllArgsConstructor
@ToString
public class GameEveMarketOrder {

    private String itemId;
    private String orderId;
    private BigDecimal price;
    private BigDecimal minTransQuantity;
    private BigDecimal remainQuantity;
    private BigDecimal totalQuantity;
    private BigDecimal orderDuration;
    private TradeType tradeType;
    private LocalDateTime issuedDate;
    private String universeSystemId;
    private String universeLocationId;
    private String universeRange;

}
