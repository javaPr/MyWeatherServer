/**
 * 
 */
'use strict';
app.controller("actiCtrl",['$scope', '$http',function($scope,$http){
	$scope.activity={
			name:'this is name',
			content:'this is content',
			time:'this is time'
	}
	console.log("hello");
	console.log($scope.activity);
	$scope.listActivity = [];
	
	$http({
		url : 'ActivityServlet',
		method : "GET",
	}).then(function(response) {
		console.log(response.data);
		$scope.message = response.data;
		$scope.listActivity = response.data;
	}, function(response) {
		//fail case
		console.log(response);
		$scope.message = response.config.data.name;
	});
	
}]);
