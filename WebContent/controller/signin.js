/**
 * 
 */
'use strict';
app.controller("signCtrl",['$scope','$http',function($scope,$http){
	$scope.user={
			email:'',
			password:''
	}
	
	
	$scope.login = function(user){
		console.log(user);
		$http({
			method : "POST",
			url : "LoginServlet",
			params : {
				password : $scope.user.password,
				email : $scope.user.email
			}
		}).success(function(data) {
			alert("保存成功！！");
		}).error(function() {
			alert("调用后台方法失败！！");
		});
			
			
		
		/*$http({
			url : 'LoginServlet',
			method : "POST",
			headers: {
	            'Content-Type': 'application/x-www-form-urlencoded; charset=UTF-8'
	        },
	        data: $scope.user
			
		}).then(function(response) {
			console.log(response.data);
			 
		}, function(response) {
			//fail case
			console.log(response.data);
		});*/
	}
	
	
}]);
/*app.controller("actiCtrl",['$scope', '$http',function($scope,$http){
	$scope.activity={*/