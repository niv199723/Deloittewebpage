function userValidation()
{
	var userValue=document.getElementById("txtname").value;
	var namePattern="^[A-Za-z]+$";
	if(!userValue.match(namePattern))
		document.getElementById("errorname").innerHTML="name should be alphabets";
	else
		document.getElementById("errorname").innerHTML="";
}
function radioValidation()
{
	var elements=document.getElementsByName("gender");
	var count=0;
	for(var i=0;i<elements.length;i++)
	{
		if(elements[i].checked)
			count++;
	}
	if(count==0)
	{
		document.getElementById("errorGender").innerHTML="select atleast one gender";
		return false;
	}
	else{
		document.getElementById("errorGender").innerHTML="";
		return true;
	}
}
	function checkValidation()
	{
	var ele=document.getElementsByClassName("Language");
	var count=0;
	for(var i=0;i<ele.length;i++)
	{
		if(ele[i].checked)
			count++;
	}
	if(count==0)
	{
		document.getElementById("errorLanguage").innerHTML="select atleast one Language";
		return false;
	}
	else{
		document.getElementById("errorLanguage").innerHTML="";
		return true;
	}	
}
function dropDownValidation()
	{
	var elem=document.getElementsByClassName("state");
	var count=0;
	for(var i=0;i<elem.length;i++)
	{
		if(elem[i].selected)
			count++;
	}
	if(count==0)
	{
		document.getElementById("errorDropDown").innerHTML="select a state";
		return false;
	}
	else{
		document.getElementById("errorDropDown").innerHTML="";
		return true;
	}	
}

function formValidation(form)
{
	userValidation();
	radioValidation();
	checkValidation();
	dropDownValidation();
	if(userValidation()&&radioValidation()&&checkValidation()&&dropDownValidation())
		return true;
	else
		return false;
	
}

