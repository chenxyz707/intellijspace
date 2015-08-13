<%--
  Created by IntelliJ IDEA.
  User: chenxyz
  Date: 2014/3/29
  Time: 23:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
      <script type="text/javascript" src="jslib/jquery-easyui-1.4.3/jquery.min.js"></script>
      <script type="text/javascript" src="jslib/jquery-easyui-1.4.3/jquery.easyui.min.js"></script>
      <script type="text/javascript" src="jslib/jquery-easyui-1.4.3/locale/easyui-lang-zh_CN.js" ></script>
      <link rel="stylesheet" href="jslib/jquery-easyui-1.4.3/themes/default/easyui.css" type="text/css"/>
      <link rel="stylesheet" href="jslib/jquery-easyui-1.4.3/themes/icon.css" type="text/css"/>
    <title>hello</title>
     <script language="JavaScript">
        <%--$(function(){--%>
            <%--alert(1);--%>
            <%--var param = "${param}";--%>
            <%--alert(param);--%>
        <%--});--%>
        $(function(){
            $("#serialized").click(function(){
                var obj = $("#myForm").serialize();
                console.info(obj);
                console.info(encodeURI(obj));
                $.ajax({
                    url : "userAction!testForm.action",
                    type : 'post',
                    dataType : 'json',
                    data : obj,
                    success : function(ret){

                    }
                });
            });
        });

     </script>
  </head>
  <body class="easyui-layout">
      <div data-options="region:'north'" style="height:60px;">
          <a href="log.jsp?id=22">进入测试</a>
          <a id="serialized" class="easyui-linkbutton" href="javascript:void(0)">表单信息</a>
      </div>
      <div data-options="region:'south'" style="height:20px;"></div>
      <div data-options="region:'west',split:true" style="width:200px">
          <div class="easyui-panel" data-options="title:'west',border:false,fit:true "></div>
      </div>
      <div data-options="region:'east'" style="width:200px"></div>
      <div data-options="region:'center',titile:'center'">
          <form id="myForm">
              <input id="test" name="test" class="easyui-textbox" data-options="multiline:true"
                      style="width:300px;height:200px" />
              <textarea name="test2" style="width:300px;height:200px"></textarea>
          </form>
      </div>

        <div class="easyui-dialog" data-options="title:'登录'">
            <table>
                <tr>
                    <th>登录名1</th>
                    <td>fds</td>
                </tr>
                <tr>
                    <th>密码</th>
                    <td>fds</td>
                </tr>
            </table>
        </div>
  </body>
</html>
