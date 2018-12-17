<%@ page pageEncoding="UTF-8"%>
	<script type="text/javascript">
		$(function(){
			$("#form").form("load","${pageContext.request.contextPath}/movie/query?tid="+tid);
			$("#datebox").datebox({
				required:true,
				editable:false
			});
			$("#combobox").combobox({
				url:"${pageContext.request.contextPath}/movie/getCategorys",
				valueField:"cateid",
				textField:"catename"
			});
			$("#updateBtn").linkbutton({
				iconCls:"icon-ok",
				onClick:function(){
					$("#form").form("submit",{
						url:"${pageContext.request.contextPath}/movie/update",
						success:function(){
							$("#dialog").dialog("close");
							$("#dg").datagrid("reload");
							$.messager.show({
								title:"系统提示",
								msg:"修改成功！"
							});
						}
					});
				}
			});
		});
	</script>
  	<form method="post" id="form">
  		<input name="mid" hidden="hidden"/><br/>
  		<table>
  		<tr>
  			<td>电影名：</td>
  			<td><input name="mname"/></td>
  		</tr>
  		<tr>
  			<td>导演：</td>
  			<td><input name="director"/></td>
  		</tr>
  		<tr>
  			<td>简介：</td>
  			<td><input name="describe"/></td>
  		</tr>
  		<tr>
  			<td>上映时间：</td>
  			<td><input id="datebox" name="openDate"/></td>
  		</tr>
  		<tr>
  			<td>类别：</td>
  			<td><input id="combobox" name="cid"/></td>
  		</tr>
  		</table>
  	</form>
  	<a id="updateBtn">提交</a>
