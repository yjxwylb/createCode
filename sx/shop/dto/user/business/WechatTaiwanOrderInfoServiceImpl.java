package com.shaoxi.scanorder.service.impl;

        import java.util.ArrayList;
        import java.util.HashMap;
        import java.util.List;
        import java.util.Map;

        import org.apache.commons.beanutils.PropertyUtils;
        import org.slf4j.Logger;
        import org.slf4j.LoggerFactory;
        import org.springframework.beans.BeanUtils;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;
        import com.github.pagehelper.PageHelper;
        import com.github.pagehelper.PageInfo;
        import com.shaoxi.scanorder.entity.WechatTaiwanOrderInfoEntity;
        import com.shaoxi.scanorder.repository.IWechatTaiwanOrderInfoRepository;
        import com.shaoxi.scanorder.service.IWechatTaiwanOrderInfoService;


@Service
public class WechatTaiwanOrderInfoServiceImpl implements IWechatTaiwanOrderInfoService{
private static final Logger logger=LoggerFactory.getLogger(WechatTaiwanOrderInfoServiceImpl.class);
@Autowired
private WechatTaiwanOrderInfoMapper wechatTaiwanOrderInfoMapper;

@Override
public Long save(WechatTaiwanOrderInfoVO wechatTaiwanOrderInfoVO){
        WechatTaiwanOrderInfoEntity entity=new WechatTaiwanOrderInfoEntity();
        BeanUtils.copyProperties(wechatTaiwanOrderInfoVO,entity);
        wechatTaiwanOrderInfoMapper.save(entity);
        return entity.getId();
        }

@Override
public PageInfo<WechatTaiwanOrderInfoVO>query(WechatTaiwanOrderInfoVO wechatTaiwanOrderInfoVO,int pageNo,int pageSize){
        WechatTaiwanOrderInfoEntity entity=new WechatTaiwanOrderInfoEntity();
        BeanUtils.copyProperties(wechatTaiwanOrderInfoVO,entity);
        PageHelper.startPage(pageNo,pageSize);
        List<WechatTaiwanOrderInfoEntity>list=wechatTaiwanOrderInfoMapper.query(entity);
        PageInfo<WechatTaiwanOrderInfoEntity>page=new PageInfo<WechatTaiwanOrderInfoEntity>(list);
        PageInfo<WechatTaiwanOrderInfoVO>result=null;
        try{
        result=PageCopyUtil.copyTo(page,WechatTaiwanOrderInfoVO.class);
        }catch(Exception e){
        logger.error("error entity to vo runtimeException",e);
        }
        return result;
        }

@Override
public Long update(WechatTaiwanOrderInfoVO wechatTaiwanOrderInfoVO){
        WechatTaiwanOrderInfoEntity entity=new WechatTaiwanOrderInfoEntity();
        BeanUtils.copyProperties(wechatTaiwanOrderInfoVO,entity);
        wechatTaiwanOrderInfoMapper.update(entity);
        return entity.getId();
        }
        }