/**
 * 
 */
'use strict';
app.controller('releaseCtrl',['$scope','$http',function($scope,$http){
	$scope.activity={
			share:'',
			detail:'',
			time:''
	}
	
	$scope.release = function(activity){
		console.log(activity);
		$http({
			method : "POST",
			url : "PublishServlet",
			params : {
				password : $scope.activity.share,
				email : $scope.activity.detail
			}
		}).success(function(data) {
			console.log(data);
			//alert("保存成功！！");
		}).error(function() {
			alert("调用后台方法失败！！");
		});
	}
}]);
//app.controller("signCtrl",['$scope','$http',function($scope,$http){