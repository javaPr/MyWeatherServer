/**
 * 
 */
'use strict';
app.controller('releaseCtrl',['$scope','$http','$location',function($scope,$http,$location){
	$scope.activity={
			share:'',
			detail:'',
			time:'',
			title:''
	}
	
	$scope.release = function(activity){
		console.log(activity);
		//activity.time = $scope.activity.time+""
		$http({
			method : "POST",
			url : "PublishServlet",
			params : {
				share : $scope.activity.share,
				detail : $scope.activity.detail,
				title : $scope.activity.title,
				time : activity.time
			}
		}).success(function(data) {
			console.log(data);
			if(data.success == 1){
				alert("ok");
				$location.path('/activities');
			}else{
				alert("fail");
			}
			//alert("保存成功！！");
		}).error(function() {
			alert("调用后台方法失败！！");
		});
	}
}]);
//app.controller("signCtrl",['$scope','$http',function($scope,$http){