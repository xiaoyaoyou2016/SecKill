package cn.hfbin.seckill.dao;

import cn.hfbin.seckill.entity.SeckillOrder;
import org.apache.ibatis.annotations.Param;

public interface SeckillOrderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SeckillOrder record);

    int insertSelective(SeckillOrder record);

    SeckillOrder selectByPrimaryKey(Long id);

    SeckillOrder selectByOrderId(Long orderId);

    int updateByPrimaryKeySelective(SeckillOrder record);

    int updateByPrimaryKey(SeckillOrder record);

    SeckillOrder selectByUserIdAndGoodsId(@Param("userId") long userId , @Param("goodsId") long goodsId );
}