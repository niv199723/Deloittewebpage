<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" rel="stylesheet">
<link href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
</head>
<body>
<script>
function dropDownValidation()
{
var elem=document.getElementsByClassName("Education");
var count=0;
for(var i=0;i<elem.length;i++)
{
	if(elem[i].selected)
		count++;
}
if(count==0)
{
document.getElementById("errorDropDown").innerHTML="select a Qualification";
	return false;
}
else{
	document.getElementById("errorDropDown").innerHTML="";
	return true;
}	
}
function perValidation()
{
var userValue=document.getElementById("per").value;
var perPattern="^[0-9]{2}$";
if(userValue==null||userValue==""){
document.getElementById("errorper").innerHTML="plz enter your percentage";
return false;
}
else if(!userValue.match(perPattern)){
	document.getElementById("errorper").innerHTML="plz enter in 00.00% format";
return false;
}
else{
	document.getElementById("errorper").innerHTML="";
return true;
}
}
function intValidation()
{
var userValue=document.getElementById("int").value;
var perPattern="^[0-9]{2}$";
if(userValue==null||userValue==""){
document.getElementById("errorint").innerHTML="plz enter interview score";
return false;
}
else if(!userValue.match(perPattern)){
	document.getElementById("errorint").innerHTML="plz enter correct interview score";
return false;
}
else{
	document.getElementById("errorint").innerHTML="";
return true;
}
}
function comValidation()
{
var userValue=document.getElementById("com").value;
var perPattern="^[0-9]{2}$";
if(userValue==null||userValue==""){
document.getElementById("errorcom").innerHTML="plz enter communication skills score";
return false;
}
else if(!userValue.match(perPattern)){
	document.getElementById("errorcom").innerHTML="plz enter correct communicetion skills score";
return false;
}
else{
	document.getElementById("errorcom").innerHTML="";
return true;
}
}
function techValidation()
{
var userValue=document.getElementById("tech").value;
var perPattern="^[0-9]{2}$";
if(userValue==null||userValue==""){
document.getElementById("errortech").innerHTML="plz enter technical skills score";
return false;
}
else if(!userValue.match(perPattern)){
	document.getElementById("errortech").innerHTML="plz enter correct technical skills score";
return false;
}
else{
	document.getElementById("errortech").innerHTML="";
return true;
}
}
function formValidation()
{
a=dropDownValidation();
b=perValidation();
c=intValidation();
d=comValidation();
e=techValidation();
if(a&&b&&c&&d&&e)
return true;
else
return false;
}
</script>
<div class="container"> 
<div class="row" >
<div class="col-lg-12" style="background-color:black ;font-size:50px;color:white;"> DELOITTE DESIGNATION
<img src="../image/d3.jpg" align="right" height="100px" width="100px"></div>  
</div>   
<form class="form-horizontal" onsubmit="return formValidation()" action="/quasubmit/${user.getUserid()}/${user.getEmailid()}/${user.getName()}/${user.getFathername()}/${user.getMothername()}/${user.getAddress()}/${user.getContactno()}/${user.getGender()}/${user.getPassword()}"> 
<div class="row">
<div class="col-lg-12">
<h3>PERSONAL INFORMATION</h3>
</div>
</div>
<div class ="row">
<div class ="col-lg-4">
<label>Education Details</label>
</div>
<div class ="col-lg-4">
<select name="qualification">
<option value ="opt">Choose Qualification</option>
<option class="Education" value="bac">Bachelors</option>
<option class="Education" value="mas">Masters</option>
</select></div>
<span id ="errorDropDown"></span>
</div>
<div class="row"> 
<div class="col-lg-4"><label>Final Percentage</label>
</div>
<div class="col-lg-4">          
<input id="per" onchange="perValidation()" type="text" placeholder="Enter final Percentage" name="finalPercentage">
    </div>
<span id="errorper"></span>	
</div>
<div class="row"> 
<div class="col-lg-4"><label>Interview Score</label>
</div>
<div class="col-lg-4">          
<input id="int" onchange="intValidation()" type="text" placeholder="Enter interview score" name="interviewScore">
    </div>
<span id="errorint"></span>	
</div>
<div class="row"> 
<div class="col-lg-4"><label>Communication Skills</label>
</div>
<div class="col-lg-4">          
<input id="com" onchange="comValidation()" type="text" placeholder="Enter communication skills score" name="communicationScore">
    </div>
<span id="errorcom"></span>	
</div>
<div class="row"> 
<div class="col-lg-4"><label>Technical Skills</label>
</div>
<div class="col-lg-4">          
<input id="tech" onchange="techValidation()" type="text" placeholder="Enter technical skills score" name="technicalScore">
    </div>
<span id="errortech"></span>	
</div>
<div class="row"> 
<div class="col-lg-4">
<input type="submit" value="submit">
</div>
</div>
</form>
</div><p>${data}</p>
</body>
</html>