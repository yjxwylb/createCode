package com.jiuyescm.erp.example.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.shaoxi.scanorder.exception.BizException;
import com.shaoxi.scanorder.rest.Response;
import com.github.pagehelper.PageInfo;




@RestController
@RequestMapping("/api")
public class WechatTaiwanOrderInfoController {

    private static final Logger logger = LoggerFactory.getLogger(WechatTaiwanOrderInfoController.class.getName());

    @Resource
    private IWechatTaiwanOrderInfoService wechatTaiwanOrderInfoService;

    @RequestMapping(value = "/wechatTaiwanOrderInfo", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Response<WechatTaiwanOrderInfoVO> save(@RequestBody WechatTaiwanOrderInfoVO vo) {
        logger.info(vo.toString());
       
        Response<WechatTaiwanOrderInfoVO> res = new Response<WechatTaiwanOrderInfoVO>();
        try {
            Long id = wechatTaiwanOrderInfoService.save(vo);
            vo.setId(id);
        } catch (BizException e) {
            throw e;
        }
        res.setItems(vo);
        return res;
    }

    @RequestMapping(value = "/wechatTaiwanOrderInfo", method = RequestMethod.GET)
    public Response<PageInfo<WechatTaiwanOrderInfoVO>> getList(@RequestParam(required = false) String name,
            @RequestParam(value = "page", defaultValue = "1") Integer page,
            @RequestParam(value = "pageSize", defaultValue = "20") Integer pageSize) {
        Response<PageInfo<WechatTaiwanOrderInfoVO>> res = new Response<PageInfo<WechatTaiwanOrderInfoVO>>();
        WechatTaiwanOrderInfoVO vo = new WechatTaiwanOrderInfoVO();
        res.setItems(wechatTaiwanOrderInfoService.query(vo, page, pageSize));
        return res;
    }

}
