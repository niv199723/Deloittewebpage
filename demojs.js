function cardValidation()
{
	var x=document.getElementById("cardnum").value;
	var numPattern="^[0-9]{16}$";
		if(x==0||x==null)
		{
		document.getElementById("errornum").innerHTML="Enter your number";
		return false;
		}
	else if(!x.match(numPattern))   
		{		
		document.getElementById("errornum").innerHTML="Enter correct card number";
		return false;
		}
	else
		{
		document.getElementById("errornum").innerHTML="";
		return true;
		}
function cardholderValidation()
{
    var x=document.getElementById("cardholname").value;
	var holPattern="^[a-z]+$";
		if(x==0||x==null)
		{
		document.getElementById("errorname").innerHTML="Enter your name";
				return false;
		}
	else if(!x.match(holPattern))                                                               
		document.getElementById("errorname").innerHTML="Enter correct name";
	else
		document.getElementById("errorname").innerHTML="";

	
}
function cvvValidation()
{
	var x=document.getElementById("cvvnum").value;
	var cvvPattern="^[0-9]{3}$";
		if(x==0||x==null)
		document.getElementById("errorcvv").innerHTML="Enter your CVV";
	else if(!x.match(cvvPattern))                                                               
		document.getElementById("errorcvv").innerHTML="Enter correct CVV";
	else
		document.getElementById("errorcvv").innerHTML="";
}
function dateValidation()
{
	var x=document.getElementById("dt&time").value;
	if(x==0||x==null)
		document.getElementById("errordate").innerHTML="Enter your expiry date";
    else
		document.getElementById("errordate").innerHTML="";
}
function paymentValidation()
{
	var x = cardValidation();
	var y = cardholderValidation();
	var z = cvvValidation();
	var q = dateValidation()
	if(x && y && z && q)
		return true;
	else 
		return false;
}