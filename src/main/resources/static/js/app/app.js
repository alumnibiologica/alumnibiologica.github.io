'use strict'

var websiteApp = angular.module('website', [ 'ui.bootstrap', 'website.controllers',
		'website.services' ]);
websiteApp.constant("CONSTANTS", {
	getUserByIdUrl : "/user/getUser/",
	getAllUsers : "/user/getAllUsers",
	saveUser : "/user/saveUser"
});