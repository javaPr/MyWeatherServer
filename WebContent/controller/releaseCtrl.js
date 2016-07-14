/**
 * 
 */
'use strict';
app.controller('releaseCtrl',['$scope','$http',function($scope,$http){
	$scope.activity={
			share:'',
			detail:'',
			time:'',
			title:''
	}
	
	$scope.release = function(activity){
		console.log(activity);
		$http({
			method : "POST",
			url : "PublishServlet",
			params : {
				share : $scope.activity.share,
				detail : $scope.activity.detail,
				title : $scope.activity.title,
				time : $scope.activity.time
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