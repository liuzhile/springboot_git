<%@ page pageEncoding="UTF-8"%>
<html>
  <head>
   	<link href="${pageContext.request.contextPath}/easyui/themes/default/easyui.css" rel="stylesheet" type="text/css">
   	<link href="${pageContext.request.contextPath}/easyui/themes/icon.css" rel="stylesheet" type="text/css">
   	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
   	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.easyui.min.js"></script>
   	<script type="text/javascript" src="${pageContext.request.contextPath}/js/easyui-lang-zh_CN.js"></script>
	<script type="text/javascript">
		$(function(){
			$("#dg").datagrid({
				url:"${pageContext.request.contextPath}/movie/show",
				columns:[[
					{field:"mid",title:"编号",width:100,align:"center"},
					{field:"mname",title:"电影名",width:100,align:"center"},
					{field:"director",title:"导演",width:100,align:"center"},
					{field:"describe",title:"简介",width:100},
					{field:"openDate",title:"上映时间",width:100,align:"center"},
					{field:"category",title:"类别",width:100,align:"center",formatter:function(value,row,index){ return row.category.catename;}},
					{field:"operator",title:"操作",width:100,align:"center",formatter:function(value,row,index){
						return "<a onClick='update("+row.mid+")' name='update'>修改</a>";
					}}
				]],
				onLoadSuccess:function(){
					$("a[name='update']").linkbutton({
						iconCls:"icon-edit"
					});
				},
				fitColumns:true,
				pagination:true,
				pageSize:4,
				pageList:[3,4,5]
			});
			$("#dialog").dialog({
				title:"修改信息",
				closed:true,
				width:600,
				height:300,
				href:"${pageContext.request.contextPath}/update.jsp",
				cache:false
			});
		});
		function update(id){
			tid=id;
			$("#dialog").dialog("open");
		}
	</script>
  </head>
  <body>
  	<table id="dg"></table>
  	<div id="dialog"></div>
  </body>
</html>
