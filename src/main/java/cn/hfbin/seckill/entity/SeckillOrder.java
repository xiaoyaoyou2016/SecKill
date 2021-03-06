package cn.hfbin.seckill.entity;

import lombok.*;
import org.springframework.data.annotation.Id;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class SeckillOrder {

    private Long id;

    private Long userId;

    private Long orderId;

    private Long goodsId;

}