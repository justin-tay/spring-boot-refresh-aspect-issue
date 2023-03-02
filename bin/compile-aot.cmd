@pushd %~dp0
@cd..
call mvn -Pnative clean package
@popd