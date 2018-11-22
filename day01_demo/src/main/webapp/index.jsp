<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<a href="${pageContext.request.contextPath}/user/mvcDemo">SpringMVC 入门案例</a>
<hr/>
<a href="${pageContext.request.contextPath}/user/simpleParams?name=小明&age=18">简单类型参数</a>
<hr/>
 <form action="${pageContext.request.contextPath}/user/pojoParams" method="post">
     编号：  <input type="text" name="id"><br/>
     姓名： <input type="text" name="name"><br/>
           <input type="submit" value="对象参数提交">
 </form>
<hr/>
<form action="${pageContext.request.contextPath}/user/pojoDateParams" method="post">
    编号： <input type="text" name="id"><br/>
    姓名：<input type="text" name="name"><br/>
    生日：<input type="text" name="birthday"><br/>
    <input type="submit" value="对象日期参数提交">
</form>
<hr/>
<form action="${pageContext.request.contextPath}/user/arrParams" method="post">
     ids1:<input type="checkbox" name="ids" value="1">
     ids1:<input type="checkbox" name="ids" value="2">
     ids1:<input type="checkbox" name="ids" value="3">
     ids1:<input type="checkbox" name="ids" value="4">
     ids1:<input type="checkbox" name="ids" value="5">
          <input type="submit" value="数组参数">
</form>
<hr/>
<form action="${pageContext.request.contextPath}/user/listAndMapParams" method="post">
     list1:<input type="text" name="ids[0]"><br/>
     list2:<input type="text" name="ids[1]"><br/>
     map1 :<input type="text" name="map['one']"><br/>
     map2 :<input type="text" name="map['two']"><br/>
         <input type="submit" value="list和map参数">
</form>
<form action="${pageContext.request.contextPath}/user/listAndMapParams" method="post">
    addresses:<input type="text" name="addresses[0].province"><br/>
    addresses:<input type="text" name="addresses[0].city"><br/>
    mapAddress :<input type="text" name="mapAddress['one'].province"><br/>
    mapAddress :<input type="text" name="mapAddress['one'].city"><br/>
                <input type="submit" value="list,map复杂参数">
</form>
</body>
</html>
