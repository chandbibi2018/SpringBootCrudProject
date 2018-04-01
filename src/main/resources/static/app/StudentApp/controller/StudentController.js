/**
 * 
 */

studentApp.controller('StudentCtrl', function($scope, StudentService) {

	$scope.student = {};

	$scope.students = [];
	$scope.result="";
	$scope.ip=0;
	$scope.studentFormButton = {
		title : "Add",
		icon : "fa fa-plus",
		method : "add"
	};

	$scope.getlocation = function() {

		StudentService.getIPlocation($scope.ip).then(function(data) {
			alert(JSON.stringify(data));
			alert(data.results[0]);
			
		});
	}

	StudentService.getStudentList().then(

	function(data) {
		$scope.students = data;
		$scope.studentsSafeList = data;
	},

	function(data) {
	});

	$scope.reset = function() {

		$scope.student = {
			studentName : '',
			studentAge : ''
		};

		$scope.StudentForm.$setUntouched();

		$scope.studentFormButton = {
			title : "Add",
			icon : "fa fa-plus",
			method : "add"
		};
	};

	$scope.edit = function(student) {

		$scope.student = student;

		$scope.studentFormButton = {
			title : "Update",
			icon : "fa fa-save",
			method : "update"
		};
	};

	$scope.add = function() {

		StudentService.insertStudent($scope.student).then(

		function(data) {
			$scope.students = data;
			$scope.studentsSafeList = data;
		},

		function(data) {
		});

		$scope.student = {
			studentName : '',
			studentAge : ''
		};

		$scope.StudentForm.$setUntouched();

		$scope.studentFormButton = {
			title : "Add",
			icon : "fa fa-plus",
			method : "add"
		};
	};

	$scope.update = function() {

		StudentService.updateStudent($scope.student).then(

		function(data) {
			$scope.students = data;
			$scope.studentsSafeList = data;
		},

		function(data) {
		});

		$scope.student = {
			studentName : '',
			studentAge : ''
		};

		$scope.StudentForm.$setUntouched();

		$scope.studentFormButton = {
			title : "Add",
			icon : "fa fa-plus",
			method : "add"
		};
	};

	$scope.remove = function(student) {

		StudentService.deleteStudent(student).then(

		function(data) {
			$scope.students = data;
			$scope.studentsSafeList = data;
		},

		function(data) {
		});

		$scope.student = {
			studentName : '',
			studentAge : ''
		};

		$scope.StudentForm.$setUntouched();

		$scope.studentFormButton = {
			title : "Add",
			icon : "fa fa-plus",
			method : "add"
		};
	};

});