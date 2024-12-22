<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSON Ajax Test</title>
</head>
<body>
	<h1>JSON Ajax Test</h1>
	<hr>
	<table border="1">
		<tr>
			<td><h3>Realtime Search Ranking</h3></td>
			<td width="40%"><div id="ranking">Keyword</div></td>
		</tr>
	</table>
</body>
<script>
	var words = new Array();
	var obj = "";
	var ranking = document.getElementById("ranking");
	
	var hr = new XMLHttpRequest();
	hr.open("GET", "11_json_data.json", true);
	hr.send();
	console.log("send OK");
	
	hr.onreadystatechange = function(){
		console.log(hr.responseText);
		
		if(hr.readyState == 4 && hr.status == 200){
			obj = JSON.parse(hr.responseText);
			
			for(let i=0; i<obj.search_word.length; i++){
				str = "[" + obj.search_word[i].rank + "] " + obj.search_word[i].name;
				words[i] = str;
			}
			
			console.log(words);
		}
	}
	
	var i = 0;
	setInterval(function(){
		if(i==obj.search_word.length){ i = 0; }
		ranking.innerHTML = "<h3>" + words[i] + "</h3>";
		i++;
	}, 1000);
	
</script>
</html>