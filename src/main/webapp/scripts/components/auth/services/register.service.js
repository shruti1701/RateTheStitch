'use strict';

angular.module('ratethestitchApp')
    .factory('Register', function ($resource) {
        return $resource('api/register', {}, {
        });
    });


