@pushd %~dp0
@cd..
call java -Dspring.aot.enabled=true -agentlib:native-image-agent=config-output-dir=target/image-agent-config-output -jar target/demo-0.0.1-SNAPSHOT.jar
@popd