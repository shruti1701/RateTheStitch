'use strict';

angular.module('ratethestitchApp')
    .controller('BookController', function ($scope, $state, Book) {

        $scope.books = [];
        $scope.loadAll = function() {
            Book.query(function(result) {
               $scope.books = result;
            });
        };
        $scope.loadAll();


        $scope.refresh = function () {
            $scope.loadAll();
            $scope.clear();
        };

        $scope.clear = function () {
            $scope.book = {
                title: null,
                id: null
            };
        };
    });
