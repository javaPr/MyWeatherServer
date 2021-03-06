/**
 * 
 */
'use strict';
//var helloAjaxApp = angular.module("MobileAngularUiExamples", []);

app.controller("myCtrl", [ '$scope', '$http', function($scope, $http) {

	$http.defaults.headers.post["Content-Type"] = "application/x-www-form-urlencoded; charset=utf-8";
	
	$scope.sendPost = function() {
		console.log($scope.name);
		$http({
			url : 'MyServlet',
			method : "POST",
			data : {
				'name' : $scope.name
			}
		}).then(function(response) {
			console.log(response.data);
			$scope.message = response.data;
		}, function(response) {
			//fail case
			console.log(response);
			$scope.message = response.config.data.name;
		});

	};
} ]);