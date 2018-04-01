var studentApp = angular.module('StudentApp', [ 'ngRoute', 'smart-table' ])

.config(function($routeProvider) {
	$routeProvider.when('/', {
		templateUrl : 'app/StudentApp/view/StudentForm.html',
		controller : 'StudentCtrl'
	}).when('/welcome', {
		templateUrl : 'app/StudentApp/view/welcome.html'
	}).otherwise({
		templateUrl : 'app/StudentApp/view/StudentForm.html',
		controller : 'StudentCtrl'
	});
})

.run(function($window) {})

.constant("RESOURCE", (function() {
	return {
		projectName : ""
	}
})());