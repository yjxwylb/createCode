package com.shaoxi.scanorder.service;

import com.github.pagehelper.PageInfo;
import com.shaoxi.scanorder.entity.WechatTaiwanOrderInfoEntity;
import java.util.Map;

public interface WechatTaiwanOrderInfoMapper{
	public List<WechatTaiwanOrderInfoEntity> query(WechatTaiwanOrderInfoEntity wechatTaiwanOrderInfo);
	
	public Long save(WechatTaiwanOrderInfoEntity wechatTaiwanOrderInfo);

	public Long update(WechatTaiwanOrderInfoEntity wechatTaiwanOrderInfo);

}
