<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<div id="toolbar">
    <div>
        <button type="button" onclick="addParam()" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true">新增</button>
        <button type="button" onclick="editParam()" class="easyui-linkbutton" data-options="iconCls:'icon-edit',plain:true">编辑</button>
        <button type="button" onclick="deleteParam()" class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true">删除</button>
    </div>
</div>
<table id="dgParamList"></table>
<script>
    //初始化数据表格
    $('#dgParamList').datagrid({
        title: '商品规格模板列表',
        url:'itemParams',
        fit: true,
        rownumbers: true,
        pagination: true,
        pageSize:20,
        toolbar: '#toolbar',
        columns:[[
            {field:'ck', checkbox: true},
            {field:'id',title:'ID', sortable: true},
            {field:'itemCatName',title:'商品类目'},
            {field:'paramData',title:'规格(只显示分组名称)', formatter:function(value,row,index){
                console.log(value);
                return value;
            }},
            {field:'createdView',title:'创建日期', formatter:function(value,row,index){
                return moment(value).format('YYYY年MM月DD日,hh:mm:ss');
            }},
            {field:'updated',title:'更新日期', formatter:function(value,row,index){
                return moment(value).format('YYYY年MM月DD日,hh:mm:ss');
            }}
        ]]
    });

</script>