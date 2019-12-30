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
	var perPattern="^[0-9]{2}[.]{1}[0-9]{2}[%]{1}$";
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





