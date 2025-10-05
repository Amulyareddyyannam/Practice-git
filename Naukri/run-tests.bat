@echo off
mvn clean test -Dtest=testRunner.TestRunner -Dcucumber.filter.tags="@home_02"