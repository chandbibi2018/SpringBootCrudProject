/**
 * 
 */

studentApp.filter("StudentAgeFilter", function() {
	return function(age) {
		if(age >= 18){
			return "Eligible";
		}
		else{
			return "Not Eligible";
		}
	};
});