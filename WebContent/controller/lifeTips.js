/**
 * 
 */
'use strict';
app.controller("lifeTipsCtrl",['$scope','$http',function($scope,$http){

	
	$http({
		method : "GET",
		url : "LifeTipsServlet",
	}).success(function(response) {
		console.log(response);
		$scope.clothes = response;
		console.log($scope.clothes.clothes_1);
			
	}).error(function() {
		console.log("调用后台方法失败！！");
	});
	
	$http({
		method : "GET",
		url : "CautionServlet",
	}).success(function(response) {
		console.log(response);
		$scope.caution = response;
		console.log($scope.caution.caution_3);
			
	}).error(function() {
		console.log("调用后台方法失败！！");
	});
	
	$http({
		method : "GET",
		url : "EquipServlet",
	}).success(function(response) {
		console.log(response);
		$scope.equip = response;
		console.log($scope.equip.equip_2);
			
	}).error(function() {
		console.log("调用后台方法失败！！");
	});
	
	
	
	
}]);