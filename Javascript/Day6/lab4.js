/**
 * 
 */
function Company(){
	this.emparr=new Array();

	this.add = add
	this.print = print;
	
	function add(e){
		this.emparr.push(e);
	}

	function print(){
		var str ="<table border='1'>";
		str+= "<tr><th>Empno</th>	<th>Name</th>		<th>salary</th>		<th>email</th>		</tr>";
		for (var i = 0;i < this.emparr.length;i++){
			var e = this.emparr[i];
			str+= "<tr><td>" + e.empno +"</td>" + 
						"<td>" + e.ename + "</td>"  +
						"<td>" + e.salary + "</td>" + 
						"<td>" + e.email + "</td></tr>";
		}
		str += "</table>";
		return str;
	}
	
}

function Emp(empno, ename, salary, email){
		this.empno=empno;
		this.ename=ename;
		this.salary=salary;
		this.email=email;		
}
