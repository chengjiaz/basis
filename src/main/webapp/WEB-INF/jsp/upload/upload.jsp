<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head> 
		<title> New Document </title> 
  	<style type="text/css">  
  	.spa{   font-size:12px;  color:#0066ff;   }  
  	.put{   font-size:12px;  font-family:Arial;  color:#0066ff;   background-color:#fef4d9;  padding:0px;   border-style:none;  }    
  	.put2{   font-size:12px;  color:#0066ff;  text-align:center;  border-width:medium;  border-style:none;  }     
  	</style> 
 	</head> 
 	<body> 
		<div id="up"> 
		    <span class="spa">载入中,请稍等...</span> 
	    	    <input id="chart" type="text" size="54" class="put" readonly="" /> 
	    	    <input id="percent" type="text" size="20" class="put2" readonly="" /> 
  		</div> 
  		这是中文
  		<div id="ff"> 
   		    <form name="upload" method="post" action=""> 
	    	        <input type="file" id="f" size="30" /> 
	    		<input type="button" id="b" value="上传" onclick="count()" /> 
   		    </form> 
  		</div> 
  	<script language="javascript">  
		var bar=0;   
		var line="||";  
		var amount="";   
		document.getElementById("up").style.display="none";  
  		function count(){   
  			var f = document.getElementById("f");  
  			var b = document.getElementById("b");  
  			b.disabled  = true;  
  			f.disabled  = true;  
  			if(f.value==""){  
  				b.disabled  = false;  
  				f.disabled  = false;  
  				alert("请添加上传文件");  
  				return false;  
  			}   
			document.getElementById("up").style.display="inline";  
			bar = bar+2;   
			amount = amount+line;   
			document.getElementById("chart").value=amount;  
			document.getElementById("percent").value=bar+"%";  
  			if(bar<99){   
  				setTimeout("count()",200);  
  			}else{   
  				b.disabled  = false;  
  				f.disabled  = false;  
  				alert("加载完毕！");   
				document.getElementById("up").style.display="none";
  				// window.location="";  
  			}  
  		}    
  	</script>
 	</body>
</html>