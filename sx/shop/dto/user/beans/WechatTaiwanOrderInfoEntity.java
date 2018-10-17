package com.shaoxi.scanorder.entity;

import lombok.Data;

@Data
public class WechatTaiwanOrderInfoEntity{
	/** 自增ID，主键ID */
	private Long id;
	/** 我方订单号(商户订单号) */
	private String orderId;
	/** 币种，订单交易金额币种 */
	private String currency;
	/** 订单实付金额【币种下的最小单位】 */
	private Long amount;
	/** 订单状态 ：【1】未支付；【2】支付成功；【3】支付失败；【4】退款成功；【5】退款失败 */
	private String orderStatus;
	/** 是否成功消费mq */
	private Integer consumeSucc;
	/** 华南银行给我们分配的商户号 */
	private String mchntid;
	/** 服务商ID */
	private String appid;
	/** 机构号 */
	private String inscd;
	/** 数据创建时间 */
	private java.util.Date createTime;
	/** 数据创建人ID【REST必传、Dubbo服务填写SYS】 */
	private String createPerson;
	/** 支付成功时间 */
	private java.util.Date paySuccessTime;
	/** 数据修改时间 */
	private java.util.Date updateTime;
	/** 商家帐号【此帐号在redis中存在并且已配置好】 */
	private String merchantAccount;
	/** 版本号【乐观锁】 */
	private Long version;
}



