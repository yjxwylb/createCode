<#include "/macro.include"/>
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.entity;

import lombok.Data;

@Data
public class ${className}Entity{
	<#list table.columns as column>
	/** ${column.remarks} */
	private ${column.possibleShortJavaType} ${column.columnNameFirstLower};
	</#list>
}



<#macro generateJavaOneToMany>
	<#list table.exportedKeys.associatedTables?values as foreignKey>
	<#assign fkSqlTable = foreignKey.sqlTable>
	<#assign fkTable    = fkSqlTable.className>
	<#assign fkPojoClass = fkSqlTable.className>
	<#assign fkPojoClassVar = fkPojoClass?uncap_first>

	private Set ${fkPojoClassVar}s = new HashSet(0);
	public void set${fkPojoClass}s(Set<${fkPojoClass}> ${fkPojoClassVar}){
		this.${fkPojoClassVar}s = ${fkPojoClassVar};
	}

	public Set<${fkPojoClass}> get${fkPojoClass}s() {
		return ${fkPojoClassVar}s;
	}
	</#list>
</#macro>

<#macro generateJavaManyToOne>
	<#list table.importedKeys.associatedTables?values as foreignKey>
	<#assign fkSqlTable = foreignKey.sqlTable>
	<#assign fkTable    = fkSqlTable.className>
	<#assign fkPojoClass = fkSqlTable.className>
	<#assign fkPojoClassVar = fkPojoClass?uncap_first>

	private ${fkPojoClass} ${fkPojoClassVar};

	public void set${fkPojoClass}(${fkPojoClass} ${fkPojoClassVar}){
		this.${fkPojoClassVar} = ${fkPojoClassVar};
	}

	public ${fkPojoClass} get${fkPojoClass}() {
		return ${fkPojoClassVar};
	}
	</#list>
</#macro>
