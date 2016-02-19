 'use strict';

angular.module('ratethestitchApp')
    .factory('notificationInterceptor', function ($q, AlertService) {
        return {
            response: function(response) {
                var alertKey = response.headers('X-ratethestitchApp-alert');
                if (angular.isString(alertKey)) {
                    AlertService.success(alertKey, { param : response.headers('X-ratethestitchApp-params')});
                }
                return response;
            }
        };
    });
