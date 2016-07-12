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
	
}]);
