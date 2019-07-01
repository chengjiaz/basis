<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<style>

    .tables{
        border-collapse:collapse;
        position: relative;
        left: 100px;

    }
    .tds{
        width: 200px;
        height: 95px;
        margin-left: 50px;
        margin-top: 10px;
    }

    .circle {
        width: 20px;
        height: 20px;
        background: #F2F2F2;
        -moz-border-radius: 60px;
        -webkit-border-radius: 60px;
        border-radius: 60px;
        margin-left: 25px;
    }
    span{

        display: inline-block;
    }
    a {
        position: relative;

        text-decoration: none;
    }

    a:hover {
        color: red;
		text-decoration: underline;
    }
</style>
<body>

<div  style="position:relative;left:300px;background:url('static/images/customer.png') no-repeat;width:816px;height:318px;">
<table class="tables">
    <tr class="trs" style=";margin-bottom: 5px;">
        <td class="tds" style="background-color: #E4E4E4 ;margin-right: 15px;border: 1px solid white;" ><div class="circle" style="margin-right: 50px;float: left;text-align: center;color: red">1</div>
            <span style="margin-left: 20px;">
                        <a href="#">
							8人
						</a>

					</span>

        </td>
        <td class="tds" style="background-color: #FFEFC0;margin-right: 5px;border: 1px solid white;" ><div class="circle" style="margin-right: 50px;float: left;text-align: center;color: red" >2</div>
            <span style="margin-left: 20px;">
					<a href="#">
					4人
					</a>
				</span></td>
        <td class="tds" style="background-color:#E4E4E4;margin-right: 5px;border: 1px solid white;" ><div class="circle" style="margin-right: 50px;float: left;text-align: center;color: red">3</div>
            <span  style="margin-left: 20px;">
					<a href="#">
					7人
					</a>
				</span></td>

    </tr>
    <tr class="trs" style="margin-bottom: 5px;">
        <td class="tds" style="background-color:#FFEFC0;margin-right: 5px;border: 1px solid white;" ><div class="circle" style="margin-right: 50px;float: left;text-align: center;color: red">4</div>
            <span style="margin-left: 20px;">
					<a href="#">
					5人
					</a>
				</span></td>
        <td class="tds" style="background-color:#E4E4E4;margin-right: 5px;border: 1px solid white;" ><div class="circle" style="margin-right: 50px;float: left;text-align: center;color: red">5</div>
            <span  style="margin-left: 20px;">
					<a href="#">
					2人
					</a>
				</span></td>
        <td class="tds" style="background-color:#FFEFC0;margin-right: 5px;border: 1px solid white;" ><div class="circle" style="margin-right: 50px;float: left;text-align: center;color: red">6</div>
            <span style="margin-left: 20px;">
				<a href="#">
					10人
				</a>
				</span></td>

    </tr>
    <tr class="trs" style="margin-bottom: 5px;">
        <td class="tds" style="background-color:#E4E4E4;margin-right: 5px;border: 1px solid white;" ><div class="circle" style="margin-right: 50px;float: left;text-align: center;color: red">7</div>
            <span  style="margin-left: 20px;">
					<a href="#">
					8人
				    </a>
				</span></td>
        <td class="tds" style="background-color: #FFEFC0;margin-right: 5px;border: 1px solid white;" ><div class="circle" style="margin-right: 50px;float: left;text-align: center;color: red">8</div>
            <span id="btn_userinfo_toAdd8" style="margin-left: 20px;">
					<a href="#">
					11人
					</a>
				</span></td>
        <td class="tds" style="background-color: #E4E4E4 ;margin-right: 5px;border: 1px solid white;" ><div class="circle" style="margin-right: 50px;float: left;text-align: center;color: red">9</div>
            <span  style="margin-left: 20px;">
					<a href="#">
					5人
					</a>
				</span></td>

    </tr>
</table>
</div>
</body>
</html>