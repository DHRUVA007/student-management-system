@echo off
call: main


:login
setlocal
set /p id=enter the roll number-
set /p firstName=enter the firstName-
set /p lastName=enter the lastName-
set /p email=enter the email-
set /p phone=enter the phone_number-

set  URL=http://localhost:8081/blog/login
set  data={\"id\":%id%,\"firstName\":\"%firstName%\",\"lastName\":\"%lastName%\",\"contact\":{\"email\":\"%email%\",\"phone_number\":\"%phone%\"}}
set request=POST
for /L %%i in (1,1,1) DO ( 
curl -X %request% %URL% -d "%data%" -H "Content-Type: application/json"
)
endlocal
goto:eof



:main
call :login
echo I am in Main
goto:eof

