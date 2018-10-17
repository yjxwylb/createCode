package ${basepackage}.service;

import com.github.pagehelper.PageInfo;
import ${basepackage}.entity.${table.className}Entity;
import java.util.Map;

public interface ${table.className}Mapper{
	public List<${table.className}Entity> query(${table.className}Entity ${table.entityName});
	
	public Long save(${table.className}Entity ${table.entityName});

	public Long update(${table.className}Entity ${table.entityName});

}
