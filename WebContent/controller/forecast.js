/**
 * 
 */
'use strict';
app.controller("forecastCtrl",['$scope','$http',function($scope,$http){

	
	$http({
		method : "GET",
		url : "FutureServlet",
	}).success(function(response) {
		console.log(response);
		
		$scope.now = response;
			
	}).error(function() {
		console.log("调用后台方法失败！！");
	});
	
	$http({
		method : "GET",
		url : "NextFiveDayServlet"
	}).success(function(data){
		console.log(data);
		$scope.weatherList = data;
	}).error(function(){
		console.log("FAIL");
	});
	
	$scope.setMyclass 
	
	
	
}]);
