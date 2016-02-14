@echo off
rem mvn-test.bat
if not exist logs md logs
mvn test -Pp10 | tee logs/mvn-test.txt
