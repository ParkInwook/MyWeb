<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>

</head>
<body>
	
	<script>
		$.ajax({
			type:"GET",
			url: "kkk/키값/code/선택값1",
			succecss:  function(data) {
				
			}
		})
	
		
		$.ajax({
			type:"GET",
			url: "aaa6?a=1",
			succecss:  function(data) {
				
			}
		})
		
		
		$.ajax({
			type:"POST",
			url: "xxxx",
			data : JSON.stringify({"x":1, "x2": 2}),
			contentType : "application/json; charset=utf-8",
			succecss:  function(data) {
				
			}
			
		})
		
		
		
		
		
	</script>
	
</body>
</html>













