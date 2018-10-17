package ${basepackage}.service;

import com.github.pagehelper.PageInfo;

import ${basepackage}.entity.${table.className}Entity;
import java.util.Map;

public interface I${table.className}Service{
	public PageInfo<${table.className}VO> query(${table.className}VO ${table.entityName}VO, int pageNo, int pageSize) throws BizException;
	
	public Long save(${table.className}VO ${table.entityName}) throws BizException;

	public Long update(${table.className}VO ${table.entityName}) throws BizException;

}
