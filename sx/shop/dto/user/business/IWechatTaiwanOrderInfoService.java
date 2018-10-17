package com.shaoxi.scanorder.service;

import com.github.pagehelper.PageInfo;

import com.shaoxi.scanorder.entity.WechatTaiwanOrderInfoEntity;
import java.util.Map;

public interface IWechatTaiwanOrderInfoService{
	public PageInfo<WechatTaiwanOrderInfoVO> query(WechatTaiwanOrderInfoVO wechatTaiwanOrderInfoVO, int pageNo, int pageSize) throws BizException;
	
	public Long save(WechatTaiwanOrderInfoVO wechatTaiwanOrderInfo) throws BizException;

	public Long update(WechatTaiwanOrderInfoVO wechatTaiwanOrderInfo) throws BizException;

}
