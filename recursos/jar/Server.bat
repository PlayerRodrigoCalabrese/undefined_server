@echo off
:loop
title Undefined EMU - SERVER
"C:\Program Files\BellSoft\LibericaJRE-14\bin\java.exe" -Dlogback.configurationFile=logback.xml -Xmx1024M -jar server.jar -o true
goto loop
PAUSE
