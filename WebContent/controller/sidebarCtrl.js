/**
 * 
 */
'use strict';
app.controller("sidebarCtrl",['$scope','$http','$window',function($scope,$http,$window){
	$scope.user={
			email:'',
			password:''
	}
 /*	$scope.login = function(user){
		console.log(user);
		$http({
			method : "POST",
			url : "LoginServlet",
			params : {
				password : $scope.user.password,
				email : $scope.user.email
			}
		}).success(function(data) {
			console.log(data);
			if(data.login =='1'){
				console.log("log is 1")
			}
			if(data.login == 1){
				console.log("is number 1")
			}
			console.log(data.login)
			if(data.username =='admin' && data.login == 1){
				
				alert("hello");
				console.log($window.username);
			}
			$scope.isLogin();
			//alert("保存成功！！");
		}).error(function() {
			console.log("调用后台方法失败！！");
		});
			
	}*/
	
	$scope.isLogin = function(){
		if(!$window.username){
			
			return false;
		}
		if($window.username =="admin" && $window.userlogin == "logined"){
			return true;
		}
		return false;
		
	}
	
	
}]);
/*app.controller("actiCtrl",['$scope', '$http',function($scope,$http){
	$scope.activity={*/