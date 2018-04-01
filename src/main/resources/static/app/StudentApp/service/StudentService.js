/**
 * 
 */

studentApp.service('StudentService', function($http, $q, RESOURCE) {

	this.getStudentList = function() {
		return $http({
			method : 'POST',
			url : RESOURCE.projectName + "getStudentList"
		}).then(

		function(response) {
			if (typeof response.data === 'object') {
				return response.data;
			} else {
				return $q.reject(response.data);
			}
		},

		function(response) {
			return $q.reject(response.data);
		});
	}
	
	this.insertStudent = function(student) {
		return $http({
			method : 'POST',
			url : RESOURCE.projectName + "insertStudent",
			data : student
		}).then(

		function(response) {
			if (typeof response.data === 'object') {
				return response.data;
			} else {
				return $q.reject(response.data);
			}
		},

		function(response) {
			return $q.reject(response.data);
		});
	}
	
	
	this.updateStudent = function(student) {
		return $http({
			method : 'POST',
			url : RESOURCE.projectName + "updateStudent",
			data : student
		}).then(

		function(response) {
			if (typeof response.data === 'object') {
				return response.data;
			} else {
				return $q.reject(response.data);
			}
		},

		function(response) {
			return $q.reject(response.data);
		});
	}
	
	this.deleteStudent = function(student) {
		return $http({
			method : 'POST',
			url : RESOURCE.projectName + "deleteStudent",
			data : student
		}).then(

		function(response) {
			if (typeof response.data === 'object') {
				return response.data;
			} else {
				return $q.reject(response.data);
			}
		},

		function(response) {
			return $q.reject(response.data);
		});
	}

});