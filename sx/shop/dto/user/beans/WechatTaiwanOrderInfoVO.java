package com.shaoxi.scanorder.VO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class WechatTaiwanOrderInfoVO implements Serializable{
	/** 自增ID，主键ID */
@ApiModelProperty(value = "自增ID，主键ID",name = "id",required = true,example = "")
	private Long id;
	/** 我方订单号(商户订单号) */
@ApiModelProperty(value = "我方订单号(商户订单号)",name = "orderId",required = true,example = "")
	private String orderId;
	/** 币种，订单交易金额币种 */
@ApiModelProperty(value = "币种，订单交易金额币种",name = "currency",required = true,example = "")
	private String currency;
	/** 订单实付金额【币种下的最小单位】 */
@ApiModelProperty(value = "订单实付金额【币种下的最小单位】",name = "amount",required = true,example = "")
	private Long amount;
	/** 订单状态 ：【1】未支付；【2】支付成功；【3】支付失败；【4】退款成功；【5】退款失败 */
@ApiModelProperty(value = "订单状态 ：【1】未支付；【2】支付成功；【3】支付失败；【4】退款成功；【5】退款失败",name = "orderStatus",required = true,example = "")
	private String orderStatus;
	/** 是否成功消费mq */
@ApiModelProperty(value = "是否成功消费mq",name = "consumeSucc",required = true,example = "")
	private Integer consumeSucc;
	/** 华南银行给我们分配的商户号 */
@ApiModelProperty(value = "华南银行给我们分配的商户号",name = "mchntid",required = true,example = "")
	private String mchntid;
	/** 服务商ID */
@ApiModelProperty(value = "服务商ID",name = "appid",required = true,example = "")
	private String appid;
	/** 机构号 */
@ApiModelProperty(value = "机构号",name = "inscd",required = true,example = "")
	private String inscd;
	/** 数据创建时间 */
@ApiModelProperty(value = "数据创建时间",name = "createTime",required = true,example = "")
	private java.util.Date createTime;
	/** 数据创建人ID【REST必传、Dubbo服务填写SYS】 */
@ApiModelProperty(value = "数据创建人ID【REST必传、Dubbo服务填写SYS】",name = "createPerson",required = true,example = "")
	private String createPerson;
	/** 支付成功时间 */
@ApiModelProperty(value = "支付成功时间",name = "paySuccessTime",required = true,example = "")
	private java.util.Date paySuccessTime;
	/** 数据修改时间 */
@ApiModelProperty(value = "数据修改时间",name = "updateTime",required = true,example = "")
	private java.util.Date updateTime;
	/** 商家帐号【此帐号在redis中存在并且已配置好】 */
@ApiModelProperty(value = "商家帐号【此帐号在redis中存在并且已配置好】",name = "merchantAccount",required = true,example = "")
	private String merchantAccount;
	/** 版本号【乐观锁】 */
@ApiModelProperty(value = "版本号【乐观锁】",name = "version",required = true,example = "")
	private Long version;
}

